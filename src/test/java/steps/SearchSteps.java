package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("the user enters in the index page")
	public void userEntersIndexPage() {
		System.out.println("Hewllo world!");
	}

	@When("the user enters the name of dress in the search bar")
	public void userEntersNameSearchBar() {

	}

	@When("the user clicks search button")
	public void userClicksSearchButton() {

	}

	@Then("the user goes to dresses page")
	public void userGoesToDressesPage() {

	}

}
