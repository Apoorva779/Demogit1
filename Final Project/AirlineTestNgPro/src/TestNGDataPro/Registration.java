package TestNGDataPro;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

	String path1="D:\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path1);
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/Register.html");
	}
	 @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("Rehuba Airline Register");
		  driver.quit();
		  
	  }


	@Test(dataProvider="getData")
	public void reg4(String fname,String lname,String mbl,String mail,String Aadhar,String user,String pass,String conpass)
	{
	driver.findElement(By.id("fname")).sendKeys(fname);
	driver.findElement(By.id("lname")).sendKeys(lname);
	WebElement radio=driver.findElement(By.id("female"));
	radio.click();
	driver.findElement(By.id("mob")).sendKeys(mbl);
	driver.findElement(By.id("email")).sendKeys(mail);
	driver.findElement(By.id("aadhar")).sendKeys(Aadhar);
	Select dropDown=new Select(driver.findElement(By.id("country")));
	dropDown.selectByIndex(2);
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("confirm-password")).sendKeys(conpass);
	WebElement checkBoxSelect=driver.findElement(By.id("check"));
	Boolean isSelect=checkBoxSelect.isSelected();
	if (isSelect==false)
	{
	checkBoxSelect.click();
	}
	//Alert alert=driver.switchTo().alert();
	//alert.accept();
	driver.findElement(By.id("register")).click();
	
	  }
	@DataProvider
	public String[][] getData() throws Exception {
	File src=new File("C:\\Users\\itctesting23\\Documents\\LoginTestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet3");
	int Rows=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();

	String[][] data=new String[Rows-1][cols];
	for(int i=0;i<Rows-1;i++)
	{
	for(int j=0;j<cols;j++)
	{
	DataFormatter df=new DataFormatter();
	data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

	}
	System.out.println();
	}
	wb.close();
	fis.close();
	return data;

	}


}