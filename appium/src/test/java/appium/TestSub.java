package appium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestSub extends BaseTest {
	@Test(testName = "callSub")
	public void callSub() {
		try {
			
			
			sub();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	

public void sub() {
	MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/digit2"));
	MobileElement minus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/minus"));
	MobileElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/digit3"));
	MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/equal"));
	
	
	two.click();
	minus.click();
	three.click();
	
	String result = equal.getText();
	assertEquals(result, -1);
	
	
}
}
