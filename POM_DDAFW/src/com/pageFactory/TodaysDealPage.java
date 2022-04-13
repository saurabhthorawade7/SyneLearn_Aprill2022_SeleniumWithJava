package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage {

	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[36]/div/label/input")
	public WebElement music;
	
	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[3]/div/label/input")
	public WebElement automative;
	
	@FindBy(xpath="//*[@id=\"slot-15\"]/div/div/div[2]/div[2]/span[3]/span/div[2]/div[27]/div/label/input")
	public WebElement kitchen;
	
	public void selectcheck(String checkbox){
		if(checkbox.equalsIgnoreCase("music")){
			music.click();
		}else if(checkbox.equalsIgnoreCase("automative")){
			automative.click();
		}else if(checkbox.equalsIgnoreCase("kitchen")){
			kitchen.click();
		}
	}

	}

