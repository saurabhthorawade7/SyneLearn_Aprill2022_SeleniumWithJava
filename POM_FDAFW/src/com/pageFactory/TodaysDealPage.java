package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage {

	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[36]/div/label/input")
	public WebElement music;
	
	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[6]/div/label/input")
	public WebElement beauty;
	
	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[11]/div/label/input")
	public WebElement computer;
	
	public void selectcheck(String checkbox){
		if(checkbox.equalsIgnoreCase("music")){
			music.click();
		}else if(checkbox.equalsIgnoreCase("beauty")){
			beauty.click();
		}else if(checkbox.equalsIgnoreCase("computer")){
			computer.click();
		}
	}


}
