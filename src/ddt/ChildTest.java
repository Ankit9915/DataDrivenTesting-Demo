package ddt;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ChildTest extends TestBase {

	
	
	@Test
	public void homePage() throws IOException {
		System.out.println("I am on HomePage");
		logIn();
	}
	@AfterSuite
	public void logOut() {
		System.out.println("I am logged out");
	}
}
