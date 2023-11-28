package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;




public class CheckOutPage extends HomePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	//Ship To The Same Address CheckBox
	@FindBy(id = "ShipToSameAddress")
	public WebElement shipToSameAddressCheckBox;
	
	//First Name Text
	@FindBy(id = "BillingNewAddress_FirstName")
	public WebElement firstNameTxt;

	//Last Name Text
	@FindBy(id = "BillingNewAddress_LastName")
	public WebElement lastNameTxt;

	//Email Text
	@FindBy(id = "BillingNewAddress_Email")
	public WebElement emailTxt;

	//Countries List
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement countryList;

	//City Text 
	@FindBy(id = "BillingNewAddress_City")
	WebElement cityTxt;
	
	//First Address text
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement firstAddressTxt;
	
	//Zip Postal Code text
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipPostalTxt;

	//Phone Number Text
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneNumberTxt;

	//Confirm User Into Button
	@FindBy(css = "button.button-1.new-address-next-step-button")
	WebElement infoContinueBtn;

	//Choose Shipping Option
	@FindBy(id = "shippingoption_1")
	WebElement shippingOptionRdBtn;

	//Confirm Shipping Method 
	@FindBy(css = "button.button-1.shipping-method-next-step-button")
	WebElement shippingMethodContinueBtn;

	//Choose Payment Method
	@FindBy(id = "paymentmethod_0")
	WebElement paymentRdBtn;

	//Confirm Payment Method Button
	@FindBy(css = "button.button-1.payment-method-next-step-button")
	WebElement paymentMethodContinueBtn;
	
	//Confirm Payment Info Button
	@FindBy(css = "button.button-1.payment-info-next-step-button")
	WebElement paymentInfoContinueBtn;
	
	//Confirm Order Button
	@FindBy(css = "button.button-1.confirm-order-next-step-button")
	WebElement confirmOrderBtn;
	
	//Order Details Link
	@FindBy(linkText = "Click here for order details.")
	WebElement orderDetailsLink;
	
	//Completion Of CheckOut Button
	@FindBy(css = "button.button-1.order-completed-continue-button")
	WebElement completeOrderContinueBtn;

	//CheckOut For The Product 
	public void UserCanCheckOut() {
		select = new Select(countryList);
		select.selectByVisibleText("Egypt");
		fillTextElementBox(cityTxt, "cairo");
		fillTextElementBox(firstAddressTxt, "cairo");
		fillTextElementBox(zipPostalTxt, "11511");
		fillTextElementBox(phoneNumberTxt, "01234567890");
		clickbutton(infoContinueBtn);
		clickbutton(shippingOptionRdBtn);
		clickbutton(shippingMethodContinueBtn);
		clickbutton(paymentRdBtn);
		clickbutton(paymentMethodContinueBtn);
		clickbutton(paymentInfoContinueBtn);
		clickbutton(confirmOrderBtn);
		clickbutton(completeOrderContinueBtn);
	}
}
