package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Shopping.Base_Shopping;

public class POM_Signup extends Base_Shopping {
	@FindBy(id="sign-username")
	WebElement UsernameSignup;
	@FindBy(id="sign-password")
	WebElement PasswordSignup;
	@FindBy(css="#signInModal > div > div > div.modal-footer > button.btn.btn-primary")
	WebElement Signupbtn ;
	@FindBy(css="#signInModal > div > div > div.modal-footer > button.btn.btn-secondary")
	WebElement ClosebtnSignup;
	@FindBy(css="#signInModal > div > div > div.modal-header > button > span")
	WebElement closeboxbtnSignup;
	
	//initiate page elements
	public POM_Signup() {
		
		PageFactory.initElements(driver,this);
		
	}
	public void typeusernameSignup(String name) {
		UsernameSignup.sendKeys(name);
	}
	public void typepasswordSignup(String Pass) {
		PasswordSignup.sendKeys(Pass);
	}
	public void clickSignupbtn() {
		Signupbtn.click(); 
		}
	public void clickclosebtnSignup() {
		ClosebtnSignup.click(); 
		}
	public void clickcloseboxbtnSignup() {
		closeboxbtnSignup.click(); 
		}
	
	}



