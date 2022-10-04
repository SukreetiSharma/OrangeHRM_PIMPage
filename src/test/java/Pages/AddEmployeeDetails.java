package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class AddEmployeeDetails {
    WebDriver driver;
    WebDriverWait wait;
    By Fname = By.xpath("//input[@name='firstName']");
    By Mname = By.xpath("//input[@name='middleName']");
    By Lname = By.xpath("//input[@name='lastName']");
    By Save = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public AddEmployeeDetails(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void addDetails() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//DataDrivenOrangeHRM.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet2");
        String FirstName  = sheet.getRow(1).getCell(0).getStringCellValue();
        String MiddleName = sheet.getRow(1).getCell(1).getStringCellValue();
        String LastName  = sheet.getRow(1).getCell(2).getStringCellValue();
        driver.findElement(Fname).sendKeys(FirstName);
        driver.findElement(Mname).sendKeys(MiddleName);
        driver.findElement(Lname).sendKeys(LastName);
        driver.findElement(Save).click();
    }

    public void Verify(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Fname));
        String actual = driver.findElement(Fname).getAttribute("value");
        Assert.isTrue(actual.equals("Adey"), "Expected result does not match with actual result");
    }
}
