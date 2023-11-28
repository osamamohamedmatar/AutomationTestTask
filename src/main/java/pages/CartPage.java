package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends HomePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	//Check Page Title
	@FindBy(css = "div.page-title")
	public WebElement pageTitle;
	
	//Check Product Name
	@FindBy(css = "a.product-name")
	public WebElement productName;
	
	//Check Value Of The Product
	@FindBy(css = "span.value-summary")
	public WebElement totalPrice;
	
	//Quantity Of Product In Cart 
	@FindBy(css = "input.qty-input")
	public WebElement quantityTxtBox;

	//CheckOut For Product In Cart
	@FindBy(id = "checkout")
	WebElement checkOutBtn;
	@FindBy(id = "termsofservice")
	WebElement termsOfServiceCheckBtn;
	public void CheckOutForProductInCart() {
		clickbutton(termsOfServiceCheckBtn);
		clickbutton(checkOutBtn);
	}

}
