package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookHotel {
WebDriver driver;
public BookHotel(WebDriver driver) {
	this.driver = driver;
}
//Locator Reference
public static By firstname_ref = By.id("first_name");
public static By lastname_ref = By.id("last_name");
public static By billingaddress_ref = By.id("address");
public static By creditcardnum_ref = By.id("cc_num");
public static By creditcardtype_ref = By.id("cc_type");
public static By expirydatemonth_ref = By.id("cc_exp_month");
public static By expirydateyear_ref = By.id("cc_exp_year");
public static By ccvnum_ref = By.id("cc_cvv");
public static By booknowbtn_ref = By.name("book_now");
public static By cancelbtn_ref = By.name("cancel");



public WebElement locate_FirstName_By_Id() {
	WebElement element = driver.findElement(firstname_ref);
	return element;	
}

public WebElement locate_LastName_By_Id() {
	WebElement element = driver.findElement(lastname_ref);
	return element;
}

public WebElement locate_BillingAddress_By_Id() {
	WebElement element = driver.findElement(billingaddress_ref);
	return element;

}
public WebElement locate_CreditCardNum_By_Xpath() {
	WebElement element = driver.findElement(creditcardnum_ref);
	return element;
}
public WebElement locate_CreditCardType_By_Id() {
	WebElement element = driver.findElement(creditcardtype_ref);
	Select s1 = new Select(element);
	s1.selectByIndex(2);
	return element;

}
public WebElement locate_ExpiryDate_Month__By_Id() {
	WebElement element = driver.findElement(expirydatemonth_ref);
	Select s2 = new Select(element);
	s2.selectByIndex(2);
	return element;

}
public WebElement locate_ExpiryDate_Year_By_Id() {
	WebElement element = driver.findElement(expirydateyear_ref);
	Select s3 = new Select(element);
	s3.selectByVisibleText("2022");
	return element;

}
public WebElement locate_Ccvnum_By_Id() {
	WebElement element = driver.findElement(ccvnum_ref);
	return element;
}
public WebElement locate_booknowbtn_By_Id() {
	WebElement element = driver.findElement(booknowbtn_ref);
	return element;

}	
public WebElement locate_canclebtn_By_Id() {
	WebElement element = driver.findElement(cancelbtn_ref);
	return element;

}

}

