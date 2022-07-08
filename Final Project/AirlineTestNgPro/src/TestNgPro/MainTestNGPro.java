package TestNgPro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MainTestNGPro
{
	public WebDriver driver;
  @Test
  public void HomePage() throws  InterruptedException
  {
	  driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/mainpage.html");
		driver.findElement(By.linkText("ABOUT US")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Click1")).click();

		driver.findElement(By.linkText("BOOKING")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Click2")).click();

		driver.findElement(By.linkText("CONTACT")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Click3")).click();

		driver.findElement(By.linkText("LOGOUT")).click();
		Thread.sleep(3000);
//		driver.navigate().to("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver(); 
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit(); 
  }

}
