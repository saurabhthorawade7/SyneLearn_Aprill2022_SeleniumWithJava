package seleniumConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageClass {

	@FindBy(xpath="//*[@id=\"navbar-collapse-header\"]/div/a[1]")
	 public WebElement  login;

}
