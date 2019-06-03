package qatestcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesPackages.HomePage;
import PagesPackages.LoginPage;
import PagesPackages.RegistrationPage;
import basepackage.TestBase;


public class RegistrationPageTest extends TestBase {
	HomePage hp;
	RegistrationPage rp;
	LoginPage lp;
	@BeforeMethod
	public void setup() {
		initialization();
		hp = new HomePage();
		rp = new RegistrationPage();
		lp = new LoginPage();
	}
	
	
	  @Test public void RphonenumberTest() { 
	  hp.clickSigninbtn();
	  lp.clickcreateaccountbtn();
	  rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().contains("You must register at least one phone number."));
	  }
	  
	  @Test public void RlastnameTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("<b>lastname</b> is required.")); }
	  
	  @Test public void RfirstnameTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("<b>firstname</b> is required.")); }
	  
	  
	  @Test public void RpasswdTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("<b>passwd</b> is required."));
	  
	  }
	  
	  @Test public void RaddressTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("<b>address1</b> is required.")); }
	  
	  @Test public void RcityTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().contains("<b>city</b> is required.")
	  ); }
	  
	  @Test public void RpcodeTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"
	  )); }
	  
	  @Test public void RstateTest() { hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); rp.MandatoryFieldsValidation();
	  Assert.assertTrue(driver.getPageSource().
	  contains("This country requires you to choose a State.")); }
	 
	  
	  @Test(priority = 1)
	  public void UserResgistrationTest() { 
	  hp.clickSigninbtn();
	  lp.clickcreateaccountbtn(); 
	  rp.UserReg();
	  Assert.assertEquals(driver.getTitle(), "My account - My Store"); }
	 
	
	  @AfterMethod 
	  public void teardown() {
		  driver.quit(); 
		 }
	 
}
