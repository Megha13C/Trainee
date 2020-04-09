package suites;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tstsuite {
	
	@BeforeSuite
	public void Suite() {
		System.out.println("open google chrome");
		
	}
	@BeforeTest
	public void Suite1() {
		System.out.println("Search for the url");
	}
	@Test(priority=2)
	public void Suite2() {
		System.out.println("Click on the required website");
		
	}
	@AfterTest
	public void Suite3() {
		System.out.println("Hurray..! i found it");
	}
@AfterSuite
public void Suite4() {
	System.out.println("close all the tabs");
}
}
