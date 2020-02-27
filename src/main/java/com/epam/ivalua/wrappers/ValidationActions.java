package com.epam.ivalua.wrappers;

import com.epam.ivalua.utilities.TestConfiguration;
import com.epam.ivalua.utilities.WebDriverManager;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j @Component
public class ValidationActions {

    @Autowired
    public WebDriverManager driver;

    /*private ValidationActions() {
        throw new IllegalStateException("Validation Actions class");
    }*/

    public void verifyText(String element, String expectedValue) {
        WebElement webElement = driver.getDriver().findElement(By.xpath(element));
        log.info("User validating text on element: " + element);
        String actualValue = webElement.getText();
        if (actualValue.trim().equalsIgnoreCase(expectedValue.trim())) {
            log.info("'" + expectedValue + "' text present in the page");
        } else {
            log.info("'" + expectedValue + "' text not present in the page");
        }
    }
}