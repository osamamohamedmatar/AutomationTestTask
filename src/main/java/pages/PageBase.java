package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public Select select;
	
	//Create Constructor
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Click Button Function
	protected static void clickbutton(WebElement button)
	{
		button.click();
	}
	//Fill Text Boxes Elements
	protected static void fillTextElementBox(WebElement textElement , String elementValue)
	{
		textElement.sendKeys(elementValue);
	}
	//Clear Text Boxes Elements
	protected static void clearTextElementBox(WebElement textElement) {
		textElement.clear();
	}
}
