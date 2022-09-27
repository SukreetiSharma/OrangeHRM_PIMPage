package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddEmployeeReport {
    WebDriver driver;
    WebDriverWait wait;
    By Report = By.xpath("//a[contains(text(),'Reports')]");
    By Add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public AddEmployeeReport(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void employeeReport(){
        driver.findElement(Report).click();
        driver.findElement(Add).click();
    }
}
