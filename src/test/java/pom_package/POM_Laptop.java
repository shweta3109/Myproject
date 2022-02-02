package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Shopping.Base_Shopping;

public class POM_Laptop extends Base_Shopping {
	@FindBy(css="#tbodyid > div:nth-child(1) > div > div > h4 > a")
	WebElement Sonyvaioi5;
	
	//initiate page elements
	public POM_Laptop() {
		
		PageFactory.initElements(driver,this);
		
	}
	
public void clickSonyvaioi5btn() {
		Sonyvaioi5.click(); 
		}
		public String verify1()
		{
			return driver.getTitle();
		}
	}



