package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
WebDriver driver;

public void browser_setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

}

public void close_browser() {
	driver.quit();
}
public WebDriver get_driver() {
	return this.driver;
}

public void launch_url(String url) {
	driver.get(url);
}
public void maximize_window() {
	driver.manage().window().maximize();
}
public WebElement element(By locator) {
	return driver.findElement(locator);
	  
}
public void click(WebElement element) {
	 element.click();
	
}
public void input(WebElement element,String value) {
	element.sendKeys(value);
}
public void clear(WebElement element) {
	element.clear();
}


}






