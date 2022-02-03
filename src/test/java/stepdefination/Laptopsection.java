package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Laptopsection { WebDriver driver;
	@Given("user must be on homepage that is url {string}")
	public void user_must_be_on_homepage_that_is_url(String string) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get(string);
	}

	@Given("Click on Login button,enter the credentials")
	public void click_on_login_button_enter_the_credentials() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.id("loginusername")).sendKeys("testingklmnop");
		    driver.findElement(By.id("loginpassword")).sendKeys("testing");
	}

	@Given("Click on login button\\({int})")
	public void click_on_login_button(Integer int1) throws InterruptedException {
		driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(5000);
	}

	@When("Click on Laptop button")
	public void click_on_laptop_button() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
	    Thread.sleep(5000);
	}

	@When("Click on sony vaio i5")
	public void click_on_sony_vaio_i5() throws InterruptedException {
	    driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).click();
	    Thread.sleep(5000);
	}

	@Then("Add to cart should be displayed")
	public void add_to_cart_should_be_displayed() {
	  boolean result=driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).isDisplayed();
	  System.out.println(result);
	}


}
