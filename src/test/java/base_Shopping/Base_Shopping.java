package base_Shopping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Timeutils;

public class Base_Shopping {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	//Step 1
	public Base_Shopping() {
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\Shweta\\Documents\\Shopping_gadgets\\src\\test\\java\\environment_variables\\configuration.properties");
		prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}}
		
		public static void initiate()
		{
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe" );
				driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Shweta\\Documents\\Selenium\\geckodriver.exe" );
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Timeutils.timepage,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		public static void screenshots(String Filename) {
			File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
		
			FileUtils.copyFile(file, new File("C:\\Users\\Shweta\\Documents\\Shopping_gadgets\\src\\test\\java\\screenshot\\screenshot"+Filename+".jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}}



