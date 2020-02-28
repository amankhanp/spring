package com.epam.ivalua.utilities;

import com.epam.ivalua.domain.SupplierData;
import com.epam.ivalua.wrappers.BrowserActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

import static com.epam.ivalua.utilities.ConfigPropertiesConfiguration.properties;

@Log4j @Component
public class TestConfiguration {

    @Autowired
    public WebDriverManager webDriverManager;

    @Autowired
    public BrowserActions browserActions;

    public static SupplierData supplierData = null;

    @Before(order = 0)
    public void initialize() {
        new ConfigPropertiesConfiguration();
    }

    @Before(order = 1)
    public void launchBrowser() {
        /*AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("com.epam.ivalua.utilities", "com.epam.ivalua.pagesteps", "com.epam.ivalua.wrappers");
        ac.refresh();

        webDriver = ac.getBean(WebDriver.class);*/
        webDriverManager.getDriver().manage().window().maximize();
        browserActions.wait((long) 10, TimeUnit.SECONDS);
        log.info("User launched " + "webDriverManager." + " browser successfully");
    }

    @Before(order = 2)
    public void navigateToApplication() {
        String url = properties.getProperty("McSource2PayURL");
        browserActions.openBrowser(url);
    }

    @Before(order = 3)
    public void convertJsonDataToJavaObject(){
        JsonUtils jsonUtils = new JsonUtils();
        supplierData = jsonUtils.convertJsonToJava(properties.getProperty("JsonFile"), SupplierData.class);
    }

    @After(order = 0)
    public void cleanUp() {
        browserActions.quitBrowser();
    }
}