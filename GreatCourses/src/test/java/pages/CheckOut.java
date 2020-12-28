package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class CheckOut extends BasePage {
	
	private final String RadioButtonByXpath = "(//div[@class='custom-control custom-radio'])[1]";
	private final String AddToCardByXpath = "(//span[contains(text(),'Add to Cart')])[1]";
	
	public WebElement getRadioButtonByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(RadioButtonByXpath));
		
	}
	public WebElement getAddToCardByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(AddToCardByXpath));
		
	}
	
	
}
