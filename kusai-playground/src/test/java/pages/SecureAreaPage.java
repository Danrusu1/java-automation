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

public class SecureAreaPage {

    private final WebDriver driver;

    private final By SIGNOUT = By.cssSelector(".icon-signout");
    private final By SUBHEADER = By.className("subheader");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignout() {
        final WebElement element = driver.findElement(SIGNOUT);
        element.click();
    }

    public String getSecurePageDescription() {
        final WebElement element = driver.findElement(SUBHEADER);
        return element.getText();
    }
}
