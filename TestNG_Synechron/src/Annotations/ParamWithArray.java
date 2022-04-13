package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithArray {

	@Test(dataProvider="getdata1")
	public void testCase1(String cname, String cpwd){
		//Selenium code to login
		System.out.println(cname+" password is "+cpwd);
	}

	@DataProvider
	public Object[][] getdata1(){
		Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="Pwd1";
		
		obj[1][0]="Name2";
		obj[1][1]="Pwd2";
		
		obj[2][0]="Name3";
		obj[2][1]="Pwd3";
		
		return obj;
		
	}

}
