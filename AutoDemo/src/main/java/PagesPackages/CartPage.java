package PagesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//td[@class='cart_description']//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement proddet;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String GetProdDetails() {
		String productname = proddet.getText();
		return(productname);
		
	}
		

}
