package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonLib.BaseClass;
import CommonLib.Utils;
import actionPackage.HomePageAction;
import actionPackage.SignupPageAction;
import actionPackage.WelcomePageAction;
import locators.SignupPageRepo;

public class SignUp extends BaseClass {

	public WebDriver driver;
	HomePageAction homepage = new HomePageAction();
	SignupPageAction signupPage = new SignupPageAction();
	SignupPageRepo signupRepo = new SignupPageRepo(driver);
	WelcomePageAction welcomePage = new WelcomePageAction();
	Utils utils = new Utils();

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		driver = LaunchURL();
	}

	@Test(description="To verify that user should be able to do a successful signup")
	public void CreateAccount() {
		try {
			
			utils.ImplicitWait(driver, 5);

			homepage.clickSignIn();
			Thread.sleep(2000);
			homepage.enterEmail();
			homepage.clickCreateButton();
			
			signupPage.clickonMrRadioButton();
			signupPage.enterFirstname();
			signupPage.enterLastname();
			scrollDown(driver);
			signupPage.clickPassword();
			signupPage.enterPassowrd();
			//signupPage.selectBirthDay();
			//signupPage.selectBirthMonth();
			//signupPage.selectBirtYear();
			signupPage.selectNewsletterCheckbox();
			signupPage.selectOptinCheckbox();
			scrollDown(driver);
			signupPage.enterCompany();
			signupPage.enterAddress();
			signupPage.enterCity();
			signupPage.enterState();
			signupPage.enterZipcode();
			signupPage.enterMobileNumber();
			signupPage.enterAlias();
			signupPage.clickRegister();
			log.info("user registered successfully");
			
			welcomePage.verifyMyAccount();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			Assert.assertTrue(false);
		}
	}

	
}
