package PageFactory;

import Pages.*;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static WebDriver driver;
    public AddEmployeeReport add;
    public AddEmployee Employee ;
    public AddMethod ReportingMethod;
    public DeleteEmployee DeleteEmply;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

//    public LoginPage getUserAbleToLogin(){
//        if(loginPage == null){
//            loginPage = new LoginPage(driver);
//        }
//        return loginPage;
//    }
//
//    public Logout getUserAbleToLogout(){
//        if(LogOutAdmin == null){
//            LogOutAdmin = new Logout(driver);
//        }
//        return LogOutAdmin;
//    }

    public AddEmployeeReport getAddReport(){
        if(add == null){
            add = new AddEmployeeReport(driver);
        }
        return add;
    }

//    public FillReportDetails getDetailsOfReports(){
//        if(AddDetails == null){
//            AddDetails = new FillReportDetails(driver);
//        }
//        return AddDetails;
//    }

    public AddEmployee getAddingEmployee(){
        if(Employee == null){
            Employee = new AddEmployee(driver);
        }
        return Employee;
    }

    public AddMethod getAddReportingMethod(){
        if(ReportingMethod == null){
            ReportingMethod = new AddMethod(driver);
        }
        return ReportingMethod;
    }

    public DeleteEmployee getDeleteEmployee(){
        if(DeleteEmply == null){
            DeleteEmply = new DeleteEmployee(driver);
        }
        return DeleteEmply;
    }
}
