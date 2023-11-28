package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	//Select gender Radio Button
	@FindBy (id = "gender-male")
	WebElement genderRdBtn;

	//First Name Text Box
	@FindBy(id ="FirstName")
	WebElement fntxtBox;

	//Last Name Text Box
	@FindBy (id = "LastName")
	WebElement lntxtBox;

	//Email Text Box
	@FindBy (id = "Email")
	WebElement emailtxtBox;

	//Password Text Box
	@FindBy (id = "Password")
	WebElement passtxtBox;

	//Confirm Password Text Box
	@FindBy (id = "ConfirmPassword")
	WebElement confirmPasswordtxtBox;

	//Registration Button
	@FindBy (id = "register-button")
	WebElement registerBtn;

	//Success Message 
	@FindBy (css = "div.result")
	public WebElement successMsg;

	//User Enters His Data For Register
	public void userRegistration(String firstname, String lastname, String email, String password) 
	{
		clickbutton(genderRdBtn);
		fillTextElementBox(fntxtBox, firstname);
		fillTextElementBox(lntxtBox, lastname);
		fillTextElementBox(emailtxtBox, email);
		fillTextElementBox(passtxtBox, password);
		fillTextElementBox(confirmPasswordtxtBox, password);
		clickbutton(registerBtn);
	}
}
