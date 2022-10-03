package PageFactory;

import Pages.*;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static WebDriver driver;
    public LoginPage loginPage;
    public Logout LogOutAdmin;
    public AddEmployeeReport add;
    public FillReportDetails AddDetails;
    public AddEmployee Employee ;
    public AddEmployeeDetails EmployeeDetails;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getUserAbleToLogin(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public Logout getUserAbleToLogout(){
        if(LogOutAdmin == null){
            LogOutAdmin = new Logout(driver);
        }
        return LogOutAdmin;
    }


    public AddEmployeeReport getAddReport(){
        if(add == null){
            add = new AddEmployeeReport(driver);
        }
        return add;
    }

    public FillReportDetails getDetailsOfReports(){
        if(AddDetails == null){
            AddDetails = new FillReportDetails(driver);
        }
        return AddDetails;
    }

    public AddEmployee getAddingEmployee(){
        if(Employee == null){
            Employee = new AddEmployee(driver);
        }
        return Employee;
    }
    public AddEmployeeDetails getEmployeeDetails(){
        if(EmployeeDetails == null){
            EmployeeDetails = new AddEmployeeDetails(driver);
        }
        return EmployeeDetails;
    }
}
