package tests;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonLib.BaseClass;
import CommonLib.Utils;
import actionPackage.HomePageAction;
import actionPackage.SignupPageAction;
import locators.SignupPageRepo;

public class LoginCart extends BaseClass {

	public WebDriver driver;
	HomePageAction homePage = new HomePageAction();
	SignupPageAction signupPage= new SignupPageAction();
	SignupPageRepo signupRepo =  new SignupPageRepo(driver);
	Utils utils = new Utils();

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		driver = LaunchURL();
	}

	@Test(dataProvider = "getLoginData", description="To verify a successful Login")
	public void Login(String emailId, String password) {

		utils.ImplicitWait(driver, 5);

		homePage.clickSignIn();
		homePage.enterLoginEmail().sendKeys(emailId);
		homePage.enterLoginPswd().sendKeys(password);
		homePage.clickSignInButton();
		log.info("Successfully Logged In");
	}

	@DataProvider(parallel=true)
	public Object[][] getLoginData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "vaibhav.nagpal@gmail.com";
		data[0][1] = "test123";

		return data;
	}

}
