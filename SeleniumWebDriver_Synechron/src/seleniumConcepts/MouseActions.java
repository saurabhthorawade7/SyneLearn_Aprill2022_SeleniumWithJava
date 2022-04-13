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

public class MouseActions {


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

		driver.get("https://www.drikpanchang.com/"); //open url
		driver.manage().window().maximize(); // maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//mouse over on panchang
		WebElement panchang = driver.findElement(By.xpath("//*[@id=\"dp-menu\"]/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(panchang).build().perform();
		WebElement kp = driver.findElement(By.xpath("//*[@id=\"dp-menu\"]/li[3]/div[2]/div[2]/a[5]"));
		action.click(kp).build().perform();
		System.out.println("Title ="+driver.getTitle());
		
		//Scroll down and scroll up
				WebElement pandit = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[8]/img"));
			
				//scroll down
				/*
				 * action.moveToElement(pandit).build().perform(); Thread.sleep(3000); //scroll
				 * up action.moveToElement(panchang).build().perform(); Thread.sleep(3000);
				 */
				//scroll down by keyboard Action
				for(int i=1;i<=10;i++){
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
					Thread.sleep(1000);
				}
				//scroll up by keyboard Action
				for(int i=1;i<=10;i++){
					action.sendKeys(Keys.ARROW_UP).build().perform();
					Thread.sleep(1000);
				}

			
				action.contextClick(panchang).build().perform();



		
}
}
