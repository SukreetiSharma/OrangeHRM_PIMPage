package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReportingMethod extends BaseClass {
    @Given("User is able to Login and navigate to Pim page")
    public void user_is_able_to_login_and_navigate_to_pim_page() {
        setup();
        obj.getUserAbleToLogin().loginPage();
    }

    @When("Go to Configuration and redirect to Reporting method Page")
    public void go_to_configuration_and_redirect_to_reporting_method_page() {
        obj.getAddReportingMethod().NavigateToConfig();
    }

    @When("Add reporting  method and fill all required Details")
    public void add_reporting_method_and_fill_all_required_details() {
        obj.getAddReportingMethod().AddDetails();
    }

    @Then("Verify Reporting method is Added and Logout")
    public void verify_reporting_method_is_added_and_logout() {
        obj.getAddReportingMethod().Verify();
        close();
    }
}
