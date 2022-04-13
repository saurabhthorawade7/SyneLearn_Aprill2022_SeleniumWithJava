package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigateMetods {

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
	
	
	driver.get("https://www.opencart.com/"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click on Login
	driver.findElement(By.linkText("LOGIN")).click(); //navigate to loginpage
	Thread.sleep(3000);
	System.out.println("Login page title ="+driver.getTitle());
	//navigate back
	driver.navigate().back(); //home page
	Thread.sleep(3000);
	System.out.println("Home page title ="+driver.getTitle());
	//forward to login
	driver.navigate().forward();
	Thread.sleep(3000);
	//Enter login 
	driver.findElement(By.id("input-email")).sendKeys("Srinivas");
	Thread.sleep(3000);
	//driver.navigate().refresh();
	driver.get(driver.getCurrentUrl());
	//driver.navigate().to("url");
	//driver.manage().deleteAllCookies();
	
	//print tooltip msg
	String tooltipmsg = driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img")).getAttribute("title");
	System.out.println("Tool tip msg ="+tooltipmsg);

}
}