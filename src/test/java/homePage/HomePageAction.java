package homePage;

import org.openqa.selenium.WebDriver;

import CommonLib.BaseClass;

public class HomePageAction extends BaseClass {

	HomePageRepo homepage ;
	String email = "vaibhav.nagpal@gmail.com";
	
	public HomePageAction(WebDriver driver) {
		homepage = new HomePageRepo(driver);
	}
	
	public void clickSignIn() {
		homepage.signIn().click();
	}
	
	public void enterEmail() {
		homepage.emailId().sendKeys(email);
	}
	
	public void clickCreateButton() {
		homepage.createButton().click();
	}
	
}
