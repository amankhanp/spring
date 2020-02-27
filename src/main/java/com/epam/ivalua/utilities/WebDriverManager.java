package com.epam.ivalua.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

import static com.epam.ivalua.utilities.ConfigPropertiesConfiguration.properties;
@Component @Configuration
//@ComponentScan(basePackages = "com.epam.ivalua")
public class WebDriverManager {

    private WebDriver webDriver;

    public WebDriver getDriver() {
        return webDriver;
    }

    public WebDriver getWebDriver(){
        String browser = properties.getProperty("BrowserName");
        if (browser.equalsIgnoreCase("chrome")) {
            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }
        /**
         * Using Selenide driver:
         *
         * WebDriverRunner.setWebDriver(webDriver);
         */
        //WebDriverRunner.setWebDriver(webDriver);

        /*GenericApplicationContext ctx = new GenericApplicationContext();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(ctx);
        xmlReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(ctx);
        propReader.loadBeanDefinitions(new ClassPathResource("otherBeans.properties"));
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");*/
        return webDriver;
    }

    @PreDestroy
    public void closeSession(){
        getDriver().manage().deleteAllCookies();
        getDriver().close();
        getDriver().quit();
    }
}