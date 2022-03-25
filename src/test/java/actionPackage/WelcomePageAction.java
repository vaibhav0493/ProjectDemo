package actionPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import CommonLib.BaseClass;
import junit.framework.Assert;
import locators.WelcomePageRepo;

public class WelcomePageAction extends BaseClass{

	public static Logger log = LogManager.getLogger(WelcomePageAction.class.getName());
	WelcomePageRepo welcomepage;
	
	public WelcomePageRepo WelcomeActionClass() {
		return new WelcomePageRepo(driver);
	}
	
	public void verifyMyAccount() {
		String account = WelcomeActionClass().myAccount.getText();
		Assert.assertEquals("My account", account);
		log.info("Reached My account page");
	}
}
