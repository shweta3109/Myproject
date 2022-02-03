package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart {
	WebDriver driver;
	@Given("User should be on homepage by clicking on url {string}")
	public void user_should_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Documents\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	}

	@Given("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		   Thread.sleep(5000);
	    
	}

	@Given("enter the login credentials")
	public void enter_the_login_credentials() {
		driver.findElement(By.id("loginusername")).sendKeys("testingklmnop");
	    driver.findElement(By.id("loginpassword")).sendKeys("testing");
	    
	}

	@Given("Click on Login Button\\({int}),click on laptop, click on sony vaio i5")
	public void click_on_login_button_click_on_laptop_click_on_sony_vaio_i5(Integer int1) throws InterruptedException {
		driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).click();
	    Thread.sleep(5000);
		
	}

	@When("click on Add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
	   Thread.sleep(3000);
	}

	@Then("Alert should appear indiacting that it is added to cart")
	public void alert_should_appear_indiacting_that_it_is_added_to_cart() throws InterruptedException {
		Alert al=driver.switchTo().alert();
	    String result=al.getText();
	    
	    Thread.sleep(5000);
	    System.out.println(result);
	    al.accept();
	    driver.close();
	}

}
