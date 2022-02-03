package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonLib.BaseClass;

public class HomePageRepo extends BaseClass {
		
	public HomePageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	private WebElement createAccount;
	
	
	
	public WebElement signIn() {
		return signIn;
	}
	
	public WebElement emailId() {
		return email;
	}
	
	public WebElement createButton() {
		return createAccount;
	}
	

	
}
