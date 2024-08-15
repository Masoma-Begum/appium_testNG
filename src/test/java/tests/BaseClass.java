package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;





public class BaseClass{
	
	AppiumDriver driver;
	//AppiumDriver<MobileElement>driver;
	@BeforeTest
	public void setUp(){
        
		
		
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Galaxy M01 Core"); //From mobile settings
			capabilities.setCapability("udid", "R58NC3GXD2F"); //From adb devices command
			capabilities.setCapability("platformName", "Android"); //From mobile settings
			capabilities.setCapability("platformVersion", "10"); //From mobile settings
			
			capabilities.setCapability(CapabilityType.TIMEOUTS, 60);
			capabilities.setCapability("app", "");
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
			capabilities.setCapability(CapabilityType.BROWSER_VERSION, "127.0.6533.89");
		   
			
			URL url = new URL("http://127.0.0.1:4723/");
			//driver = new AppiumDriver<MobileElement>(url, capabilities);
			driver = new AppiumDriver(url, capabilities);
			
			
		} catch (Exception e) {
			System.out.println("Cause is :"+ e.getCause());
			System.out.println("Message is "+ e.getMessage());
			e.printStackTrace();
		}
		
	}

     @AfterTest   
    public void tearDown() {
    	 //close() closes only the current window on which Selenium is running automated tests.
    	 driver.close();
    	 
    	 //quit() method closes all browser windows and ends the WebDriver session.
    	 driver.quit();
    	
    }
}
