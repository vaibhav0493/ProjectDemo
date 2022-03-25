package actionPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import CommonLib.BaseClass;
import locators.GetElement;
import locators.SignupPageRepo;

public class SignupPageAction extends BaseClass {
	
	public static Logger log = LogManager.getLogger(SignupPageAction.class.getName());
	SignupPageRepo signUp;
	
	public SignupPageRepo SignupPageActionClass() {
		return new SignupPageRepo(driver);
	}
	
	public void clickonMrRadioButton() {
		GetElement.getAnElement(SignupPageActionClass().mrRadioButton()).click();
	}

	public void clickonMrsRadioButton() {
		GetElement.getAnElement(SignupPageActionClass().mrsRadioButton()).click();
	}
	
	public void enterFirstname() {
		SignupPageActionClass().firstname().sendKeys(prop.getProperty("firstname"));
	}
	
	public void enterLastname() {
		GetElement.getAnElement(SignupPageActionClass().lastname()).sendKeys(prop.getProperty("lastname"));
	}
	
	public void clickPassword() {
		GetElement.getAnElement(SignupPageActionClass().password()).click();
	}
	
	public void enterPassowrd() {
		GetElement.getAnElement(SignupPageActionClass().password()).sendKeys(prop.getProperty("pswd"));
	}
	
	public void clickBirthDay() {
		GetElement.getAnElement(SignupPageActionClass().days()).click();
	}
	
	public void selectBirthDay() {
		Select dropdown = new Select(SignupPageActionClass().day);
		dropdown.selectByValue(prop.getProperty("days_value"));
	}
	
	public void selectBirthMonth() {
		Select dropdown1 = new Select(SignupPageActionClass().months());
		dropdown1.selectByValue(prop.getProperty("month_text"));
	}
	
	public void selectBirtYear() {
		Select dropdown2 = new Select(SignupPageActionClass().years());
		dropdown2.selectByValue(prop.getProperty("year_value"));
	}
	
	public void selectNewsletterCheckbox() {
		GetElement.getAnElement(SignupPageActionClass().checkboxNewsletter()).click();
	}
	
	public void selectOptinCheckbox() {
		GetElement.getAnElement(SignupPageActionClass().checkboxOptin()).click();
	}
	
	public void enterFirstname1() {
		GetElement.getAnElement(SignupPageActionClass().firstname1()).sendKeys(prop.getProperty("firstname1"));
	}
	
	public void enterLastname1() {
		GetElement.getAnElement(SignupPageActionClass().lastname1()).sendKeys(prop.getProperty("lastname1"));
	}
	
	public void enterCompany() {
		GetElement.getAnElement(SignupPageActionClass().company()).sendKeys(prop.getProperty("company"));
	}
	
	public void enterAddress() {
		GetElement.getAnElement(SignupPageActionClass().address()).sendKeys(prop.getProperty("address"));
	}
	
	public void enterCity() {
		GetElement.getAnElement(SignupPageActionClass().city()).sendKeys(prop.getProperty("city"));
	}
	
	public void enterState() {
		GetElement.getAnElement(SignupPageActionClass().state()).sendKeys(prop.getProperty("state"));
	}
	
	public void enterZipcode() {
		GetElement.getAnElement(SignupPageActionClass().zipcode()).sendKeys(prop.getProperty("zipcode"));
	}
	
	public void enterMobileNumber() {
		GetElement.getAnElement(SignupPageActionClass().mobilePhone()).sendKeys(prop.getProperty("PhoneNumber"));
	}
	
	public void enterAlias() {
		GetElement.getAnElement(SignupPageActionClass().alias()).sendKeys(prop.getProperty("alias"));
	}
	
	public void clickRegister() {
		GetElement.getAnElement(SignupPageActionClass().register()).click();
	}
	
	
	
	
}
