package com.testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pageFactory.Homepage;
import com.pageFactory.ItemSubListPage;
import com.pageFactory.TodaysDealPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties prop;
	public static String Browser;
	public static WebDriver driver;
	
	public static Homepage hp;
	public static TodaysDealPage td ;
	public static ItemSubListPage isp;
	
	
	@BeforeSuite
	public static void OpenBrowser() throws Throwable{
		prop=new Properties();
		prop.load(new FileReader(".\\src\\com\\config\\Global.properties"));
		Browser=prop.getProperty("Browser");
		System.out.println("Browser choosen is "+Browser);
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("mozilla")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClass();
	}
	
	
	public static void initClass() {
		hp = PageFactory.initElements(driver, Homepage.class);
		td = PageFactory.initElements(driver, TodaysDealPage.class);
		isp = PageFactory.initElements(driver, ItemSubListPage.class);
		
	}
	@AfterSuite 
	public static void CloseBrowser(){
		driver.quit();
	}
	
	

}
