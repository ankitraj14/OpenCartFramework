package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Page Factory approach for locators
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement myAct;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement login;
	
	//Action methods interacting with Page Factory Elements
	
	public void click_Myaccount() {
		myAct.click();
	}
	
	public void click_Register() {
		register.click();
	}
	
	public void login() {
		login.click();
	}

}
