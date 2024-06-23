package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	
	//Action Methods 
	public void setUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void setPass(String password) {
		passWord.sendKeys(password);
	}
	
	public void login() {
		login.click();
	}

}
