package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterSubs extends BasePage {

	public NewsLetterSubs(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@value='0']")
	WebElement subsYes;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement submit;

	@FindBy(xpath = "//div[contains(text(),'Success: Your newsletter subscription ')]")
	WebElement sucessMsg;

	public void clickSubs() {
		subsYes.click();
	}

	public void clickSubmit() {
		submit.click();
	}

	public String checkSuccessMsg() {
		return sucessMsg.getText();

	}

}
