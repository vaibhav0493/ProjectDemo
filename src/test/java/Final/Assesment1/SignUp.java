package Final.Assesment1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonLib.BaseClass;
import CommonLib.Utils;

import homePage.HomePageAction;
import signupPage.SignupPageAction;
import signupPage.SignupPageRepo;

public class SignUp extends BaseClass {
	
	WebDriver driver;
	HomePageAction homepage;
	SignupPageAction signupPage;
	SignupPageRepo signupRepo;
	Utils utils;
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		driver = LaunchURL();
	}
	
	
	@Test
	public void CreateAccount() {
		try {
		homepage = new HomePageAction(driver);
		signupRepo = new SignupPageRepo(driver);
		signupPage = new SignupPageAction(driver);
		utils = new Utils();
		
		homepage.clickSignIn();
		utils.ImplicitWait(driver, 5);
		homepage.enterEmail();
		homepage.clickCreateButton();
		utils.ImplicitWait(driver, 10);
		Assert.assertEquals("Your personal information", "Your personal information");
		signupPage.clickonMrRadioButton();
		signupPage.enterFirstname();
		signupPage.enterLastname();
		Thread.sleep(2000);
		scrollTillElementFound(signupRepo.password(),driver);
		Thread.sleep(2000);
		//signuppage.clickOnInputfield(driver, signupRepo.password());
		signupPage.clickPassword();
		signupPage.enterPassowrd();
		signupPage.clickBirthDay();
		signupPage.selectBirthDay();
		signupPage.selectBirthMonth();
		signupPage.selectBirtYear();
		signupPage.selectOptinCheckbox();
		//signuppage.enterFirstname1();
		//signuppage.enterLastname1();
		signupPage.enterCompany();
		signupPage.enterAddress();
		signupPage.enterCity();
		signupPage.enterState();
		signupPage.enterZipcode();
		scrollDown(driver);
		signupPage.enterMobileNumber();
		signupPage.enterAlias();
		signupPage.clickRegister();
		
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			Assert.assertTrue(false);
		}
	}
}
