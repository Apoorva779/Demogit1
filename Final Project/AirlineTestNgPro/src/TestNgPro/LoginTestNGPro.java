package TestNgPro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTestNGPro 
{
 
	  public WebDriver driver;
  @Test
  public void Login () throws InterruptedException
  {
	driver.findElement(By.id("username")).sendKeys("Apoorva07");
	driver.findElement(By.id("password")).sendKeys("Apoo8296");
	driver.findElement(By.id("login")).click();
	Thread.sleep(3000);
	driver.switchTo().alert();
	Alert alert = driver.switchTo().alert();
	alert.accept();
  }
  @Test
  public void LoginInvalid1 () throws InterruptedException
  {
	driver.findElement(By.id("username")).sendKeys("Apoo");
	driver.findElement(By.id("password")).sendKeys("Apoo8296");
	driver.findElement(By.id("login")).click();
	Thread.sleep(3000);
//	driver.switchTo().alert();
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
  }
  @Test
  public void LoginInvalid2 () throws InterruptedException
  {
	driver.findElement(By.id("username")).sendKeys("Apoorva07");
	driver.findElement(By.id("password")).sendKeys("87965");
	driver.findElement(By.id("login")).click();
	Thread.sleep(3000);
//	driver.switchTo().alert();
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
  }
  @BeforeMethod
  public void beforeMethod()
  {
	    String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html");
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
