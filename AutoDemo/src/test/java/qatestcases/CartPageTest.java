package qatestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesPackages.CartPage;
import PagesPackages.HomePage;
import PagesPackages.LoginPage;
import PagesPackages.MyAccountPage;
import PagesPackages.RegistrationPage;
import basepackage.TestBase;

public class CartPageTest extends TestBase {
	HomePage hp;
	RegistrationPage rp;
	LoginPage lp;
	CartPage cp;
	MyAccountPage mp;
	
	public CartPageTest() {
		super();
	}
		
	@BeforeMethod
	public void setup() {
		initialization();
		hp = new HomePage();
		rp = new RegistrationPage();
		lp = new LoginPage();
		cp = new CartPage();
		mp = new MyAccountPage();
	}
	
	@Test
	public void ProdAddedValidation() throws InterruptedException {
		hp.clickSigninbtn();
		lp.SignIn();
		mp.SearchAndAddtocart();
		mp.ClickCartbtn();
		String proddeets = cp.GetProdDetails();
		Assert.assertEquals(proddeets, "Faded Short Sleeve T-shirts");
	}
	
	
	 @AfterMethod 
	 public void teardown() {
		 driver.quit();
		}
	 

}
