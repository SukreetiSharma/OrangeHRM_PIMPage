package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteEmployee {
    WebDriver driver;
    WebDriverWait wait;
    By Delete = By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
    By Yes = By.xpath("//button//i[@class='oxd-icon bi-trash oxd-button-icon']");
    public DeleteEmployee(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void ableToDeleteEmployee(){
        driver.findElement(Delete).click();
        driver.findElement(Yes).click();
    }

}
