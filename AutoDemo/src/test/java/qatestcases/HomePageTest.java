package qatestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.TestBase;

public class HomePageTest extends TestBase{
	
@BeforeMethod
public void setup() {
	initialization();
}
	
@Test
public void TestCase1() {
	System.out.println("Thank GOD");
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
