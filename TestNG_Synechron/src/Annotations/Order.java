package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Order {

	@Test(priority=1)
	public void  login(){
		//Selenium code to Login
		System.out.println("Login");
	}
	@Test(priority=2)
	public void  composemail(){
		//Selenium code to composemail
		System.out.println("composemail");
	}
	@Test(priority=3)
	public void  Deletemail(){
		//Selenium code to Deletemail
		System.out.println("Deletemail");
	}
	@BeforeMethod 
	public void bMethod() {
		System.out.println("b1");
	}
	@AfterMethod
	public void aMethod() {
		System.out.println("a1");
	}

}
