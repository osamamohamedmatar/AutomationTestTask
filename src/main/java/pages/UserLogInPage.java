package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLogInPage extends PageBase {

	public UserLogInPage(WebDriver driver) 
	{
		super(driver);
	}
	//Email Text Box
	@FindBy(id = "Email")
	WebElement emailtxtBox;

	//Password Text Box
	@FindBy(id ="Password")
	WebElement passtxtBox;

	//Login Button
	@FindBy(css = "button.button-1.login-button")
	WebElement loginButton;

	//Registered User Login 
	public void userLogin(String email, String password)
	{
		fillTextElementBox(emailtxtBox, email);
		fillTextElementBox(passtxtBox, password);
		clickbutton(loginButton);
	}
}
