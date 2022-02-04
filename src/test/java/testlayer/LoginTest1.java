package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pompackage.POMLogin;
import testdata.ExcelSheet;

public class LoginTest1 extends BaseHRMClass {
	POMLogin Log;
	public LoginTest1() {
		super();
		
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("login");
		Log=new POMLogin();
		}
	@Test(priority=1)
	public void Title() {
		String actual=Log.verify1();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
		
		
	}
	@Test(priority=2,dataProvider="Details")
	public void login(String name,String password) throws InterruptedException {
		Log.typeusername(name);
		
		Log.typepassword(password);
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}

