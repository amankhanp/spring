package com.epam.ivalua.wrappers;

import com.epam.ivalua.utilities.WebDriverManager;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import static com.epam.ivalua.utilities.TestConfiguration.driver;
import static com.epam.ivalua.wrappers.BrowserActions.*;

@Log4j @Component
public class WebElementActions {

    public static WebElement webElement;
    public static Select selectObj;

    @Autowired
    public BrowserActions browserActions;

    @Autowired
    public WebDriverManager driver;

    /*private WebElementActions() {
        throw new IllegalStateException("WebElement Actions class");
    }*/

    public void clearAndType(String element, String value) {
        webElement = driver.getDriver().findElement(By.xpath(element));
        browserActions.waitForElementToVisible(webElement);
        log.info("User typing text on element: " + element);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public void selectByVisibleText(WebElement webElement, String visibleText){
        browserActions.waitForElementToVisible(webElement);
        log.info("User performing Select operation on element: " + webElement + "for text " + visibleText);
        selectObj = new Select(webElement);
        selectObj.selectByVisibleText(visibleText);
    }

    public void selectByIndexValue(WebElement webElement, String indexValue){
        browserActions.waitForElementToVisible(webElement);
        log.info("User performing Select operation on element: " + webElement + "for index value " + indexValue);
        selectObj = new Select(webElement);
        selectObj.selectByVisibleText(indexValue);
    }

    public void selectByValue(WebElement webElement, String value){
        browserActions.waitForElementToVisible(webElement);
        log.info("User performing Select operation on element: " + webElement + "for value " + value);
        selectObj = new Select(webElement);
        selectObj.selectByVisibleText(value);
    }

    public void onClick(String element){
        webElement = driver.getDriver().findElement(By.xpath(element));
        try{
            browserActions.waitForElementToClickable(webElement);
            log.debug("Element is Clickable : " + webElement);
            webElement.click();
        } catch (StaleElementReferenceException exception) {
            log.error("Element is Not Clickable " + exception);
        }
    }

    public void selectCheckbox(String element) {
        webElement = driver.getDriver().findElement(By.xpath(element));
        browserActions.waitForElementToVisible(webElement);
        boolean isSelected = webElement.isSelected();
        if (isSelected)
            log.info("Checkbox" + element + " is already selected");
        else {
            log.info("User selecting" + element + " checkbox");
            webElement.click();
        }
    }

    public boolean isElementPresent(String locatorElement) {
        try {
            browserActions.fluentWait(locatorElement);
            log.info("Element is Present : " + locatorElement);
            return true;
        } catch (NoSuchElementException exception) {
            log.error("Element is Not Present : " + exception);
            return false;
        }
    }

    public boolean isElementVisible(String locatorElement){
        try {
            browserActions.fluentWait(locatorElement).isDisplayed();
            log.info("Element is Visible : " + locatorElement);
            return true;
        } catch (NoSuchElementException exception) {
            log.error(locatorElement + " element is Not Present " + exception);
            return false;
        }
    }

    /*public void enterText(String element, String textToEnter){
        webElement = driver.findElement(By.xpath(element));
        waitForElementToVisible(webElement);
        webElement.sendKeys(textToEnter);
    }*/
}