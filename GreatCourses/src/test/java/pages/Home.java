package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class Home extends BasePage {

	private final String clickOnScience = "//a[@class='science btn btn-block']";
	

	public WebElement getClickOnScience() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(clickOnScience));
		
	}
}
