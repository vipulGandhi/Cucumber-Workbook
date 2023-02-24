package StepDefinitions;

import io.cucumber.java.en.*;

public class SearchSteps
{	
	@Given("User is on Amazon login page")
    public void user_is_on_amazon_login_page()
	{
		System.out.println("User is on Amazon login page ... ");
    }

    @When("User login with valid name {string} and valid password {string}")
    //{string} is a cucumber expression. Instead of cucumber expressions, we can use regular expressions as well
    public void user_login_with_valid_name_something_and_valid_password_something(String username, String password)
    {
    	System.out.println("User login with valid name " + username + " and valid password" + password);
    }

    @When("User login with invalid name {string} and invalid password {string}")
    public void user_login_with_invalid_name_something_and_invalid_password_something(String username, String password)
    {
    	System.out.println("User login with invalid name " + username + " and invalid password" + password);
    }

    @Then("User is logged into the application {string}")
    public void user_is_logged_into_the_application_something(String booleanString)
    {
    	System.out.println("User is logged into the application " + booleanString);
    }

    @And("^The Login page redirects to users dashboard and Valid user name \"([^\"]*)\" is displayed$")
    public void the_login_page_redirects_to_users_dashboard_and_valid_user_name_something_is_displayed(String username)
    {
    	System.out.println("The Login page redirects to users dashboard and Valid user name " + username + " is displayed");
    }

    @And("Error message is displayed")
    public void error_message_is_displayed()
    {
    	System.out.println("Error message is displayed");
    }
}
