package StepDef;


import PageAction.USApageAction;
import TestBase.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef extends BaseTest{
	USApageAction H;
	
	
	@Before
	public void setup() {
		initil();
		
	}


	@After
	public void quite() {
		driver.quit();
	}
@Given("^I am in home page$")
public void i_am_in_home_page() throws Throwable {
	H = new USApageAction();
}

@When("^user click on Select vehicle$")
public void user_click_on_Select_vehicle() throws Throwable {
	H.ClickSelectVehicle();
}

@Then("^user click on Shopping Tools$")
public void user_click_on_Shopping_Tools() throws Throwable {
	H.ClickShoppingTools();
}

@Then("^user click on Find a Dealer$")
public void user_click_on_Find_a_Dealer() throws Throwable {
	H.ClickFindADealer();
}
}
