package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropEx {

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

	driver.get("https://jqueryui.com/droppable/"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//switch driver ref  to frame
	driver.switchTo().frame(0);
	//Drag and drop
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement tar = driver.findElement(By.id("droppable"));
	
	Actions action=new Actions(driver);
	//action.clickAndHold(src).moveToElement(tar).release().build().perform();
	action.dragAndDrop(src, tar).build().perform();
	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();


}
}
