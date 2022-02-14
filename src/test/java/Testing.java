



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testing {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities desired=new DesiredCapabilities();
		desired.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium"); //mobile info
		desired.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		desired.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
		desired.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		desired.setCapability(MobileCapabilityType.APP,"C:\\Users\\Shweta\\Downloads\\The Weather Channel Radar_v10.42.0_apkpure.com.apk");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,desired);


	}

}
