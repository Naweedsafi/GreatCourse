package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.BasePage;

public class LoginPage extends BasePage {
	
	@Given("^User click on Sign in Element$")
	public void user_click_on_Sign_in_Element() throws Throwable {
	    wrapper.clickWebElement(login.getSinginByXpath());
	    wrapper.customWait(4000);}

	@Then("^User click on Create an Account$")
	public void user_click_on_Create_an_Account() throws Throwable {
		wrapper.clickWebElement(login.getCreateAccountByXpath());
		wrapper.customWait(4000);}

	@Then("^User send keys FirstName$")
	public void user_send_keys_FirstName() throws Throwable {
	    wrapper.enterTextField(login.getFirstNaeByXpath(), "Ahmad");
	    wrapper.customWait(4000);}

	@Then("^User send keys LastName$")
	public void user_send_keys_LastName() throws Throwable {
		wrapper.enterTextField(login.getLastNameByXpath(), "Mahmood");}

	@Then("^User send keys email$")
	public void user_send_keys_email() throws Throwable {
	   wrapper.enterTextField(login.getEmailByXpath(),"Ahmad" + wrapper.getCurrentTime() + "@gmail.com");
	   wrapper.customWait(4000);}

	@Then("^User send keys Password$")
	public void user_send_keys_Password() throws Throwable {
	    wrapper.enterTextField(login.getPasswordByXpath(), "ABC@123");
	    wrapper.customWait(4000);
	}

	@Then("^User send keys Confirm Password$")
	public void user_send_keys_Confirm_Password() throws Throwable {
	    wrapper.enterTextField(login.getConfirmPasswordByXpath(), "ABC@123");
	    wrapper.customWait(4000);
	}

	@Then("^User click on Term and Services$")
	public void user_click_on_Term_and_Services() throws Throwable {
	    wrapper.clickWebElement(login.getTermServiceByXpath());
	    wrapper.switch_Window(1);
	    wrapper.customWait(5000);
	    wrapper.switch_Window(0);
	    wrapper.customWait(5000);
	}

	@Then("^User Check the box of Term and Services$")
	public void user_Check_the_box_of_Term_and_Services() throws Throwable {
		wrapper.clickWebElement(login.getTermServiceCheckBoxByXpath());
		wrapper.customWait(4000);
	}

	@Then("^User click on Create Account Button$")
	public void user_click_on_Create_Account_Button() throws Throwable {
		wrapper.clickWebElement(login.getCreateAccountButtonByXpath());
		wrapper.customWait(5000);
	   
	}

}
