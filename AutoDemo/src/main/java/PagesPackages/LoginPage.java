package PagesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailtextbox;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createacntbtn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement semailid;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement spasswd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signinbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String LPgetTitle() {
		return(driver.getTitle());
	}
	
	public void clickcreateaccountbtn() {
		emailtextbox.sendKeys(prop.getProperty("emailadd"));	
		createacntbtn.click();
	}
	
	public void SignIn() {
		semailid.sendKeys(prop.getProperty("emailadd"));
		spasswd.sendKeys(prop.getProperty("password"));
		signinbtn.click();
	}
}
