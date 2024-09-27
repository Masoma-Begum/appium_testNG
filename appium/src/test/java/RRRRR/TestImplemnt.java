package RRRRR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestImplemnt extends BaseUI {
	
	@Test(testName = "google")
	public void google() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mango",Keys.ENTER);
		}
	
	@Test(testName = "orange")
	public void orange() {
		driver.get("https://support.orangehrm.com/portal/en/signin");		
		driver.findElement(By.name("username")).sendKeys("dsf@fskf.ckdkf");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("btn big-btn primary")).sendKeys(Keys.ENTER);
		
		
		
	}
	
	
	
	
     

}