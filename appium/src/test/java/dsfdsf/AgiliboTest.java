package dsfdsf;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgiliboTest extends Base{	@Test (testName = "PassTest")
	public void correctCredentials() {
		driver.findElement(By.id("email")).sendKeys("rafsuna@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("LoginButton")).click();
		
		driver.findElement(By.id("dropdownToggleid")).click();
		driver.findElement(By.id("dropdownSetupid")).click();
		driver.findElement(By.xpath("//a[contains(@id,'deleteUnit')]")).click();
		
//		Assert.assertTrue(driver.findElement(By.id("dasboard-tab")).isDisplayed());
//		driver.findElement(By.xpath("//a[@class='c-header-nav-link d-block w-8']")).click();
//		
	}
	
//	@Test (testName = "FaildTest")
	public void incorrectCredentials() {
		driver.findElement(By.id("email")).sendKeys("rafsuna@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("LoginButton")).click();
		Assert.assertTrue(driver.findElement(By.id("dasboard-tab")).isDisplayed());
		
	}

}
