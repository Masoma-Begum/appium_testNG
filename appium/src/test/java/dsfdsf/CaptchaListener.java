package dsfdsf;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class CaptchaListener extends Base implements ITestListener{
	
	 //To get this onTestFailure=> Click here> Source>override/ implement methods
		@Override
		public void onTestFailure(ITestResult result) {
		  try {
			 captureScreen(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}