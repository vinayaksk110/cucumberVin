package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
	
	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("step 1 checking given");
	}

	@When("I search for the product with name {string} with a price {int}")
	public void i_search_for_the_product_with_name_with_a_price(String ProdName, Integer Price) {
		System.out.println("step 2 checking when"+ProdName +"price "+Price);
	}

	@Then("product wiht {string} should be displayed")
	public void product_wiht_should_be_displayed(String ProdName) {
		System.out.println("step 1 checking then"+ProdName);
	}


}
