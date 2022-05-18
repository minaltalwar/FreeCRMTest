package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	//td[contains(text(),'User: min t')]
	
	@FindBy(xpath="//td[contains(text(),'User: min t')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
		//Initialize the Page Objects
		public HomePage(){
			PageFactory.initElements(driver, this);   // this means its pointing to current class objects like username , password , loginBtn etc
		}
		
		//verify home page title
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		//click on contacts link
		public ContactsPage clickOnContactsLink(){
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink(){
			contactsLink.click();
			return new DealsPage();
		}
		
		
}
