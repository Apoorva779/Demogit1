package MyFirstSel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingSelScript 
{

	public static void main(String[] args) throws InterruptedException
	{
		String pa1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pa1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 System.out.println("Fill the Rehuba Airlines Booking form");
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/bookingusha.html");
		Select dropDown1=new Select(driver.findElement(By.id("input-group1")));
		dropDown1.selectByIndex(2);
		Select dropDown2=new Select(driver.findElement(By.id("input-group2")));
		dropDown2.selectByIndex(3);
		Select dropDown3=new Select(driver.findElement(By.id("input-group3")));
		dropDown3.selectByIndex(2);
		Select dropDown4=new Select(driver.findElement(By.id("input-group4")));
		dropDown4.selectByIndex(2);
		Select dropDown5=new Select(driver.findElement(By.id("adult")));
		dropDown5.selectByIndex(7);
		Select dropDown6=new Select(driver.findElement(By.id("Children")));
		dropDown6.selectByIndex(4);
		Select dropDown7=new Select(driver.findElement(By.id("infant")));
		dropDown7.selectByIndex(1);
		WebElement radio1=driver.findElement(By.id("rad2"));
		Boolean selectState=radio1.isSelected();
		if(selectState == false) 
		{
			radio1.click();
		}
//		WebElement radio2=driver.findElement(By.id("rd2"));
//		radio2.click();
		WebElement arrival=driver.findElement(By.id("Arrival"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.id("Departure"));
		departure.sendKeys("17022022");
		driver.findElement(By.id("first")).sendKeys("Apoo");
		driver.findElement(By.id("last")).sendKeys("shaiva");
		WebElement dob1=driver.findElement(By.id("date"));
		dob1.sendKeys("12022022");
		driver.findElement(By.id("email")).sendKeys("shaiva@123.com");
		driver.findElement(By.id("phn")).sendKeys("2345678987");
		driver.findElement(By.id("sub"));
//		driver.switchTo().alert();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		driver.navigate().to("file:///C:/Users/itctesting23/Desktop/Updated%20pro/last.html");
		Thread.sleep(3000);
       driver.close();

	}	 

}
