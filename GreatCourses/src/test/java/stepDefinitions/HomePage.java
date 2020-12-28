package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.BasePage;

public class HomePage extends BasePage {
	
	@Given("^User scroll down '\"([^\"]*)\"'$")
	public void user_scroll_down(String pixels) throws Throwable {
	    wrapper.scrollingInThePageByPixels(pixels);
	}
	
	@Given("^user click on Science Catagory$")
	public void user_click_on_Science_Catagory() throws Throwable {
		wrapper.clickWebElement(home.getClickOnScience());
		wrapper.customWait(5000);
				
	}}


