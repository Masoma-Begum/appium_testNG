package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
    AppiumDriver<MobileElement> driver;	
    
    @BeforeTest
	public void calculatorTest() throws Exception {
	DesiredCapabilities cap = new DesiredCapabilities();
	
	//cap.setCapability("newCommandTimeout", 5000);
	
	//Thread.sleep(5000);
	
	cap.setCapability("deviceName", "Galaxy M01 Core"); //From mobile settings
	cap.setCapability("udid", "R58NC3GXD2F"); //adb devices command
	cap.setCapability("platformName", "Android"); //From mobile settings
	cap.setCapability("platformVersion", "10"); //From mobile settings
	cap.setCapability("automationName", "UiAutomator2");// install "appium driver install uiautomator2" if show automationName can not be blank.
	
	cap.setCapability("appPackage", "com.sec.android.app.popupcalculator"); //installing APK info app check details
    cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
   
    URL url = new URL("http://127.0.0.1:4723/");// From Appium run command
	driver = new AppiumDriver<MobileElement>(url,cap);
	
} 
	 @AfterTest
	  public void teardown() throws Exception {
		  Thread.sleep(5000);
		  driver.quit();
		  
	  }


}
