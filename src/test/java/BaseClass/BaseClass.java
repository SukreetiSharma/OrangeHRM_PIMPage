package BaseClass;

import PageFactory.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    WebDriverWait wait;
    protected static WebDriver driver;
    protected static PageFactory obj;
    public static Properties prop;
    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By Login = By.xpath("//button");
    By Admin = By.xpath("//p[@class='oxd-userdropdown-name']");
    By Logout = By.xpath("//a[contains(text(),'Logout')]");

    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        obj = new PageFactory(driver);
    }

    public static void close(){
        driver.close();
    }

    public void loginPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Data.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys(prop.getProperty("UserName"));
        driver.findElement(password).sendKeys(prop.getProperty("PassWord"));
        driver.findElement(Login).click();
    }

    public void LogOutAdmin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(Admin).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        driver.findElement(Logout).click();
    }
}

