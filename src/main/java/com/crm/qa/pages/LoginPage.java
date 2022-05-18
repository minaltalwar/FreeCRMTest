package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory - OR:

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;	
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initialize the Page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);   // this means its pointing to current class objects like username , password , loginBtn etc
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
		
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed(); // return true if Logo is available else false , isDisp;ayed return boolean so method also need to return boolean
	}
	
	public HomePage login(String un , String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage(); // return homepage class object , after clicking on login button it will return home page
	}
	
	
}
