package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSample extends BaseClass{
	
	@Test
	public void login() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mango",Keys.ENTER);
		
		
	}
}
