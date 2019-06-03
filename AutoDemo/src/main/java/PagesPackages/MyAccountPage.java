package PagesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement searchtextbox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")
	WebElement prodlink;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addtocartbtn;
	
	@FindBy(xpath="//b[contains(text(),'Cart')]")
	WebElement cartbtn;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchAndAddtocart() throws InterruptedException {
		searchtextbox.sendKeys("T-shirts");
		searchbtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(prodlink).click().build().perform();
		Thread.sleep(20);
		addtocartbtn.click();
		
	}
	
	public void ClickCartbtn() {
		cartbtn.click();
		
	}

}
