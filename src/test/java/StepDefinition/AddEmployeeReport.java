package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class AddEmployeeReport extends BaseClass {
    @Given("user is able to login and redirect to Pim page")
    public void user_is_able_to_login_and_redirect_to_pim_page(){
        setup();
        obj.getUserAbleToLogin().loginPage();
    }

    @When("Go to Employee Report Page to add Employee Report")
    public void go_to_employee_report_page_to_add_employee_report() {
        obj.getAddReport().employeeReport();
    }

    @When("Fill all Required Details to save Report")
    public void fill_all_required_details_to_save_report() throws IOException {
        obj.getDetailsOfReports().fillDetails();
    }

    @Then("Verify Employee Report is added and Logout")
    public void verify_employee_report_is_added_and_logout() {
        close();
    }

}
