package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Shopping.Base_Shopping;

public class Cart_Page extends Base_Shopping {
	@FindBy(css="#page-wrapper > div > div.col-lg-1 > button")
	WebElement PlaceOrderbtn;
	@FindBy(css="#tbodyid > tr > td:nth-child(1) > img")
	WebElement imagesonyvaioi5;
	@FindBy(xpath="/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[2]")
	WebElement Sony;
	
	public void clickPlaceOrderbtn()
	{
		PlaceOrderbtn.click();
	}
	public void displayed()
	{
		boolean idea=driver.getPageSource().contains("Sony vaio i5");
		System.out.println(idea);
		
	}
	public void displayed1()
	{
		WebElement l=driver.findElement(By.tagName("body"));
		String t = l.getText();
		System.out.println(t);
		
	}

}
