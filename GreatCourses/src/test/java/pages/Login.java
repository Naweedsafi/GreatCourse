package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class Login extends BasePage {
	
	//	PAGE OBJECT //
	
	private final String SinginByXpath ="//div[@class='Header-Account']";
	private final String CreateAccountByXpath = "//button[@id='create-account']";
	private final String FirstNaeByXpath = "//input[@name='firstName']";
	private final String LastNameByXpath = "//input[@name='lastName']";
	private final String EmailByXpath = "//input[@name='email']";
	private final String PasswordByXpath = "//input[@name='password']";
	private final String ConfirmPasswordByXpath = "//input[@name='confirm']";
	private final String TermServiceByXpath ="//*[contains(text(),'Terms and Conditions')]";
	private final String TermServiceCheckBoxByXpath ="//input[@name='terms']";
	private final String CreateAccountButtonByXpath ="//button[@class='disabled btn btn-secondary-bright btn-block']";
	
	// 	GETTER OBJECT METHOD	//

	public WebElement getSinginByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(SinginByXpath));}
	
	public WebElement getCreateAccountByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(CreateAccountByXpath));}
	
	public WebElement getFirstNaeByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(FirstNaeByXpath));}
	
	public WebElement getLastNameByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(LastNameByXpath));}
	
	public WebElement getEmailByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(EmailByXpath));}
	
	public WebElement getPasswordByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(PasswordByXpath));}
	
	public WebElement getConfirmPasswordByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(ConfirmPasswordByXpath));}
	
	public WebElement getTermServiceByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(TermServiceByXpath));}
	
	public WebElement getTermServiceCheckBoxByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(TermServiceCheckBoxByXpath));}
	
	public WebElement getCreateAccountButtonByXpath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(CreateAccountButtonByXpath));}
	

}
