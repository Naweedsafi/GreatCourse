package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BasePage;

public class Science extends BasePage{
	
	private final String EverydayEngineeringXPath = "//*[@alt='Everyday Engineering: Understanding the Marvels of Daily Life']";

	public WebElement getEverydayEngineeringXPath() throws Exception {
		return wrapper.findApplicationObjectDynamically(By.xpath(EverydayEngineeringXPath));
	}

	
		
		 
	}

