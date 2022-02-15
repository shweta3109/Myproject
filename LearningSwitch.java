import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LearningSwitch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities desired=new DesiredCapabilities();
		desired.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium"); //mobile info
		desired.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		desired.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
		desired.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		desired.setCapability(MobileCapabilityType.APP,"C:\\Users\\Shweta\\Downloads\\Android UI Designs_v1.0_apkpure.com.apk");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,desired);
		Thread.sleep(3000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView").click();

Thread.sleep(3000);
String result=driver.findElementById("com.Android.UIDesign.templates:id/textView").getText();
System.out.println(result);
	}

}
