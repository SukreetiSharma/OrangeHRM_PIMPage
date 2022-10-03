package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logout {
    WebDriver driver;
    WebDriverWait wait;
    By Admin = By.xpath("//p[@class='oxd-userdropdown-name']");
    By Logout = By.xpath("//a[contains(text(),'Logout')]");

    public Logout(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void LogOutAdmin(){
        driver.findElement(Admin).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        driver.findElement(Logout).click();
    }

    public void closeBrowser() {
        driver.close();
    }
}
