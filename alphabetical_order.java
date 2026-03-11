package day_01;

import org.testng.annotations.Test;

public class alphabetical_order {

	
	@Test (priority = 2, groups = "Functional")
	public void login() {
		System.out.println("test the login");
	}
	
	@Test (priority = 1, groups = "Functional") 
	public void checkout() {
		System.out.println("test the checkout button");
	}
	@Test (priority = 1, groups = "Adhoc")
	public void double_tap() {
		System.out.println("double tapping payment button");
	}
	@Test (priority = 3, groups = "NonFunctional")
	public void performance() {
		System.out.println("testing the performance of the application");
	}
	@Test (priority = 1, groups =  "UITest")
	public void fontandstyle() {
		System.out.println("checking the font style of the application");
	}

}
