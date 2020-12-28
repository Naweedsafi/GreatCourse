package stepDefinitions;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import utility.BasePage;

public class CheckOutPage extends BasePage {
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@Given("^user click on radio Button$")
	public void user_click_on_radio_Button() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(checkout.getRadioButtonByXpath()));
	    wrapper.clickWebElement(checkout.getRadioButtonByXpath());
	    wrapper.customWait(4000);
	    
	}

	@Given("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	    wrapper.clickWebElement(checkout.getAddToCardByXpath());
	    wrapper.customWait(5000);
	}
}
