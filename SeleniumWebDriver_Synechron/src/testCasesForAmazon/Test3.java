package testCasesForAmazon;  // click on music checkbox //

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {

	WebDriver driver;
	String Browser="chrome";
	
	@Test
	public void musicCheckbox(){
	
		SoftAssert st=new SoftAssert();
		
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver=new ChromeDriver();// open Browser
		}else if(Browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.get("https://www.amazon.com/"); //open url
		driver.manage().window().maximize(); // maximize browser
	
	
	//click on dont change
			try{
			driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
			}catch(Throwable t){}
			//click on todaysdeal
			WebElement todaysdeal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
			todaysdeal.click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//click on music checkbox
			driver.findElement(By.xpath("//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[36]/div/label/input")).click();

			//click on first item in the items list
			driver.findElement(By.xpath("//*[@id=\"slot-15\"]/div/div/div[2]/div[3]/div/div[1]/div/div/a[1]/div/div/img")).click();
			//click on first item in the items sublist
			try{
				//click on first item in the items sublist
				driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/div")).click();
				}catch(Throwable t){}

			//click on add2cart
			driver.findElement(By.id("add-to-cart-button")).click();
			//verify sucessmsg
			try{
			String text = driver.findElement(By.xpath("//*[@id=\"sw-atc-details-single-container\"]/div[2]/div/span")).getText();
			System.out.println("Actual text ="+text);
			st.assertEquals(text, "Added to Cart");
			}catch(Throwable t){
				String text = driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/span")).getText();
				System.out.println("Actual text ="+text);	
				st.assertEquals(text, "Added to Cart");
			}
			//Logout
			driver.quit(); 
			//driver.close(); //closes only current tab and window
			st.assertAll();
}
}
