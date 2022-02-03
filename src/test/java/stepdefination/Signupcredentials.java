package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signupcredentials {
	WebDriver driver;
	@Given("User should be on homepage that is url {string}")
	public void user_should_be_on_homepage_that_is_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	}

	@When("Click on Sign up button")
	public void click_on_sign_up_button() throws InterruptedException {
		driver.findElement(By.id("signin2")).click();
		 Thread.sleep(5000);
	}

	@When("Enter the value of testing and testing")
	public void enter_the_value_of_testing_and_testing() {
	    driver.findElement(By.id("sign-username")).sendKeys("testing");
	    driver.findElement(By.id("sign-password")).sendKeys("testing");
	}

	@When("Click on Signup")
	public void click_on_signup() throws InterruptedException {
	   driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	Thread.sleep(5000);}

	@Then("Alert should appear")
	public void alert_should_appear() throws InterruptedException {
	    Alert al=driver.switchTo().alert();
	    String result=al.getText();
	    
	    Thread.sleep(5000);
	    System.out.println(result);
	    al.accept();
	    driver.close();
	}

	@When("Enter the value of testingklmnop and testing")
	public void enter_the_value_of_testingklmnop_and_testing() {
		driver.findElement(By.id("sign-username")).sendKeys("testingklmnop");
	    driver.findElement(By.id("sign-password")).sendKeys("testing");
	}


}
