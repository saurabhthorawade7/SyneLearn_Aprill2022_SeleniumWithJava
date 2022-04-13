package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RelativeAllLinks {


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
	//Retrive all links
	
	List<WebElement> li = driver.findElements(By.xpath("//a"));
	//long count = li.stream().count();
	int count = li.size();
	System.out.println("Total number of links ="+count);
	
	//li.stream().forEach(s->System.out.println(s.getText()));
	for(WebElement x : li){
		if(!x.getText().isEmpty())
		    System.out.println(x.getText());
	}

}
}