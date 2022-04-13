package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TabsAndWindow {

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
	driver.get("https://www.msn.com/en-in/"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click on fb
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/ul/li[2]/a/h3")).click();
	
	Set<String> allids = driver.getWindowHandles();
	Iterator<String> it = allids.iterator();
	String mid = it.next();
	String t1 = it.next();
	//switch driver ref to tab window
	driver.switchTo().window(t1);
	//enter username for fb
	driver.findElement(By.id("email")).sendKeys("tester");
	//close tab
	driver.close();
	//switch driver ref to main window
	//driver.switchTo().defaultContent();XXXXXXXXXX
	driver.switchTo().window(mid);
	//click on booking .com
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/ul/li[3]/a/h3")).click();

}
}
