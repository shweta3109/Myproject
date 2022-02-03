package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_credentials {
	WebDriver driver;
	@Given("User must be on homepage url is {string}")
	public void user_must_be_on_homepage_url_is(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	}

	@When("click on login button")
	public void click_on_login_button1() throws InterruptedException {
	   driver.findElement(By.id("login2")).click();
	   Thread.sleep(5000);
	}



	@When("Click on Login Button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	Thread.sleep(5000);
	}

	@Then("Alert should appear showing the relevant messgae")
	public void alert_should_appear_showing_the_relevant_messgae() throws InterruptedException {
		Alert al=driver.switchTo().alert();
	    String result=al.getText();
	    
	    Thread.sleep(5000);
	    System.out.println(result);
	    al.accept();
	    driver.close();
	}

	@When("enter testing and testing")
	public void enter_testing_and_testing() {
		driver.findElement(By.id("loginusername")).sendKeys("testing");
	    driver.findElement(By.id("loginpassword")).sendKeys("testing");
	    
	}

	@When("enter testingklmnop and testing1")
	public void enter_testingklmnop_and_testing1() {
		driver.findElement(By.id("loginusername")).sendKeys("testingklmnop");
	    driver.findElement(By.id("loginpassword")).sendKeys("testing1");
	    
	}

	



}
