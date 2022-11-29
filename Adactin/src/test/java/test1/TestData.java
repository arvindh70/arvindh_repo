package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BookHotel;
import pages.BookingConfirmation;
import pages.LogIn;
import pages.SearchHotels;
import pages.SelectHotel;
import utilities.BrowserUtils;

public class TestData  {

	public static void main(String[] args) {
		
		//SETUP
		BrowserUtils util_obj= new BrowserUtils();
		util_obj.browser_setup();
		util_obj.launch_url("https://adactinhotelapp.com/");
		util_obj.maximize_window();
		WebDriver driver = util_obj.get_driver();
		
		//LOGIN PAGE
		LogIn login_obj = new LogIn(driver);
		WebElement username_ref = login_obj.locate_Username_By_Id();
		util_obj.input(username_ref, "arvindh70");
		WebElement password_ref = login_obj.locate_Pass_By_ID();
		util_obj.input(password_ref, "abc@123");
		WebElement login_btn_ref = login_obj.locate_LogIn_Btn();
		util_obj.click(login_btn_ref);
		
		//SEARCH HOTELS
		SearchHotels searchhotel_obj = new SearchHotels(driver);
		searchhotel_obj.locate_Location_By_Id();
		searchhotel_obj.locate_Hotels_By_Id();
		searchhotel_obj.locate_Roomtype_By_Id();
		searchhotel_obj.locate_Noofrooms_By_Id();
		WebElement checkin_ref = searchhotel_obj.locate_Checkindate_By_Id();
		util_obj.clear(checkin_ref);
		util_obj.input(checkin_ref, "09/02/2023");
		WebElement checkout_ref = searchhotel_obj.locate_Checkoutdate_By_Id();
		util_obj.clear(checkout_ref);
		util_obj.input(checkout_ref, "11/02/2023");
		searchhotel_obj.locate_adultsperroom_By_Id();
		searchhotel_obj.locate_Childroom_By_Id();
		WebElement Searchbtn_ref = searchhotel_obj.locate_Searchbtn_By_Id();
		util_obj.click(Searchbtn_ref);
		
		//SELECT HOTEL
		SelectHotel selecthotel_obj = new SelectHotel(driver);
		WebElement selectbtn_ref = selecthotel_obj.locate_Selectbtn_By_Id();
		util_obj.click(selectbtn_ref);
		WebElement continuebtn_ref = selecthotel_obj.locate_Continuebtn_By_Id();
		util_obj.click(continuebtn_ref);
		
		//BOOK A HOTEL
		BookHotel bookhotel_obj = new BookHotel(driver);
		WebElement firstname_ref = bookhotel_obj.locate_FirstName_By_Id();
		util_obj.input(firstname_ref, "Arvindh");
		WebElement lastname_ref = bookhotel_obj.locate_LastName_By_Id();
		util_obj.input(lastname_ref, "S");
		WebElement billingaddress_ref = bookhotel_obj.locate_BillingAddress_By_Id();
		util_obj.input(billingaddress_ref, "2/10,Coimbatore");
		WebElement creditcardnum_ref = bookhotel_obj.locate_CreditCardNum_By_Xpath();
		util_obj.input(creditcardnum_ref, "1234567890123456");
		bookhotel_obj.locate_CreditCardType_By_Id();
		bookhotel_obj.locate_ExpiryDate_Month__By_Id();
		bookhotel_obj.locate_ExpiryDate_Year_By_Id();
		WebElement ccvnum_ref = bookhotel_obj.locate_Ccvnum_By_Id();
		util_obj.input(ccvnum_ref, "123");
		WebElement booknowbtn_ref = bookhotel_obj.locate_booknowbtn_By_Id();
		util_obj.click(booknowbtn_ref);
		
		
		
		//LOGOUT
		BookingConfirmation bookconfirm = new BookingConfirmation(driver);
		WebElement logoutbtn_ref = bookconfirm.locate_Logoutbtn_by_Id();
		util_obj.click(logoutbtn_ref);
		
	
		//CLOSE
		
	
		
	}

}
