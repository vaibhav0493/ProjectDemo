package locators;

import org.openqa.selenium.WebElement;

public class GetElement {
	
	public static ThreadLocal<WebElement> webElement = new ThreadLocal<WebElement>();
	
	public static WebElement getAnElement(WebElement element) {
		webElement.set(element);
		return webElement.get();
	}

}
