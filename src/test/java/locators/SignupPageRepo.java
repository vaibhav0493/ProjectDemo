package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonLib.BaseClass;

public class SignupPageRepo extends BaseClass {
	
	public SignupPageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@className='page-subheading']/[@title='Your personal information']")
	private WebElement subheading;
	
	@FindBy(xpath="//*[@id='id_gender1']")
	private WebElement male;
	
	@FindBy(xpath="//*[@id='id_gender2']")
	private WebElement female;

	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email1;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//select[@name='days']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='months']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='years']")
	private WebElement year;
	
	@FindBy(xpath="//*[@id='newsletter']")
	private WebElement newsletter;
	
	@FindBy(xpath="//*[@id='optin']")
	private WebElement optin;

	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname1;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname1;
	
	@FindBy(xpath ="//input[@id='comapny']")
	private WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='alias']")
	private WebElement alias;
	
	@FindBy(xpath="//*[@name='submitAccount']")
	private WebElement register;
	
	
	
	public WebElement mrRadioButton() {
		return male;
	}
	
	public WebElement mrsRadioButton() {
		return female;
	}
	
	public WebElement firstname() {
		return firstName;
	}
	
	public WebElement lastname() {
		return lastName;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement day() {
		return day;
	}
	
	public WebElement month() {
		return month;
	}
	
	public WebElement year() {
		return year;
	}
	
	public WebElement checkboxNewsletter() {
		return newsletter;
	}
	
	public WebElement checkboxOptin() {
		return optin;
	}
	
	public WebElement firstname1() {
		return firstname1;
	}
	
	public WebElement lastname1() {
		return lastname1;
	}
	
	public WebElement company() {
		return company;
	}
	
	public WebElement address() {
		return address;
	}
	
	public WebElement city() {
		return city;
	}
	
	public WebElement state() {
		return state;
	}
	
	public WebElement zipcode() {
		return postcode;
	}
	
	public WebElement mobilePhone() {
		return mobile;
	}
	
	public WebElement alias() {
		return alias;
	}
	
	public WebElement register() {
		return register;
	}
}
