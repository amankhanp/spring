package com.epam.ivalua.constants.supplier;

public interface SupplierQualificationsConstants {
    String CATEGORY = "//input[@aria-label='Category']";
    String APPROVED_STATUS = "//select[@aria-label='Approved Status']";
    String MARKETS = "//input[@type='text' and @aria-label='Markets']";
    String ONLY_MY_PENDING_APPROVALS = "//input[@type='checkbox' and @aria-label=\"Only my pending approvals\"]";
    String ADD_A_LINE = "//button[@aria-label='Add a line']";
    String ADD_MULTIPLE_QUALIFICATIONS = "//button[@aria-label='Add multiple qualifications']";
    String CHANGE_HISTORY = "//button[@aria-label='Change history']";

    String ADD_A_LINE_MARKET = "//a[text()='Market']/following::input[contains(@id,'colOrga') and @type='text']";
    String ADD_A_LINE_CATEGORY = "//a[text()='Category']/following::input[contains(@id,'colFam') and @type='text']";
    String ADD_A_LINE_NEW_STATUS_TO_APPROVE = "//a[text()='New Status to Approve']/following::select";

    String GEOGRAPHICAL_AREA = "//input[@aria-label='Geographical area']";

    String CUSTOMER_REFERENCES = "//input[@type='submit' and @value='Add a reference']";
    String CLIENT_REFERENCE_CLIENT = "//input[@aria-label='Client']";
    String CLIENT_REFERENCE_CONTACT = "//input[@aria-label='Contact']";
    String CLIENT_REFERENCE_INDUSTRY = "//select[@aria-label='Industry']";
    String CLIENT_REFERENCE_PHONE = "//input[@aria-label='Phone']";
    String CLIENT_REFERENCE_EMAIL = "//input[@aria-label='Email']";
    String CLIENT_REFERENCE_DATE = "//input[@type='text' and @aria-label='Date']";
    String CLIENT_REFERENCE_COMMENTS = "//textarea[@aria-label='Comment']";
}
