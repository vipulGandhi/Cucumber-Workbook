package StepDefinitions;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;

public class UserRegistrationSteps
{
	@Given("User is on registration page")
    public void user_is_on_registration_page()
	{
		System.out.println("User is on registration page");
    }

    @When("User enter following details [List Example]")
    public void user_enter_following_details_list(DataTable dataTable)
    {
    	List<List<String>> userDetailsList = dataTable.asLists(String.class);
    	
    	for (List<String> list : userDetailsList)
    	{
    		System.out.println("List item ... " + list);
		}
    }
    
    @When("User enter following details [Map Example]")
    public void user_enter_following_details_map(DataTable dataTable)
    {
    	List<Map<String, String>> userDetailsList = dataTable.asMaps(String.class, String.class);
    	
    	//System.out.println("List items ... " + userDetailsList);
    	// System.out.println("Map name item ... " + userDetailsList.get(0).get("name"));
    	for (Map<String, String> map : userDetailsList)
    	{
    		System.out.println("Name ... " + map.get("name"));
    		System.out.println("Email ... " + map.get("email"));
    		System.out.println("Address ... " + map.get("address"));
		}
    }

    @Then("User registration will be successfull")
    public void user_registration_will_be_successfull()
    {
    	System.out.println("User registration will be successfull");
    }
}
