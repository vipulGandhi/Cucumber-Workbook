package ApplicationHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class EcommerceHooks
{
	@Before(order = 1)
	public void SetUpApplication(Scenario scenario)
	{
		System.out.println("Launch the browser ...");
		System.out.println("My scenario name is: " + scenario.getName());
	}
	
	// Execute only for smoke test cases
	//@Before("@Smoke")
	@Before(order = 2)
	public void SetUpDatabase()
	{
		System.out.println("Setup the database ...");
	}
	
	@BeforeStep
	public void TakeScreenshot()
	{
		System.out.println("Take Screenshot ...");
	}
	
	
	@After
	public void TearDown()
	{
		System.out.println("Quit the browser ...");
	}
}
