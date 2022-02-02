package testlayer;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base_Shopping.Base_Shopping;
import pom_package.Cart_Page;
import pom_package.POM_Home;
import pom_package.POM_Laptop;
import pom_package.POM_Login;
import pom_package.POM_Signup;
import pom_package.POM_Sonyvaioi5;

import testdata.Excelsheet;
public class Signup_Test extends Base_Shopping {
	POM_Signup Signupobj;
	POM_Home Home1obj;
	POM_Login login;
	POM_Laptop laptopobj;
	POM_Sonyvaioi5 Sonyvaioi5obj;
	Cart_Page cartobj;
	public Signup_Test() {
		super();
		}
	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Signup");
		
		Signupobj=new POM_Signup();
		Home1obj=new POM_Home();
		login=new POM_Login();
		laptopobj=new POM_Laptop();
		Sonyvaioi5obj=new POM_Sonyvaioi5();
		cartobj=new Cart_Page();
		}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;
	}
	@DataProvider
	public Object[][] Details1(){
		Object result1[][]=Excelsheet.readdata("Sheet2");
		return result1;
	}
	@Test(priority=1,dataProvider="Details")
	public void features(String name,String password) throws InterruptedException {
		
		Home1obj.clickSignupbtnH();
		Thread.sleep(5000);
		Signupobj.typeusernameSignup(name);
		Signupobj.typepasswordSignup(password);
		Signupobj.clickSignupbtn();
		Thread.sleep(5000);
		Alert al=driver.switchTo().alert();
	    String result=al.getText();
	    
	    Thread.sleep(5000);
	    System.out.println(result);
	    al.accept();
	}
	@Test(priority=2,dataProvider="Details1")
	public void login_parameter_test(String name1,String password1) throws InterruptedException {
	    Home1obj.clickLoginbtnH();
	    Thread.sleep(3000);
	    login.typeusername(name1);
	    login.typepassword(password1);
	    login.clickloginbtn();
	    Thread.sleep(5000);
	    Alert al=driver.switchTo().alert();
	    String result=al.getText();
	    
	    Thread.sleep(5000);
	    System.out.println(result);
	    al.accept();
	    }
	
	    @Test(priority=3)
	    public void process() throws InterruptedException {
	    	Home1obj.clickLoginbtnH();
		    Thread.sleep(3000);
		    login.typeusername(prop.getProperty("username"));
		    login.typepassword(prop.getProperty("password"));
		    login.clickloginbtn();
		    Thread.sleep(5000);	
	    Home1obj.clickLaptopbtn();
	    Thread.sleep(5000);
	    laptopobj.clickSonyvaioi5btn();
	    Thread.sleep(5000);
	     Sonyvaioi5obj.displayAddToCartbtn();
	     
	     Thread.sleep(5000);
	     Sonyvaioi5obj.clickAddToCartbtn();
	     Thread.sleep(5000);
	     Alert al1=driver.switchTo().alert();
		    String result1=al1.getText();
		     Thread.sleep(5000);
		    System.out.println(result1);
		    al1.accept();
	    Home1obj.clickCartbtn();
	    Thread.sleep(3000);
	    cartobj.displayed();
	    Thread.sleep(5000);
	    cartobj.displayed1();
	    screenshots("check");
	    
	    
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}



