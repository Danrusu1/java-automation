import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
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
    public void login() {
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        WebElement loginButton = driver.findElement(By.cssSelector(".fa-sign-in"));
        loginButton.click();
        Assertions.assertEquals("http://the-internet.herokuapp.com/secure", driver.getCurrentUrl());

    }
    @Test
    public void logout(){
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".fa-sign-in")).click();
        driver.findElement(By.cssSelector(".icon-signout")).click();
        Assertions.assertEquals("http://the-internet.herokuapp.com/login", driver.getCurrentUrl());
    }
    @Test
    public void loginPageHeader(){
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        WebElement pageHeader = driver.findElement(By.cssSelector(".subheader"));
        Assertions.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.", pageHeader.getText());
    }
}
