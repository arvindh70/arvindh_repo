package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectHotel {
	WebDriver driver;
	public SelectHotel(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator Reference
	public static By selectbtn_ref = By.id("radiobutton_0");
	public static By continuebtn_ref = By.id("continue");
	public static By cancelbtn_ref = By.id("cancel");
	
	public WebElement locate_Selectbtn_By_Id() {
		WebElement element = driver.findElement(selectbtn_ref);
		return element;
	}
	public WebElement locate_Continuebtn_By_Id() {
		WebElement element = driver.findElement(continuebtn_ref);
		return element;
		
		
	}
	public WebElement locate_Cancelbtn_By_Id() {
		WebElement element = driver.findElement(cancelbtn_ref);
		return element;
	}
	
	

	
}
