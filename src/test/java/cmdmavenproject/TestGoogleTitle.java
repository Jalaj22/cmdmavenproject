package cmdmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestGoogleTitle {

	WebDriver driver ;
	SoftAssert softassert;
	
	@BeforeMethod
	public void setBrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\JAR\\SeleniumJAR\\Chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		softassert = new SoftAssert();
	}
	
	@org.testng.annotations.Test
	public void testTitle(){
		String actual =driver.getTitle();
		String expected = "Google";
		softassert.assertEquals(actual, expected);
		softassert.assertAll();
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
