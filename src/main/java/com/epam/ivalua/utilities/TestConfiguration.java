package com.epam.ivalua.utilities;

import com.epam.ivalua.domain.SupplierData;
import com.epam.ivalua.wrappers.BrowserActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

import static com.epam.ivalua.utilities.ConfigPropertiesConfiguration.properties;

@Log4j
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
        /*String browser = properties.getProperty("BrowserName");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }*/
        webDriverManager.getWebDriver().manage().window().maximize();
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