package appium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
      WebDriver driver;
	   @DataProvider(name = "browsers" )
	    public Object[][] netSpeeds() {
	        return new Object[][] {
	            { "Chrome" },
	            { "EDG" }
	         
	        };
	    }
	    
	    @Test(testName = "testSpeed", dataProvider =  "browsers")
	    public void testSpeed(String browser) throws IOException{
	    	switch (browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Browsername is invalid");
				break;
			}
	    	driver.get("http://facebook.com");
	        }
	            
	       
	        
	    
	    }


