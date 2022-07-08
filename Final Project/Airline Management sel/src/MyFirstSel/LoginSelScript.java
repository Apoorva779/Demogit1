package MyFirstSel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginSelScript 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		String pa1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pa1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//Login for invalid username:
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html");
		driver.findElement(By.id("username")).sendKeys("Apoo");
		driver.findElement(By.id("password")).sendKeys("Apoo8296");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
//login for invalid password:
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html");
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("A8296");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	
//login for valid data:
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/loginpage.html");
		driver.findElement(By.id("username")).sendKeys("Apoorva07");
		driver.findElement(By.id("password")).sendKeys("Apoo8296");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		alert.accept();driver.navigate().to("file:///C:/Users/itctesting23/Desktop/Updated%20pro/mainpage.html");
		driver.close();
		

	}

}
