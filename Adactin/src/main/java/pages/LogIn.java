package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	WebDriver driver;
	
	//Locator Reference
	public static By username_locate = By.id("username");
	public static By password_locate = By.name("password");
	public static By loginbtn_locate = By.className("login_button");
	

	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement locate_Username_By_Id() {
		WebElement element = driver.findElement(username_locate);
		return element;
	}
	
	public WebElement locate_Pass_By_ID() {
		WebElement element = driver.findElement(password_locate);
		return element;
		
	}
	public WebElement locate_LogIn_Btn() {
		WebElement element = driver.findElement(loginbtn_locate);
		 return element;
		
	}
	
	
}
