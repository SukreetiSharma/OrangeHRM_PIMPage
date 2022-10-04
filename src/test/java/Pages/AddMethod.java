package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddMethod {
    WebDriver driver;
    WebDriverWait wait;
    String s = RandomStringUtils.randomAlphabetic(8);
    String MethodName = s + " method";
    By Config = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']");
    By Method = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[4]");
    By Add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By Name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By Save = By.xpath("//button[@type='submit']");
    By verify = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-main-title']");
    public AddMethod(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void NavigateToConfig(){
        driver.findElement(Config).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Method));
        driver.findElement(Method).click();

    }
    public void AddDetails(){

        driver.findElement(Add).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Name));
        driver.findElement(Name).sendKeys(MethodName);
        driver.findElement(Save).click();
    }
    public void Verify(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(verify));
    }
}
