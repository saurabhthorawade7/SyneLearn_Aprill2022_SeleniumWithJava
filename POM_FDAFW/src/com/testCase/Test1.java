package com.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.Homepage;
import com.pageFactory.ItemSubListPage;
import com.pageFactory.TodaysDealPage;
import com.testBase.TestBase;

public class Test1 extends TestBase {

	@Test
	public void testCase1() throws Throwable{
		//OpenBrowser();
		
		//Homepage hp=new Homepage();
		
		
		hp.clickondontchange();
		hp.clickontodaysdeal();
		td.selectcheck("computer");
	
		isp.clickonfirstiteminitemsublist();
	
		
	//	CloseBrowser();
	}



}
