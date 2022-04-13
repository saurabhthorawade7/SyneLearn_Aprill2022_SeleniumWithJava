package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UploadFileUsingSikuli {

	
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
		driver.get("https://pdf2doc.com/"); //open url
		driver.manage().window().maximize(); // maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on uploadfile
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/label/span")).click();
		
		//Sikuli
				Pattern p1=new Pattern("\"D:\\saurabh\\Synechron\\April2022_selenium with java\\sikuliImages\\Fname.PNG");
				Pattern p2=new Pattern("D:\\saurabh\\Synechron\\April2022_selenium with java\\sikuliImages\\open.PNG");
				
				Screen s =new Screen();
//				s.type(p1,"D:\\Synechron\\Certification\\ISMS_Saurabh_Mansing_Thorawade.pdf");
				s.paste(p1, "D:\\saurabh\\Synechron\\Certification\\ISMS_Saurabh_Mansing_Thorawade.pdf");
			
				s.click(p2);

}

}
