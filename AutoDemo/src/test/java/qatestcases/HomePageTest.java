package qatestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesPackages.HomePage;
import basepackage.TestBase;

public class HomePageTest extends TestBase{
	static HomePage hp;
	
public HomePageTest() {
	super();
}
	
@BeforeMethod
public void setup() {
	initialization();
	hp = new HomePage();
}
	
@Test
public void homepagetile() {
	
	String title = hp.getTitle();
	Assert.assertEquals(title, "My Store");
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
