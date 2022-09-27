package PageFactory;

import Pages.AddEmployeeReport;
import Pages.FillReportDetails;
import org.openqa.selenium.WebDriver;
import Pages.LoginPage;

public class PageFactory {
    public static WebDriver driver;
    public LoginPage loginPage;
    public AddEmployeeReport add;
    public FillReportDetails AddDetails;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getUserAbleToLogin(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
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
}
