package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Shopping.Base_Shopping;

public class POM_Login extends Base_Shopping  {
	@FindBy(id="loginusername")
	WebElement Username;
	@FindBy(id="loginpassword")
	WebElement Password;
	@FindBy(css="#logInModal > div > div > div.modal-footer > button.btn.btn-primary")
	WebElement Loginbtn;
	@FindBy(css="#logInModal > div > div > div.modal-footer > button.btn.btn-secondary")
	WebElement Closebtn;
	@FindBy(css="#logInModal > div > div > div.modal-header > button > span")
	WebElement closeboxbtn;
	
	//initiate page elements
	public POM_Login() {
		
		PageFactory.initElements(driver,this);
		
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String Pass) {
		Password.sendKeys(Pass);
	}
	public void clickloginbtn() {
		Loginbtn.click(); 
		}
	public void clickclosebtn() {
		Closebtn.click(); 
		}
	public void clickcloseboxbtn() {
		closeboxbtn.click(); 
		}
		public String verify1()
		{
			return driver.getTitle();
		}
	}


