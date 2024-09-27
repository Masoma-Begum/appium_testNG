package RRRRR;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

//@Listeners({TestImplemnt.class, BaseUI.class}) To use multiple calss a listener
public class ITestListners extends BaseUI implements ITestListener{
	
 //To get this onTestFailure=> Click here> Source>override/ implement methods
	@Override
	public void onTestFailure(ITestResult result) {
	  try {
		  
		captureScreen(result.getTestContext().getName()+"_"+result.getMethod()+".jpg");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

}