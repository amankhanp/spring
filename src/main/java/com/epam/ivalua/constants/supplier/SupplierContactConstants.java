package com.epam.ivalua.constants.supplier;

public interface SupplierContactConstants {
    String CREATE_A_CONTACT = "//value[text()='Create a contact']";

    String IDENTITY_PERSONAL_TITLE = "//select[@aria-label='Personal title']";
    String IDENTITY_LAST_NAME = "//input[@aria-label='Last Name']";
    String IDENTITY_FIRST_NAME = "//input[@aria-label='First Name']";
    String IDENTITY_EMAIL = "//input[@aria-label='Email']";
    String IDENTITY_PHONE = "//input[@aria-label='Phone']";
    String IDENTITY_CELL_PHONE = "//input[@aria-label='Cell Phone']";
    String IDENTITY_FAX = "//input[@aria-label='Fax']";
    String IDENTITY_POSITION = "//input[@aria-label='Position']";
    String IDENTITY_APPROVED_BY = "//input[@aria-label='Approved by']";

    String ADDRESS_ADDRESS_LABEL = "//input[@aria-label='Address Label']";
    String ADDRESS_ADDRESS_LINE_1 = "//input[@aria-label='Address Line 1']";
    String ADDRESS_ADDRESS_LINE_2 = "//input[@aria-label='Address Line 2']";
    String ADDRESS_ZIP_CODE = "//input[@aria-label='Zip Code']";
    String ADDRESS_CITY = "//input[@aria-label='City']";
    String ADDRESS_COUNTRY = "//select[@aria-label='Country']";
}
