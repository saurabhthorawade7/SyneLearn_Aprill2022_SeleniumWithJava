package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableDemo {

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
	driver.get("https://money.rediff.com/gainers"); //open url
	driver.manage().window().maximize(); // maximize browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebTable
	List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
	System.out.println("Total rows ="+li.size());
	li.stream().forEach(s->System.out.println(s.getText()));
	/*for(WebElement x : li){
		if(x.getText().contains("Savera Industries")){
			System.out.println("Savera Industries contains in the row "+x.getText());
			break;
		}
	}*/
}


}
