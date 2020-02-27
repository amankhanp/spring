package com.epam.ivalua.wrappers;

import com.epam.ivalua.utilities.WebDriverManager;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.epam.ivalua.utilities.ConfigPropertiesConfiguration.properties;
//import static com.epam.ivalua.utilities.TestConfiguration.driver;

@Log4j
@Component
public class BrowserActions {

    public static WebDriverWait webDriverWait;

    @Autowired
    public WebDriverManager driver;

    private BrowserActions() {
        throw new IllegalStateException("Browser Actions class");
    }

    public void openBrowser(String url) {
        driver.getWebDriver().navigate().to(url);
        log.info("User navigated to the given URL: " + url);
    }

    /*public static void closeBrowser() {
        driver.close();
        log.info("Browser closed successfully");
    }*/

    public void quitBrowser() {
        driver.getWebDriver().quit();
        log.info("All browser closed successfully");
    }

    public void wait(Long time, TimeUnit timeUnit) {
        log.debug("Application waiting for " + time + timeUnit);
        driver.getWebDriver().manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public WebDriverWait waitForElement() {
        log.debug("Application waits until time out in secs ");
        return waitForElement(properties.getProperty("TIMEOUT_IN_SEC"));
    }

    public WebDriverWait waitForElement(String timeOutInSec) {
        int timeOutSecs = Integer.parseInt(timeOutInSec);
        log.debug("Application waits until time out in secs " + timeOutInSec);
        return new WebDriverWait(driver.getWebDriver(), timeOutSecs);
    }

    public WebElement waitForElementToVisible(WebElement webElement) {
        webDriverWait = waitForElement(properties.getProperty("TIMEOUT_IN_SEC"));
        log.debug("Application waiting for the element " + webElement + " to be visible");
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitForElementToClickable(WebElement webElement) {
        webDriverWait = waitForElement(properties.getProperty("TIMEOUT_IN_SEC"));
        log.debug("Application waiting for the element " + webElement + " to be clickable");
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement fluentWait(final String locatorElement){
        Wait<WebDriver> wait = new FluentWait<>(driver.getWebDriver()).withTimeout(
                Duration.ofSeconds(Long.parseLong(properties.getProperty("TIMEOUT_IN_SEC"))))
                .ignoring(NoSuchElementException.class);
        log.debug("Application waiting for the element " + locatorElement + "to be visible");
        return wait.until(driver -> driver.findElement(By.xpath(locatorElement)));
    }

}