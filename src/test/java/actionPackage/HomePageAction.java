package actionPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CommonLib.BaseClass;
import locators.HomePageRepo;
import locators.GetElement;

public class HomePageAction extends BaseClass {

	HomePageRepo homepage ;
	public static Logger log = LogManager.getLogger(HomePageAction.class.getName());
	
	public static ThreadLocal<WebElement> webElement = new ThreadLocal<WebElement>();

	
	public HomePageRepo HomePageActionClass() {
		return new HomePageRepo(driver);
	}
	
	public void clickSignIn() {
		GetElement.getAnElement(HomePageActionClass().signIn).click();
		log.info("Clicked on signIn");
	}
	
	public void enterEmail() {
		GetElement.getAnElement(HomePageActionClass().emailId()).sendKeys(prop.getProperty("email"));
		log.info("Email entered");
	}
	
	public void clickCreateButton() {
		GetElement.getAnElement(HomePageActionClass().createButton()).click();
		log.info("Create button clicked");
		Assert.assertEquals("Invalid email address.", GetElement.getAnElement(HomePageActionClass().verifyErrorMsg()).getText());
	}
	/*
	public String getErrorText() {
		return GetElement.getAnElement(HomePageActionClass().verifyErrorMsg()).getText();
	}
	*/
	public WebElement enterLoginEmail() {
		return GetElement.getAnElement(HomePageActionClass().loginEmail());
	}
	
	public WebElement enterLoginPswd() {
		return GetElement.getAnElement(HomePageActionClass().loginPassword());
	}
	
	public void clickSignInButton() {
		GetElement.getAnElement(HomePageActionClass().signInButton()).click();
		log.info("Sign in button clicked");
	}
	
}
