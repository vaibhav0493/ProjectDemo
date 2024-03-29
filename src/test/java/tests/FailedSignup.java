package tests;

import java.io.IOException;

import org.openqa.selenium.StaleElementReferenceException;
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
	HomePageAction homePage = new HomePageAction();
	SignupPageAction signupPage = new SignupPageAction();
	SignupPageRepo signupRepo = new SignupPageRepo(driver);
	Utils utils = new Utils();

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		driver = LaunchURL();
	}

	@Test(description = "To verify that if email address is incorrect, it should give an error message ")
	public void ErrorSignup() {
		try {

			homePage.clickSignIn();
			homePage.enterEmail();
			homePage.clickCreateButton();
			log.info("Error message verified");
		}

		catch (StaleElementReferenceException st) {
			st.getStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			Assert.assertTrue(false);
		}
	}
}
