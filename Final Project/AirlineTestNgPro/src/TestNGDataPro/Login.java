package TestNGDataPro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Login
{
	WebDriver driver;
  @Test(dataProvider="getData")
  public void Loginvalid(String username, String password) throws Exception
  {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("login")).click();
//	  Alert alert=driver.switchTo().alert();
//	  alert.accept();
	  Thread.sleep(3000);
//	  driver.findElement(By.linkText("LOGOUT")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception
  {
	  String path1="D:\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html"); 
	 
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Rehuba Airline Login");
	  driver.quit();
	  
  }


  @DataProvider
  public String[][] getData() throws Exception {
	  File src=new File("C:\\Users\\itctesting23\\Documents\\LoginTestData.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet=wb.getSheet("Sheet1");
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
