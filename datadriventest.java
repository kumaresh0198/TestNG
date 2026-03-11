package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriventest {
	WebDriver driver;
	@DataProvider(name = "urls")
	public Object[][] urls(){
		return new Object[][] {
			{"https://www.saucedemo.com/"},
			{"https://qa-practice.razvanvancea.ro/"},
			{"https://www.demoblaze.com/"}
		};
	}
		
		@BeforeMethod
		public void openbrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		@Test(dataProvider = "urls")
		public void navigate(String url) {
			driver.get(url);
		}
		@AfterMethod
		public void teardown() {
			driver.close();
		}
		
	}


