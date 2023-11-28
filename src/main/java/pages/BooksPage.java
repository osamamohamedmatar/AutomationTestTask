package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BooksPage extends PageBase{

	public BooksPage(WebDriver driver) {
		super(driver);
	}
	//Choose Order Of View
	@FindBy(id ="products-orderby")
	WebElement orderByList;
	
	//My Second Item Of View
	@FindBy(linkText = "Fahrenheit 451 by Ray Bradbury")
	public WebElement secondSortedItem;
	
	//My Item Add To Cart Button
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
	public WebElement addMyItemToCartBtn;
	
	//My Shopping Cart Link
	@FindBy(linkText = "shopping cart")
	WebElement myCartLink;
	
	//Select Order Of View
	public void selectMyOrder() 
	{
		select = new Select(orderByList);
		select.selectByVisibleText("Price: Low to High");
	}
	
	//Add Item To Cart
	public void addMyItemToMyCart() 
	{
		clickbutton(addMyItemToCartBtn);
	}
	
	//Open My Cart
	public void openMyCart() {
		clickbutton(myCartLink);
	}
}
