package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {

	@Test
	public void  testCase1(){
		//Selenium code to composemail
		System.out.println("composemail");
	}
	@BeforeMethod
	public void bmethod(){
		System.out.println("OpenBrowser, Enter url, Login");
	}
	@AfterClass
	public void aclass(){
		System.out.println("ShutdownServer...");
	}
	@AfterMethod
	public void amethod(){
		System.out.println("Logout,CloseBrowser");
	}
	@BeforeClass
	public void bclass(){
		System.out.println("Start server...");
	}
	
	@Test
	public void  testCase2(){
		//Selenium code to Savemail
		System.out.println("Savemail");
	}
	
	@Test
	public void  testCase3(){
		//Selenium code to Deletemail
		System.out.println("Deletemail");
	}

	
}
