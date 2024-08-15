package tests;

import java.io.IOException;
import java.sql.Driver;

public class NetworkSpeedTest {
	private void setNetworkSpeed(String speed) throws IOException {
		Runtime.getRuntime().exec("adb shell am broadcast -a android.intent.action.ANY_INTENT_NAME --es 'speed'"+ speed);
		
	}
	
	public void testwithNetSpeed(String netSpeed) throws IOException {
		
		BaseClass bc = new BaseClass();
		bc.setUp();
		setNetworkSpeed(netSpeed);
		
		
		
	}
	
	public static void main(String[] args) {
		NetworkSpeedTest nst = new NetworkSpeedTest();
		
       try {
		nst.testwithNetSpeed("EDGE");
		nst.testwithNetSpeed("3G");
		nst.testwithNetSpeed("4G");
		nst.testwithNetSpeed("Wifi");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
       
	}

}
