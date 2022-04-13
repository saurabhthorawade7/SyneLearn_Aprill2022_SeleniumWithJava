package Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreSoftAssert {

	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		String expstr="Bengalooru";
		String actstr="Bangalore";
		System.out.println("A");
		if(!expstr.equals(actstr)){
			st.fail("comparing two stings...");
		}
		System.out.println("B");
		
		st.assertAll();
}

}
