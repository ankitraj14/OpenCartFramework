package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.NewsLetterSubs;
import testBase.BaseClass;

public class NewsLetterSubsTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verifyLogin() {

		// HomePage
		HomePage h = new HomePage(driver);
		h.click_Myaccount();
		h.login();

		// LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(prop.getProperty("username"));
		lp.setPass(prop.getProperty("password"));
		lp.login();

		// MyAccountPage
		MyAccountPage mp = new MyAccountPage(driver);
		mp.clickNewsletter();
		
		//NewsSubsPage
		
		NewsLetterSubs news = new NewsLetterSubs(driver);
		news.clickSubs();
		news.clickSubmit();
		news.checkSuccessMsg();
		String msg = news.checkSuccessMsg();
		String actual = "Success: Your newsletter subscription has been successfully updated!";
		Assert.assertEquals(msg, actual);
		

	}

}
