package com.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.Homepage;
import com.pageFactory.ItemSubListPage;
import com.pageFactory.TodaysDealPage;
import com.testBase.TestBase;

public class Test3 extends TestBase {

	@Test
	public void testCase3() throws Throwable{
		//OpenBrowser();
		
		//Homepage hp=new Homepage();
		
		hp.clickondontchange();
		hp.clickontodaysdeal();
		td.selectcheck("music");
	
		isp.clickonfirstiteminitemsublist();
	
		
	//	CloseBrowser();
	}



}
