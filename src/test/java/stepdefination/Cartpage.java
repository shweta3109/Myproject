package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cartpage {
	WebDriver driver;
	@Given("user should be on homepage with url {string}")
	public void user_should_be_on_homepage_with_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	    
	}

	@Given("click on login button,enter credentials, click on LOGIN, Click on laptop")
	public void click_on_login_button_enter_credentials_click_on_login_click_on_laptop() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.id("loginusername")).sendKeys("testingklmnop");
		    driver.findElement(By.id("loginpassword")).sendKeys("testing");
		    driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
		    Thread.sleep(5000);
	}

	@Given("click on sony vaio i5")
	public void click_on_sony_vaio_i5() throws InterruptedException {
		driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).click();
	    Thread.sleep(5000);
	    
	}

	@Given("click on Add to cart, accept alert")
	public void click_on_add_to_cart_accept_alert() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		   Thread.sleep(3000);
		   Alert al=driver.switchTo().alert();
		    String result=al.getText();
		    
		    Thread.sleep(5000);
		    System.out.println(result);
		    al.accept();
		    }

	@When("Click on cart")
	public void click_on_cart() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
	    Thread.sleep(5000);
	}

	@Then("sony vaio i5 should be displayed on cart page")
	public void sony_vaio_i5_should_be_displayed_on_cart_page() {
		boolean result=driver.findElement(By.cssSelector("#tbodyid > tr > td:nth-child(1) > img")).isDisplayed();
	    System.out.println(result);
	    driver.close();
	}

}
