package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JSExample {

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

		driver.get("https://www.opencart.com/index.php?route=account/login"); //open url
		driver.manage().window().maximize(); // maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Javascript executor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('input-email').value=\"admin\"");
		js.executeScript("document.getElementById('input-password').value='manager'");
		js.executeScript("document.querySelector('#account-login > div.container > div > div:nth-child(1) > form > div.row > div:nth-child(1) > button.btn.btn-primary.btn-lg.hidden-xs').click()");

		
	}
}
