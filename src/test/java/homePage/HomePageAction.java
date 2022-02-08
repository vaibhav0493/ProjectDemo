package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonLib.BaseClass;

public class HomePageAction extends BaseClass {

	HomePageRepo homepage ;
	
	public HomePageAction(WebDriver driver) {
		homepage = new HomePageRepo(driver);
	}
	
	public void clickSignIn() {
		homepage.signIn().click();
	}
	
	public void enterEmail() {
		homepage.emailId().sendKeys(prop.getProperty("email"));
	}
	
	public void clickCreateButton() {
		homepage.createButton().click();
	}
	
	public String getErrorText() {
		return homepage.verifyErrorMsg().getText();
	}
	
	public WebElement enterLoginEmail() {
		return homepage.loginEmail();
	}
	
	public WebElement enterLoginPswd() {
		return homepage.loginPassword();
	}
	
	public void clickSignInButton() {
		 homepage.signInButton().click();
	}
	
}
