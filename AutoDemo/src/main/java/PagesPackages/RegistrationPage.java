package PagesPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement pwd;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement dob1;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement dob2;
	
	@FindBy(xpath=" //select[@id='years']")
	WebElement dob3;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement afname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement alname;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement comp;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement pcode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement cntry;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mnum;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement aliasadd;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement regbtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//ol")
	public
	WebElement alert;
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void MandatoryFieldsValidation() {
		regbtn.click();
			}
	public void Select_DOB(String d1, String d2, String d3 ) {
		 Select sd1=new Select(dob1);
		 sd1.selectByValue(d1);
	     Select sd2=new Select(dob2);
	     sd2.selectByValue(d2);
	     Select sd3=new Select(dob3);
	     sd3.selectByValue(d3);
	     	
	}
	
	public void UserReg() {
		fname.sendKeys("Test");
		lname.sendKeys("user");
		pwd.sendKeys(prop.getProperty("password"));
		Select_DOB("30", "6", "2001");
		address.sendKeys("Street1");
		city.sendKeys("Derby");
		Select st = new Select(state);
		st.selectByIndex(5);
		pcode.sendKeys("99501");
		Select con = new Select(cntry);
		con.selectByIndex(1);
		mnum.sendKeys("07723456764");
		aliasadd.click();
		aliasadd.sendKeys("Street1");
		regbtn.click();
	}
	
	}


