package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JqueryUIExample {

	WebDriver driver;
	String Browser="chrome";
	
	@Test
	public void jQuery() throws InterruptedException{
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver=new ChromeDriver();// open Browser
		}else if(Browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver=new FirefoxDriver();
		}
	
		driver.get("https://jqueryui.com/selectable/"); //open url
		driver.manage().window().maximize(); // maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch driver ref to frame
		//driver.switchTo().frame("demo-frame");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//click on item4
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
		//switch back driver ref to main window
		driver.switchTo().defaultContent();
		//click on droppable
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();

		
}
}