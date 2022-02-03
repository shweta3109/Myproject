package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
	WebDriver driver;
	@Given("user should be on homepage {string}")
	public void user_should_be_on_homepage(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	}

	@When("Click on Signup button")
	public void click_on_signup_button() throws InterruptedException {
		 driver.findElement(By.id("signin2")).click();
		 Thread.sleep(5000);
	}

	@Then("Signup box should appear")
	public void signup_box_should_appear() {
		boolean result=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	    System.out.println(result);
	}

	
	
}
