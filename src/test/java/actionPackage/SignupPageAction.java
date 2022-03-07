package actionPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import CommonLib.BaseClass;
import locators.SignupPageRepo;

public class SignupPageAction extends BaseClass {
	
	
	SignupPageRepo signUp;
	
	public SignupPageAction(WebDriver driver) {
		signUp = new SignupPageRepo(driver);
	}
	
	public void clickonMrRadioButton() {
		signUp.mrRadioButton().click();
	}

	public void clickonMrsRadioButton() {
		signUp.mrsRadioButton().click();
	}
	
	public void enterFirstname() {
		signUp.firstname().sendKeys(prop.getProperty("firstname"));
	}
	
	public void enterLastname() {
		signUp.lastname().sendKeys(prop.getProperty("lastname"));
	}
	
	public void clickPassword() {
		signUp.password().click();
	}
	
	public void enterPassowrd() {
		signUp.password().sendKeys(prop.getProperty("password"));
	}
	
	public void clickBirthDay() {
		signUp.day().click();
	}
	
	public void selectBirthDay() {
		Select dropdown = new Select(signUp.day());
		dropdown.selectByVisibleText(prop.getProperty("days"));
	}
	
	public void selectBirthMonth() {
		Select dropdown1 = new Select(signUp.month());
		dropdown1.selectByVisibleText(prop.getProperty("month_text"));
	}
	
	public void selectBirtYear() {
		Select dropdown2 = new Select(signUp.year());
		dropdown2.selectByValue(prop.getProperty("year_value"));
	}
	
	public void selectNewsletterCheckbox() {
		signUp.checkboxNewsletter().click();
	}
	
	public void selectOptinCheckbox() {
		signUp.checkboxOptin().click();
	}
	
	public void enterFirstname1() {
		signUp.firstname1().sendKeys(prop.getProperty("firstname1"));
	}
	
	public void enterLastname1() {
		signUp.lastname1().sendKeys(prop.getProperty("lastname1"));
	}
	
	public void enterCompany() {
		signUp.company().sendKeys(prop.getProperty("company"));
	}
	
	public void enterAddress() {
		signUp.address().sendKeys(prop.getProperty("address"));
	}
	
	public void enterCity() {
		signUp.city().sendKeys(prop.getProperty("city"));
	}
	
	public void enterState() {
		signUp.state().sendKeys(prop.getProperty("state"));
	}
	
	public void enterZipcode() {
		signUp.zipcode().sendKeys(prop.getProperty("zipcode"));
	}
	
	public void enterMobileNumber() {
		signUp.mobilePhone().sendKeys(prop.getProperty("PhoneNumber"));
	}
	
	public void enterAlias() {
		signUp.alias().sendKeys(prop.getProperty("alias"));
	}
	
	public void clickRegister() {
		signUp.register().click();
	}
	
	
	
	
}
