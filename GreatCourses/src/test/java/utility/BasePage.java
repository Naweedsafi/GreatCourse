package utility;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import pages.CheckOut;
import pages.Home;
import pages.Login;
import pages.Science;

public class BasePage {

	
	//################################################		
	//# 										 	 # 
	//# 				Page Objects		         #
	//# 										 	 # 
	//################################################

	public static final pages.searchPage searchPage = new pages.searchPage();
	public static final Home home = new Home();
	public static final Science science = new Science();
	public static final CheckOut checkout = new CheckOut();
	public static final Login login = new Login();


	// ################################################
	// # 											  #
	// #			   utility Objects                #
	// # 											  #
	// ################################################

	public static WebDriver driver;
	public static Wrapper wrapper;
	public static ConfigFileReader configProperty;
	public static BrowserSetUp browser;
	public static final ProjectSpecificSupportFunctions NLMSupportFunctions=new ProjectSpecificSupportFunctions();
	public static DatabaseManager DatabaseManager = new DatabaseManager();
	


	// ################################################
	// # 											  #
	// # 			Class Configuration               #
	// # 											  #
	// ################################################

	

	
	
	
	@BeforeClass
	public static void beforeAllTestStart() {

		configProperty = new ConfigFileReader("config.properties");
		
	
			
	  
	}
		
		
		
	@AfterClass
	public static void afterAllTestsComplete(){

		 Reporter.loadXMLConfig(new File(configProperty.readProperty("reportConfigPath")));
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		 Reporter.setSystemInfo("OS Name", System.getProperty("os.name"));
		 Reporter.setSystemInfo("OS Version", System.getProperty("os.version"));
		 Reporter.setSystemInfo("Application", configProperty.readProperty("ApplicationName"));
		 Reporter.setSystemInfo("Application", "SourceVu");
		 Reporter.setSystemInfo("Application Environment", System.getProperty("environmentT"));
		 Reporter.setSystemInfo("Build number", System.getProperty("jenkins.buildNumber"));
		 Reporter.setSystemInfo("Browser Type", browser.browserName);
	
			
	
		 if(driver!=null) {
			 driver.quit();
		 }
			

		
	}


}
