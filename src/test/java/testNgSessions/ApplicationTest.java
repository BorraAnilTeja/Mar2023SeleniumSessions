package testNgSessions;

import org.testng.annotations.BeforeSuite;

public class ApplicationTest {
	
	@BeforeSuite
	public void connectToDB() {
		System.out.println("coonecting to DB....");
	}

}
