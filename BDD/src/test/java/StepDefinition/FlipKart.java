package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipKart 
{
	WebDriver driver;
	@Given("User should be present in flipkart webpage")
	public void user_should_be_present_in_flipkart_webpage() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	}

	@When("User search for iphone")
	public void user_search_for_iphone() {
	   driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
	   
	}

	@Then("The search page should be dipslayed")
	public void the_search_page_should_be_dipslayed() {
	   System.out.println(driver.getTitle());
	}

}
