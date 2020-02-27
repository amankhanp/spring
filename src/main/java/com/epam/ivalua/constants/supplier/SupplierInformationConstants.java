package com.epam.ivalua.constants.supplier;

import com.epam.ivalua.constants.ContextConstants;

public interface SupplierInformationConstants {

    String SUPPLIER_CORPORATE_LEGALFORM = "//input[@aria-label='Legal Form']";
    String SUPPLIER_CORPORATE_NAICSCODE = "//input[@aria-label='NAICS Code']";
    String SUPPLIER_CORPORATE_NONPROFIT = "//input[@aria-label='Non-Profit']";
    String SUPPLIER_CORPORATE_CREATIONYEAR = "//input[@aria-label='Year of creation']";
    String SUPPLIER_CORPORATE_FACTORINGCOMPANY = "//input[@aria-label='Factoring Company']";
    String SUPPLIER_CORPORATE_INTRAGROUP = "//input[@aria-label='Intra-group']";

    String SUPPLIER_ORDER_PART1 = "[contains(@id,'AdrOrd') and contains(@aria-label,'";
    String SUPPLIER_ORDER_ADDRESS_LABEL = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ORDER_PART1 + "Address Label" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_ORDER_ADDRESS_LINE1 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ORDER_PART1 + "Address Line 1" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_ORDER_ADDRESS_LINE2 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ORDER_PART1 + "Address Line 2" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_ORDER_ZIPCODE = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ORDER_PART1 + "Zip Code" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_ORDER_CITY = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ORDER_PART1 + "City" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_ORDER_COUNTRY = ContextConstants.SUPPLIER_SELECT + SUPPLIER_ORDER_PART1 + "Country" + ContextConstants.SUPPLIER_ENDPART;;

    String SUPPLIER_GOVERNMENT_SIRET = "//input[@aria-label='SIRET #']";
    String SUPPLIER_GOVERNMENT_ID = "//input[contains(@id,'Siren')]";
    String SUPPLIER_GOVERNMENT_TAXID = "//input[@aria-label='Tax ID Number']";
    String SUPPLIER_GOVERNMENT_DUN = "//input[contains(@id,'Duns')]";

    String SUPPLIER_PAYMENT_PART1 = "[contains(@id,'AdrPay') and contains(@aria-label,'";
    String SUPPLIER_PAYMENT_ADDRESS_LABEL = ContextConstants.SUPPLIER_INPUT + SUPPLIER_PAYMENT_PART1 + "Address Label" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ADDRESS_LINE1 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_PAYMENT_PART1 + "Address Line 1" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ADDRESS_LINE2 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_PAYMENT_PART1 + "Address Line 2" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ZIPCODE = ContextConstants.SUPPLIER_INPUT + SUPPLIER_PAYMENT_PART1 + "Zip Code" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_CITY = ContextConstants.SUPPLIER_INPUT + SUPPLIER_PAYMENT_PART1 + "City" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_COUNTRY = ContextConstants.SUPPLIER_SELECT + SUPPLIER_PAYMENT_PART1 + "Country" + ContextConstants.SUPPLIER_ENDPART;;
}