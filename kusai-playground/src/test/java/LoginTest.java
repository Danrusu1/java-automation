import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void closeDriver() {
        //close the driver
        driver.quit();
    }

    @Test
    public void loginPageHeader(){
        final LoginPage loginPage = new LoginPage(driver);
        loginPage.goToUrl("http://the-internet.herokuapp.com/login");

        Assertions.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.",
                loginPage.getPageHeader());
    }

    @Test
    public void login() {

        final LoginPage loginPage = new LoginPage(driver);
        loginPage.goToUrl("http://the-internet.herokuapp.com/login");
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        Assertions.assertEquals("http://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
    }

    @Test
    public void login2() {

        new LoginPage(driver)
                .goToUrl("http://the-internet.herokuapp.com/login")
                .enterUsername("tomsmith")
                .enterPassword("SuperSecretPassword!")
                .clickLogin();

        final SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

        Assertions.assertEquals("Welcome to the Secure Area. When you are done click logout below.",
                secureAreaPage.getSecurePageDescription());
    }

    @Test
    public void checkLoginBtnText() {
        final LoginPage loginPage = new LoginPage(driver);
        loginPage.goToUrl("http://the-internet.herokuapp.com/login");
        final String textButton = loginPage.getLoginButtonText();

        Assertions.assertEquals("Login", textButton);
    }


    @Test
    public void logout(){
        final LoginPage loginPage = new LoginPage(driver);
        loginPage.goToUrl("http://the-internet.herokuapp.com/login");
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        final SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        secureAreaPage.clickSignout();

        Assertions.assertEquals("http://the-internet.herokuapp.com/login", driver.getCurrentUrl());
    }


}
