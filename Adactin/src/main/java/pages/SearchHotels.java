package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotels {
	WebDriver driver;
	
	public SearchHotels(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator Reference
	public static By location_ref = By.id("location");
	public static By hotels_ref = By.id("hotels");
	public static By roomtype_ref = By.id("room_type");
	public static By noofrooms_ref = By.id("room_nos");
	public static By checkindate_ref = By.id("datepick_in");
	public static By checkoutdate_ref = By.id("datepick_out");
	public static By adultsperroom_ref = By.id("adult_room");
	public static By childroom_ref = By.id("child_room");
	public static By searchbtn_ref = By.id("Submit");
	public static By resetbtn_ref = By.id("Reset");
	
	public WebElement locate_Location_By_Id() {
		WebElement element = driver.findElement(location_ref);
		Select s1 = new Select(element);
		s1.selectByIndex(1);
		return element;

	}
	public WebElement locate_Hotels_By_Id() {
		WebElement element = driver.findElement(hotels_ref);
		Select s2 = new Select(element);
		s2.selectByVisibleText("Hotel Creek");
		return element;
	}
	public WebElement locate_Roomtype_By_Id() {
		WebElement element = driver.findElement(roomtype_ref);
		Select s3 = new Select(element);
		s3.selectByVisibleText("Double");
		return element;
	}
	
		public WebElement locate_Noofrooms_By_Id() {
			WebElement element = driver.findElement(noofrooms_ref);
			Select s4 = new Select(element);
			s4.selectByVisibleText("2 - Two");
			return element;
		}

	public WebElement locate_Checkindate_By_Id() {
		WebElement element = driver.findElement(checkindate_ref);
		return element;

	}
	
	public WebElement locate_Checkoutdate_By_Id() {
		WebElement element = driver.findElement(checkoutdate_ref);
		return element;

	}
	public WebElement locate_adultsperroom_By_Id() {
		WebElement element = driver.findElement(adultsperroom_ref);
		Select s5 = new Select(element);
		s5.selectByVisibleText("2 - Two");
		return element;

	}
	public WebElement locate_Childroom_By_Id() {
		WebElement element = driver.findElement(childroom_ref);
		Select s5 = new Select(element);
		s5.selectByVisibleText("0 - None");
		return element;
	}
	public WebElement locate_Searchbtn_By_Id() {
		WebElement element = driver.findElement(searchbtn_ref);
		return element;
	}
	public WebElement locate_Resetbtn_By_Id() {
		WebElement element = driver.findElement(resetbtn_ref);
		return element;
	}

}
