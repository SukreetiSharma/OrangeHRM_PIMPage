package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;

public class FillReportDetails {
    WebDriver driver;
    WebDriverWait wait;
    By ReportName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By FeildGroup = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
    By FeildGroupValue = By.xpath("//*[contains(text(),'Personal')]");
    By Feild = By.xpath("(//div[@class='oxd-select-text-input'])[4]");
    By FeildValue1 = By.xpath("//*[contains(text(),'Employee Id')]");
    By Plus = By.xpath("(//button[@class='oxd-icon-button orangehrm-report-icon'])[2]");
    By FeildValue2 = By.xpath("//*[contains(text(),'Employee Last Name')]");
    By Save = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By Admin = By.xpath("//p[@class='oxd-userdropdown-name']");
    By Logout = By.xpath("//a[contains(text(),'Logout')]");
    public FillReportDetails(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void fillDetails() throws IOException {
        String s = RandomStringUtils.randomAlphabetic(8);
        driver.findElement(ReportName).sendKeys("Report"+s);
        driver.findElement(FeildGroup).click();
        driver.findElement(FeildGroupValue).click();
        driver.findElement(Feild).click();
        driver.findElement(FeildValue1).click();
        driver.findElement(Plus).click();
        driver.findElement(Feild).click();
        driver.findElement(FeildValue2).click();
        driver.findElement(Save).click();
        driver.findElement(Admin).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        driver.findElement(Logout).click();
    }
}
