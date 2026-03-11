package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openbroswer {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void verifyWebsiteLanding() {
		driver.get("https://www.saucedemo.com/");
		String actual = driver.getCurrentUrl();
		String expected= "https://www.saucedemo.com/";
		Assert.assertEquals(actual, expected);
		System.out.println("expected: "+expected);
		System.out.println("actual: "+actual);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
