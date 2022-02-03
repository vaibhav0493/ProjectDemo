package CommonLib;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BaseClass {
	
	public void ImplicitWait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void ExplicitWait(WebDriver driver, int time, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(NoSuchElementException e) {
			
		}
	}
	
	
}
