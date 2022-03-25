package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonLib.BaseClass;

public class WelcomePageRepo extends BaseClass {
	
	public WelcomePageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);;
	}
	
	@FindBy(xpath="//*[@class='navigation_page']")
	public WebElement myAccount;

}
