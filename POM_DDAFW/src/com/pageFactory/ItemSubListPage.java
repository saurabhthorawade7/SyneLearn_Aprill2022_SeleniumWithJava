package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemSubListPage {

	@FindBy(xpath="//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/div")
	public WebElement firstiteminitemsublist;
	
	public void clickonfirstiteminitemsublist(){
		try{
		firstiteminitemsublist.click();
		}catch(Throwable t){}
	}

}
