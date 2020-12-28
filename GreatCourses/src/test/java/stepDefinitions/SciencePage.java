package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import utility.BasePage;

public class SciencePage extends BasePage {
	
	
	@Given("^user click on EveryDay Engineering$")
	public void user_click_on_EveryDay_Engineering() throws Throwable {
//		List<WebElement> list = driver.findElements(By.xpath("//*[@class='category-products-container']"));
//		for(WebElement alist: list) {
//		WebElement EEngineering = alist.findElement(By.xpath("//*[@alt='Everyday Engineering: Understanding the Marvels of Daily Life']"));
//		EEngineering.click();
//		}
//	}
	wrapper.clickWebElement(science.getEverydayEngineeringXPath());
	Thread.sleep(5000);
	}
	
}
