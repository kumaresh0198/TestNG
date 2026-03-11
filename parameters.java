package day_01;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	@Test
	@Parameters({"username", "password", "screensize"})
	public void name(String username, String password, String screensize) {
		System.out.println("username is: "+ username);
		System.out.println("password is: "+ password);
		System.out.println("screensize is: "+ screensize);
	}
}
