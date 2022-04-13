package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaAlertExample {

	WebDriver driver;
	String Browser="chrome";
	
	@Test
	public void javaAlert() throws InterruptedException{
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver=new ChromeDriver();// open Browser
		}else if(Browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //open url
		driver.manage().window().maximize(); // maximize browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on signin
		driver.findElement(By.name("proceed")).click();
		//Alert
		Thread.sleep(3000);
		//Alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Actual Alert text ="+alert.getText());
		alert.accept(); //Ok button
		//alert.dismiss(); //Cancel button
		
		//Enter tester inthe username
		driver.findElement(By.id("login1")).sendKeys("tester");

		
		
	}
}
