package Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyExample {

	@Test(priority=1)
	public void  login(){
		SoftAssert st =new SoftAssert();
		st.assertEquals(true, true);
		//Selenium code to Login
		System.out.println("Login");
		st.assertAll();
	}
	@Test(priority=3,dependsOnMethods={"login"})
	public void  composemail(){
		SoftAssert st =new SoftAssert();
		st.assertEquals(true, false);
		//Selenium code to composemail
		System.out.println("composemail");
		st.assertAll();
	}
	@Test(priority=2,dependsOnMethods={"login","composemail"})
	public void  Deletemail(){
		//Selenium code to Deletemail
		System.out.println("Deletemail");
	}

}
