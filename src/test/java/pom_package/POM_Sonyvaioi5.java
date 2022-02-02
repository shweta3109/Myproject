package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Shopping.Base_Shopping;

public class POM_Sonyvaioi5 extends Base_Shopping {
	@FindBy(css="#tbodyid > div.row > div > a")
	WebElement AddToCartbtn;
	
	
	//initiate page elements
	public POM_Sonyvaioi5() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void displayAddToCartbtn() {
		boolean verify=AddToCartbtn.isDisplayed();
		System.out.println(verify);
		}
	public void clickAddToCartbtn() {
		AddToCartbtn.click();
		
		}
	
		public String verify1()
		{
			return driver.getTitle();
		}
	}




