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

public class Booking
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

	String path1="D:\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path1);
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	System.out.println("Fill the Rehuba Airlines Booking form");
	driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/bookingusha.html");
	Select dp1=new Select(driver.findElement(By.id("input-group1")));
	dp1.selectByIndex(2);
	Select dp2=new Select(driver.findElement(By.id("input-group2")));
	dp2.selectByIndex(3);
	Select dp3=new Select(driver.findElement(By.id("input-group3")));
	dp3.selectByIndex(2);
	Select dp4=new Select(driver.findElement(By.id("input-group4")));
	dp4.selectByIndex(3);
	Select dp5=new Select(driver.findElement(By.id("adult")));
	dp5.selectByIndex(10);
	//String cellval=driver.findElement(By.id("Arrival")).getText();
	WebElement arrival=driver.findElement(By.id("Arrival"));
	arrival.sendKeys("12022022");
	WebElement departure=driver.findElement(By.id("Departure"));
	departure.sendKeys("27022022");
	WebElement dob1=driver.findElement(By.id("date"));
	dob1.sendKeys("17091999");

	WebElement radioBoxSelect=driver.findElement(By.id("rad2"));
	Boolean isSelect=radioBoxSelect.isSelected();
	if (isSelect==false)
	{
	radioBoxSelect.click();
	}
	}
	 @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("Rehuba Airline Booking");
		  driver.quit();
		  
	  }
	@Test(dataProvider="getData")
	public void booking3(String first,String last,String phn,String mail)
	{


	driver.findElement(By.id("first")).sendKeys(first);
	driver.findElement(By.id("last")).sendKeys(last);
	driver.findElement(By.id("phn")).sendKeys(phn);
	driver.findElement(By.id("email")).sendKeys(mail);
	driver.findElement(By.id("sub")).click();
	driver.close();

	//drv.findElement(By.id("check")).click();
	}
	@DataProvider
	public String[][] getData() throws Exception {
	File src=new File("C:\\Users\\itctesting23\\Documents\\LoginTestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
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
