package MyFirstSel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegSelScript
{

	public static void main(String[] args) throws InterruptedException
	{
		String pa1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pa1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/Register.html");
		driver.findElement(By.id("fname")).sendKeys("Apoo");
		driver.findElement(By.id("lname")).sendKeys("Shaiva");
		WebElement radio1=driver.findElement(By.id("female"));
		Boolean selectState=radio1.isSelected();
		if(selectState == false) 
		{
			radio1.click();
		}
		driver.findElement(By.id("mob")).sendKeys("1234567898");
		driver.findElement(By.id("email")).sendKeys("apoo123@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("876789876543");
		Select dropDown2=new Select(driver.findElement(By.id("country")));
		dropDown2.selectByIndex(3);
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("Apoo9876");
		driver.findElement(By.id("confirm-password")).sendKeys("Apoo9876");
		driver.findElement(By.id("check")).click();
		driver.findElement(By.id("register")).click();
		Thread.sleep(3000);
		driver.switchTo().alert();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().to("file:///C:/Users/itctesting23/Desktop/Mini%20project-Rehuba%20Itc%20Airlines/loginpage.html");
		driver.close();
	
		

	}

}
