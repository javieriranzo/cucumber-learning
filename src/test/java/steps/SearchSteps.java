package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {

	WebDriver webDriver;

	@Given("the user enters in the index page")
	public void userEntersIndexPage() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		webDriver = new ChromeDriver();
		webDriver.navigate().to("https://testingqarvn.com.es/datos-personales/");
	}

	@When("the user enters his or her data in the contact form")
	public void userEntersPersonalDataInContactForm() {
		webDriver.findElement(By.id("wsf-1-field-21")).sendKeys("Francisco Javier");
		webDriver.findElement(By.id("wsf-1-field-22")).sendKeys("Iranzo Rebenaque");
		webDriver.findElement(By.id("wsf-1-field-23")).sendKeys("javieriranzo92@gmail.com");
		webDriver.findElement(By.id("wsf-1-field-24")).sendKeys("+34666999333");
		webDriver.findElement(By.id("wsf-1-field-28")).sendKeys("Evergreen Terrace, 42, Springfield");
	}

	@When("the user submit  button")
	public void userClicksSubmitButton() {
		webDriver.findElement(By.id("wsf-1-field-27")).click();
	}

	@Then("the user is registred")
	public void userIsRegistred() {
	}

}
