package MyFirstSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelScript {

	public static void main(String[] args) throws InterruptedException
	{
		String pa1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pa1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/itctesting23/Desktop/Updated%20pro/mainpage.html");
		driver.findElement(By.id("about")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("main")).click();
		driver.findElement(By.id("book")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("boo")).click();
		driver.findElement(By.id("details")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("det")).click();
		driver.findElement(By.linkText("LOGOUT")).click();
		driver.close();
	}

}
