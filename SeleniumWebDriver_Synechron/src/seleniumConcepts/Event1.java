package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Event1 implements WebDriverListener {

	WebDriver driver;
	int tc =0;
	public Event1(WebDriver driver){
		this.driver=driver;
	}
	public void beforeClick(WebElement element) {
		Shutterbug.shootPage(driver).withName("page"+(++tc)).save();
	}
	
	@Override
	public void afterClick(WebElement element) {
		try{
	  Alert alert = driver.switchTo().alert();
	  System.out.println("Unexpected Alert text ="+alert.getText());
	  alert.accept();
		}catch(Throwable t){}
	}


}
