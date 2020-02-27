package com.epam.ivalua.pagesteps;

import com.epam.ivalua.constants.ContextConstants;
import com.epam.ivalua.constants.LogInConstants;
import com.epam.ivalua.constants.CommonValidationConstants;
import com.epam.ivalua.wrappers.ValidationActions;
import com.epam.ivalua.wrappers.WebElementActions;
import io.cucumber.datatable.DataTable;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static com.epam.ivalua.utilities.CommonUtils.decodeAString;
import static com.epam.ivalua.utilities.CommonUtils.encodeAString;

@Log4j @Component @Configuration
public class LoginPageSteps {

    @Autowired
    public ValidationActions validationActions;

    @Autowired
    public WebElementActions webElementActions;

    private LoginPageSteps() {
        throw new IllegalStateException("Login Page Steps class");
    }

    public void navigateToLoginPage() {
        validationActions.verifyText(LogInConstants.WELCOME_TITLE, CommonValidationConstants.WELCOME_TITLE_TEXT);
    }

    public void enterUserNameAndPassword(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        String userName = decodeAString(credentials.get(0).get("username"));
        String password = decodeAString(credentials.get(0).get("password"));
        webElementActions.clearAndType(LogInConstants.USERNAME, userName);
        webElementActions.clearAndType(LogInConstants.PASSWORD, password);
        log.info("User entered Encoded value of Username as : " + encodeAString(userName));
        log.info("User entered Encoded value of Password as : " + encodeAString(password));
    }

    public void clickOnLogin() {
        webElementActions.onClick(LogInConstants.LOGIN);
    }

    public void navigateToHomePage() {
        validationActions.verifyText(ContextConstants.HOMEPAGE_TITLE, CommonValidationConstants.HOMEPAGE_TITLE_TEXT);
    }

}