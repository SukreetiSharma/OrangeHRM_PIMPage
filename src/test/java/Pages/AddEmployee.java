package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddEmployee {
    WebDriver driver;
    WebDriverWait wait;
    By AddEmployee = By.xpath("//a[contains(text(),'Add Employee')]");

    public AddEmployee(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void AddingEmployee(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddEmployee));
        driver.findElement(AddEmployee).click();
    }
}
