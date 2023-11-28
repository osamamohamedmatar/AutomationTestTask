package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BooksPage;
import pages.CartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.UserLogInPage;
import pages.UserRegistrationPage;

public class AutomationTaskTest extends TestBase{

	HomePage homeObject;
	UserRegistrationPage registerObject;
	UserLogInPage loginObject;
	CartPage cartObject;
	CheckOutPage checkOutObject;
	BooksPage booksObject;
	String firstName = "osama", 
			lastName = "mohamed",
			email = "osamamohamed@test.com",
			password = "12345678",
			myItem = "Fahrenheit 451 by Ray Bradbury";

	@Test(priority = 1)
	public void UserCanRegisterToTheApplication() {
		homeObject = new HomePage(driver);
		homeObject.OpenRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration(firstName, lastName, email, password);
		Assert.assertTrue(registerObject.successMsg.isDisplayed());
	}

	@Test(priority = 2)
	public void UserCanLoginInWithThisEmail() 
	{
		homeObject = new HomePage(driver);
		homeObject.OpenLogInPage();
		loginObject = new UserLogInPage(driver);
		loginObject.userLogin(email, password);
	}

	@Test(priority = 3 )
	public void UserCanOpenBooksLinkAndChooseHisBook() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.OpenBooksLink();
		booksObject = new BooksPage(driver);
		booksObject.selectMyOrder();
		Assert.assertEquals(booksObject.secondSortedItem.getText(), myItem);
		Thread.sleep(1000);
		booksObject.addMyItemToMyCart();
		booksObject.openMyCart();
	}

	@Test(priority = 4)
	public void UserCanCheckHisProudctAtHisCart() 
	{
		cartObject = new CartPage(driver);
		Assert.assertTrue(cartObject.pageTitle.isDisplayed());
		Assert.assertTrue(cartObject.productName.getText().contains(myItem));
		Assert.assertEquals(cartObject.quantityTxtBox.getAttribute("value"), "1");
		Assert.assertEquals(cartObject.totalPrice.getText(), "$27.00");
		cartObject.CheckOutForProductInCart();
	}

	@Test(priority = 5)
	public void UserCheckOutForHisProductInCart()
	{
		checkOutObject = new CheckOutPage(driver);
		Assert.assertEquals(checkOutObject.firstNameTxt.getAttribute("value"), firstName);
		Assert.assertEquals(checkOutObject.lastNameTxt.getAttribute("value"), lastName);
		Assert.assertEquals(checkOutObject.emailTxt.getAttribute("value"), email);
		checkOutObject.UserCanCheckOut();
	}
}
