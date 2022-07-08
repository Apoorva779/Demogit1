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

public class RegisterTestNGPro
{
	public WebDriver driver;
  @Test
  public void Register() throws  InterruptedException
  {
	  driver.findElement(By.id("fname")).sendKeys("Apoo");
		driver.findElement(By.id("lname")).sendKeys("Shaiva");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("8978675656");
		driver.findElement(By.id("email")).sendKeys("apoo@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("Apoo9876");
		driver.findElement(By.id("confirm-password")).sendKeys("Apoo9876");
		WebElement checkBoxSelect=driver.findElement(By.id("check"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
      Thread.sleep(3000);
  }
  
  @Test
  public void Registerinvalid1() throws  InterruptedException
  {
	  driver.findElement(By.id("fname")).sendKeys("6789");
		driver.findElement(By.id("lname")).sendKeys("Sh89");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("8978675656");
		driver.findElement(By.id("email")).sendKeys("apoo@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("Apoo9876");
		driver.findElement(By.id("confirm-password")).sendKeys("Apoo9876");
		WebElement checkBoxSelect=driver.findElement(By.id("check"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
      Thread.sleep(3000);
  }
  
  @Test
  public void Registerinvalid2() throws  InterruptedException
  {
	  driver.findElement(By.id("fname")).sendKeys("Apoo");
		driver.findElement(By.id("lname")).sendKeys("Shaiva");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("8978675656");
		driver.findElement(By.id("email")).sendKeys("apoogmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("Apoo9876");
		driver.findElement(By.id("confirm-password")).sendKeys("Apoo9876");
		WebElement checkBoxSelect=driver.findElement(By.id("check"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
      Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/Register.html");

  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();  
  }

}
