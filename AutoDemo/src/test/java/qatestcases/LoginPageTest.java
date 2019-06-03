package qatestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesPackages.HomePage;
import PagesPackages.LoginPage;
import PagesPackages.RegistrationPage;
import basepackage.TestBase;

public class LoginPageTest extends TestBase {
	HomePage hp;
	RegistrationPage rp;
	LoginPage lp;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		hp = new HomePage();
		rp = new RegistrationPage();
		lp = new LoginPage();
		
	}
	
	@Test
	public void SigninTest() {
		hp.clickSigninbtn();
		lp.SignIn();
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
