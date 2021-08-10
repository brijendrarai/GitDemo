package stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	@Given("^init background$")
	public void backgroundRun() {
		System.out.println("background tag is getting executed");
	}
	@Given("^user is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("@user is on netbanking landing page");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("@user login into application with username and password");
    }
    
    //@When("user login into application with username {string} and password {int}")
    @When("^user login into application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String userName, int password) {
       System.out.println("Username: "+ userName +"  Password: "+password);
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("@home page is populated");
    }

    @And("^cards displayed (.+)$")
    public void cards_are_displayed(String cardDisplayed) throws Throwable {
    	boolean boo = Boolean.parseBoolean(cardDisplayed);
        System.out.println("@cards are displayed: "+ boo );
        
    }
    
    @When("user signup with following details")
    public void user_signup_with_following_details(DataTable rawData) {
    	List<String> dataTable = rawData.asList();
    	System.out.println(dataTable);
    	for(String str : dataTable) {
    		System.out.println(str);
    	}
    }
    
    @Given("^this is backgournd code$")
    public void this_is_backgound() throws Throwable {
        System.out.println("baackground is executed");
    }


}
