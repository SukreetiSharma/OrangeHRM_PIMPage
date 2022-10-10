package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class AddEmployee extends BaseClass {
    @Given("user is able to login and navigate to Pim page")
    public void user_is_able_to_login_and_navigate_to_pim_page() {
      setup();
      loginPage();
    }

    @When("Go to Employee Page to add Employee")
    public void go_to_employee_page_to_add_employee() {
        obj.getAddingEmployee().AddingEmployee();
    }

    @When("Fill all Required Details to add Employee")
    public void fill_all_required_details_to_add_employee() throws IOException {
        obj.getAddingEmployee().addDetails();
    }

    @Then("Verify Employee is added and Logout")
    public void verify_employee_is_added_and_logout() {
        obj.getAddingEmployee().Verify();
//        LogOutAdmin();
        close();
    }
}
