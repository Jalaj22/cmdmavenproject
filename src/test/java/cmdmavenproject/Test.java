package cmdmavenproject;

import org.testng.asserts.SoftAssert;

public class Test {
	
	SoftAssert softassert = new SoftAssert();
	
	@org.testng.annotations.Test
	public void testTitle1(){
		System.out.println("Maven World");
	}
	
	@org.testng.annotations.Test
	public void testTitle2(){
		softassert.assertEquals(true, true);
		softassert.assertAll();
		System.out.println("title 2");
	}
	
	/*@org.testng.annotations.Test
	public void testTitle3(){
		softassert.assertEquals(false, true);
		softassert.assertAll();
		System.out.println("title 3");
	}*/

}
