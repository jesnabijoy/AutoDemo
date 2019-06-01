package PagesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestBase;

public class HomePage extends TestBase {
	
	//Elements in the home page
	
	@FindBy(xpath="//a[@class='login']")
	WebElement loginbtn;
	
	//Initialising page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return(driver.getTitle());
	}
	
	public void clickSigninbtn() {
		loginbtn.click();
	}
	
}
