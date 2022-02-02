package pom_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Shopping.Base_Shopping;

public class POM_Home extends Base_Shopping {
	@FindBy(id="nava")
	WebElement BProductStorebtn;
	@FindBy(css="#navbarExample > ul > li.nav-item.active > a")
	WebElement Home;
	@FindBy(css="#navbarExample > ul > li:nth-child(2) > a")
	WebElement Contactbtn ;
	@FindBy(css="#navbarExample > ul > li:nth-child(3) > a")
	WebElement AboutUsbtn;
	@FindBy(id="login2")
	WebElement LoginbtnH;
	@FindBy(id="signin2")
	WebElement SignupbtnH;
	
	@FindBy(css="#carouselExampleIndicators > a.carousel-control-prev > span.carousel-control-prev-icon")
	WebElement Leftarrowbtn;
	@FindBy(css="#carouselExampleIndicators > a.carousel-control-next > span.carousel-control-next-icon")
	WebElement Righttarrowbtn;
	@FindBy(id="cat")
	WebElement Categoriesbtn;
	@FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[2]")
	WebElement Phonebtn ;
	@FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[3]")
	WebElement Laptopbtn;
	@FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[4]")
	WebElement Monitorsbtn;
	@FindBy(css="#tbodyid > div:nth-child(1) > div > div > h4 > a")
	WebElement SamsungGalaxyS6btn;
	@FindBy(css="#tbodyid > div:nth-child(2) > div > div > h4 > a")
	WebElement Nokialumia1520btn;
	@FindBy(css="#tbodyid > div:nth-child(3) > div > div > h4 > a")
	WebElement Nexus6btn;
	@FindBy(css="#tbodyid > div:nth-child(4) > div > div > h4 > a")
	WebElement SamsunggalaxyS7btn;
	@FindBy(css="#tbodyid > div:nth-child(5) > div > div > h4 > a")
	WebElement iphone632gbbtn;
	@FindBy(css="#tbodyid > div:nth-child(6) > div > div > h4 > a")
	WebElement Sonyxperiaz5btn;
	@FindBy(css="#tbodyid > div:nth-child(7) > div > div > h4 > a")
	WebElement HTCOneM9btn;
	@FindBy(id="prev2")
	WebElement Previousbtn;
	@FindBy(id="next2")
	WebElement Nextbtn;
	@FindBy(id="cartur")
	WebElement Cartbtn;
	
	
	//initiate page elements
	public POM_Home() {
		
		PageFactory.initElements(driver,this);
		
	}
	public void clickBProductStorebtn() {
		BProductStorebtn.click();
	}
	public void Home() {
		Home.click();
	}
	public void clickContactbtn() {
		Contactbtn.click(); 
		}
	public void clickAboutUsbtn() {
		AboutUsbtn.click(); 
		}
	public void clickLoginbtnH() {
		LoginbtnH.click(); 
		}
	public void clickSignupbtnH() {
		SignupbtnH.click();
	}
	public void clickLeftarrowbtn() {
		Leftarrowbtn.click();
	}
	public void clickRighttarrowbtn() {
		Righttarrowbtn.click();
	}
	public void clickCategoriesbtn() {
		Categoriesbtn.click();
	}
	public void clickPhonebtn() {
		Phonebtn.click();
	}
	public void clickLaptopbtn() {
		Laptopbtn.click();
	}
	public void clickMonitorsbtn() {
		Monitorsbtn.click();
	}
	public void clickSamsungGalaxyS6btn() {
		SamsungGalaxyS6btn.click();
	}
	public void clickNokialumia1520btn() {
		Nokialumia1520btn.click();
	}
	public void clickCartbtn() {
		Cartbtn.click();
	}
	public void clickNexus6btn() {
		Nexus6btn.click();
	}
	public void SamsunggalaxyS7btn() {
		SamsunggalaxyS7btn.click();
	}
	public void clickiphone632gbbtn() {
		iphone632gbbtn.click();
	}
	public void clickSonyxperiaz5btn() {
		Sonyxperiaz5btn.click();
	}
	public void clickHTCOneM9btn() {
		HTCOneM9btn.click();
	}
	public void clickPreviousbtn() {
		Previousbtn.click();
	}
	public void clickNextbtn() {
		Nextbtn.click();
	}
		public String verify1()
		{
			return driver.getTitle();
		}
	}


