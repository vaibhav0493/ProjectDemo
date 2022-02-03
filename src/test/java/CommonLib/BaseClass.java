package CommonLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static Properties prop;
	static String workingDir = System.getProperty("user.dir");
	static WebDriver driver;
	static Date date = new Date();

	// workingDir + "//src
	@BeforeSuite
	public static void loadPropfile() throws IOException {
		try {
			File file = new File(workingDir + "//src//test//java//resources//config.properties");
			FileInputStream ip = new FileInputStream(file);

			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	public static WebDriver LaunchURL() throws IOException {
		loadPropfile();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav.nagpal\\Downloads\\automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

	public void takeScreenShotOnFailure(String testMethodName) {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir") + "\\screenshot\\" + "failedTestCase_"
					+ date.toString().replace(":", "_").replace(" ", "_") + "_" + testMethodName + "_" + ".jpg"));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250");
	}

	public static void scrollUp(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250");
	}

	public static void scrollToClick(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollTillElementFound(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	

	public static void clickOnInputfield(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

}
