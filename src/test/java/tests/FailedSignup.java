package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonLib.BaseClass;
import CommonLib.Utils;
import actionPackage.HomePageAction;
import actionPackage.SignupPageAction;
import locators.SignupPageRepo;

public class FailedSignup extends BaseClass {

	public WebDriver driver;
	HomePageAction homePage;
	SignupPageAction signupPage;
	SignupPageRepo signupRepo;
	Utils utils;

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		driver = LaunchURL();
	}

	@Test(description = "To verify that if email address is incorrect, it should give an error message ")
	public void ErrorSignup() {
		try {
			homePage = new HomePageAction(driver);
			signupRepo = new SignupPageRepo(driver);
			signupPage = new SignupPageAction(driver);
			utils = new Utils();
			utils.ImplicitWait(driver, 5);

			homePage.clickSignIn();
			homePage.enterEmail();
			homePage.clickCreateButton();
			Thread.sleep(2000);
			Assert.assertEquals("Invalid email address.", homePage.getErrorText());

			log.info("Error message verified");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			Assert.assertTrue(false);
		}
	}
}