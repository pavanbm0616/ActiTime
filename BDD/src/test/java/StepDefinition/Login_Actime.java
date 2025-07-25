package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Actime
{
	WebDriver driver;
	@Given("User should be present in {string}")
	public void user_should_be_present_in_actitime_login_page(String url) {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(url);
	   
	}

	@When("He enters the Username as {string}")
	public void he_enters_the_username(String un) {
	    driver.findElement(By.id("username")).sendKeys(un);
	}

	@And("he enters the password as {string}")
	public void he_enters_the_password(String pw) {
		driver.findElement(By.name("pwd")).sendKeys(pw);
	    
	}

	@And("he click on login button")
	public void he_click_on_login_button() {
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	  Reporter.log(driver.getTitle());  
	}
}
