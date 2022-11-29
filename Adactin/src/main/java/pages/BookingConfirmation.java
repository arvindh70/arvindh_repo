package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingConfirmation {
WebDriver driver;
public BookingConfirmation(WebDriver driver) {
	this.driver = driver;
}

//Locators Reference 
public static By logoutbtn_ref = By.id("logout");

public WebElement locate_Logoutbtn_by_Id() {
	WebElement element = driver.findElement(logoutbtn_ref);
	return element;

}

}
