package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	//Open Registration Page
	@FindBy(linkText = "Register")
	WebElement registerlink;

	public void OpenRegistrationPage() 
	{
		clickbutton(registerlink);
	}

	//Open LogIn Page
	@FindBy(linkText = "Log in")
	WebElement loginlink;

	public void OpenLogInPage() 
	{
		clickbutton(loginlink);
	}

	//Books Link
	@FindBy(linkText = "Books")
	WebElement Bookslink;

	public void OpenBooksLink() 
	{
		clickbutton(Bookslink);
	}

}
