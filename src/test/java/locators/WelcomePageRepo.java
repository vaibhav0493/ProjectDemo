package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import CommonLib.BaseClass;

public class WelcomePageRepo extends BaseClass {
	
	public WelcomePageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);;
	}

}
