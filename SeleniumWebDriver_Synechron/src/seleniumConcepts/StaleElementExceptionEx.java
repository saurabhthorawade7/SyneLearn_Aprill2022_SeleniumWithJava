package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StaleElementExceptionEx {

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
		
	driver.get("https://www.opencart.com/"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//stale element exception
	
//	WebElement login = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]"));
	PageClass p = PageFactory.initElements(driver, PageClass.class);
	
	driver.navigate().refresh(); // refresh page
	System.out.println("Text ="+p.login.getText());
	driver.navigate().refresh(); // refresh page
	System.out.println("Size ="+p.login.getSize());
	driver.navigate().refresh(); // refresh page
	p.login.click();

}
}
