package seleniumConcepts;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class TakesScreenshotExample {

	WebDriver driver;
	String Browser="chrome";
	@Test
	public void testCase1() throws Throwable{
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Screen shot
		/*File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("Testpic.png"));*/

		//Shutterbug.shootPage(driver).withName("S_Testpic").save();
				//Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE).withName("Fullpage").save();
			/*	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"))));*/
					WebElement logo = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
					//Shutterbug.shootElement(driver, logo).withName("logo").save();
					BufferedImage read = ImageIO.read(new File(".\\screenshots\\Explogo.png"));
					boolean results = Shutterbug.shootElement(driver, logo).equals(read);
					//st.assertEquals(results, true);
					st.assertTrue(results);
					
					st.assertAll();
		}

				
				

}