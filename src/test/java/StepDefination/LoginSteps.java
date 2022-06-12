package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	     System.out.println("Navigated to login URL");
	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	       System.out.println(strArg1);
	       System.out.println(strArg2);
	    }
	@Then("Home page is populated")
	public void home_page_is_populated() {
		 System.out.println("Verification Home page");
	}

	@And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
    }

}