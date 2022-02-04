package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class POMLogin extends BaseHRMClass {
	@FindBy(id="txtUsername")
	WebElement Username;
	@FindBy(id="txtPassword")
	WebElement Password;
	@FindBy(id="divLoginButton")
	WebElement Loginbtn;
	
	//initiate page elements
	public POMLogin() {
		
		PageFactory.initElements(driver,this);
		
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String Pass) {
		Password.sendKeys(Pass);
	}
	public void clickbtn() {
		Loginbtn.click(); 
		}
		public String verify1()
		{
			return driver.getTitle();
		}
	}



