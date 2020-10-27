package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Description: file created for java-automation
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 27/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class LoginPage {

    private final WebDriver driver;

    private final By LOGIN = By.cssSelector(".fa-sign-in");
    private final By USERNAME = By.id("username");
    private final By PASWWORD = By.id("password");
    private final By HEADER = By.cssSelector(".subheader");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage goToUrl(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterUsername(String username) {
        final WebElement element = driver.findElement(USERNAME);
        element.sendKeys(username);
        return this;
    }


    public LoginPage enterPassword(String password) {
        final WebElement element = driver.findElement(PASWWORD);
        element.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        final WebElement element = driver.findElement(LOGIN);
        element.click();
    }

    public String getLoginButtonText() {
        final WebElement element = driver.findElement(LOGIN);
        return element.getText();
    }

    public String getPageHeader() {
       final WebElement pageHeader = driver.findElement(HEADER);
       return pageHeader.getText();
    }
}
