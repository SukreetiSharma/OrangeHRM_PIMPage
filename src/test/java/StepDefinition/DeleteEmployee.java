package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteEmployee extends BaseClass {
    @Given("User is able to login and navigate to Pim page")
    public void User_is_able_to_login_and_navigate_to_Pim_page(){
        setup();
        obj.getUserAbleToLogin().loginPage();
    }
    @When("Click on delete Button")
    public void click_on_delete_button() {
        obj.getDeleteEmployee().ableToDeleteEmployee();
    }
    @Then("Verify User is deleted")
    public void verify_user_is_deleted() {
        obj.getUserAbleToLogout().LogOutAdmin();
        close();
    }

}
