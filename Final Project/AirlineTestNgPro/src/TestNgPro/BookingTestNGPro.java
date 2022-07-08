package TestNgPro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class BookingTestNGPro 
{
	public WebDriver driver;
  @Test
  public void Booking() throws  InterruptedException
  {
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
		dp5.selectByIndex(6);
		Select dp6=new Select(driver.findElement(By.id("Children")));
		dp6.selectByIndex(8);
		Select dp7=new Select(driver.findElement(By.id("infant")));
		dp7.selectByIndex(0);
		WebElement arrival=driver.findElement(By.id("Arrival"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.id("Departure"));
		departure.sendKeys("27022022");
		WebElement dob1=driver.findElement(By.id("date"));
		dob1.sendKeys("19091999");

		WebElement radioBoxSelect=driver.findElement(By.id("rad2"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}
		driver.findElement(By.id("first")).sendKeys("Apoo");
		driver.findElement(By.id("last")).sendKeys("shaiva");
		WebElement dob=driver.findElement(By.id("date"));
		dob.sendKeys("12022022");
		driver.findElement(By.id("email")).sendKeys("shaiva@123.com");
		driver.findElement(By.id("phn")).sendKeys("2345678987");
	}
  @Test
  public void Bookinginvalid1() throws  InterruptedException
  {
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
		WebElement arrival=driver.findElement(By.id("Arrival"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.id("Departure"));
		departure.sendKeys("27022022");
		WebElement dob1=driver.findElement(By.id("date"));
		dob1.sendKeys("19091999");

		WebElement radioBoxSelect=driver.findElement(By.id("rad2"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}
		driver.findElement(By.id("first")).sendKeys("Apoo");
		driver.findElement(By.id("last")).sendKeys("shaiva");
		WebElement dob=driver.findElement(By.id("date"));
		dob.sendKeys("12022022");
		driver.findElement(By.id("email")).sendKeys("shaiva567");
		driver.findElement(By.id("phn")).sendKeys("2345678987");
//		driver.switchTo().alert();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
	}
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/bookingusha.htmll");
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
