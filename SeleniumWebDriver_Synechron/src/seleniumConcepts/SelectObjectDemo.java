package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectObjectDemo {

	WebDriver driver;
	String Browser="chrome";
	
	@Test
	public void selectObject(){
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver=new ChromeDriver();// open Browser
		}else if(Browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
	driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Select
	WebElement cur = driver.findElement(By.id("curLocation"));
	
	Select s =new Select(cur);
	s.selectByIndex(7);
//	s.selectByValue("198405");
//	s.selectByVisibleText("Delhi");
	
//	driver.findElement(By.id("curLocation")).sendKeys("Chennai");

}
}
