package locators;

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
	public WebElement signIn;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	private WebElement createAccount;
	
	@FindBy(xpath="//*[contains(text(),'Invalid email address.')]")
	private WebElement errorMsg;
	
	@FindBy(id="email")
	private WebElement loginEmail;
	
	@FindBy(id="passwd")
	private WebElement loginPswd;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	private WebElement signInButton ;
	
	
	
	public WebElement signIn() {
		return signIn;
	}
	
	public WebElement emailId() {
		return email;
	}
	
	public WebElement createButton() {
		return createAccount;
	}
	
	public WebElement verifyErrorMsg() {
		return errorMsg;
	}
	
	public WebElement loginEmail() {
		return loginEmail;
	}
	
	public WebElement loginPassword() {
		return loginPswd;
	}
	
	public WebElement signInButton() {
		return signInButton;
	}

	
}
