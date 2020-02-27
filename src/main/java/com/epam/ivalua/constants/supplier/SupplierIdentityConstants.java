package com.epam.ivalua.constants.supplier;

import com.epam.ivalua.constants.ContextConstants;

public interface SupplierIdentityConstants {

    String SUPPLIER_INFORMATION_NAME = "//input[@aria-label='Name']";
    String SUPPLIER_INFORMATION_CORPORATENAME = "//input[@aria-label='Corporate Name']";
    String SUPPLIER_INFORMATION_WEBSITE = "//input[@aria-label='Web Site']";
    String SUPPLIER_INFORMATION_COMMENT = "//textarea[@aria-label='Comment']";
    String SUPPLIER_INFORMATION_ADDDATE = "//input[@aria-label='Date the supplier was added']";
    String SUPPLIER_INFORMATION_ADDTIME = "//div[@class='select-width']/following-sibling::input";

    String SUPPLIER_ADDRESS_LABEL = "//input[@aria-label='Address Label']";
    String SUPPLIER_ADDRESS_LINE1 = "//input[@aria-label='Address Line 1']";
    String SUPPLIER_ADDRESS_LINE2 = "//input[@aria-label='Address Line 2']";
    String SUPPLIER_ADDRESS_ZIPCODE = "//input[@aria-label='Zip Code']";
    String SUPPLIER_ADDRESS_CITY = "//input[@aria-label='City']";
    String SUPPLIER_ADDRESS_COUNTRY = "//select[@aria-label='Country']";

    String SUPPLIER_ADDRESS_PART1 = "[contains(@id,'identity') and contains(@aria-label,'";
    String SUPPLIER_PAYMENT_ADDRESS_LABEL = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ADDRESS_PART1 + "Address Label" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ADDRESS_LINE1 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ADDRESS_PART1 + "Address Line 1" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ADDRESS_LINE2 = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ADDRESS_PART1 + "Address Line 2" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_ZIPCODE = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ADDRESS_PART1 + "Zip Code" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_CITY = ContextConstants.SUPPLIER_INPUT + SUPPLIER_ADDRESS_PART1 + "City" + ContextConstants.SUPPLIER_ENDPART;
    String SUPPLIER_PAYMENT_COUNTRY = ContextConstants.SUPPLIER_SELECT + SUPPLIER_ADDRESS_PART1 + "Country" + ContextConstants.SUPPLIER_ENDPART;;

    String SUPPLIER_PURCHASING_INFORMATION_CATALOGACCESS = "//input[@aria-label='Catalog Access']";
    String SUPPLIER_PURCHASING_INFORMATION_TYPE = "//select[@aria-label='Type']";
    String SUPPLIER_PURCHASING_INFORMATION_TYPOLOGY = "//select[@aria-label='Typology']";
    String SUPPLIER_PURCHASING_INFORMATION_INCOTERM = "//select[@aria-label='Incoterm']";
    String SUPPLIER_PURCHASING_INFORMATION_INCOTERMPLACE = "//input[@aria-label='Incoterm Place']";
    String SUPPLIER_PURCHASING_INFORMATION_GROUPEDORDERS = "//input[@aria-label='If checked, PR items related with this supplier will be on hold until manually grouped together to generate the PO. ']";

    String SUPPLIER_HIERARCHY_BVDCODE = "//input[@aria-label='BVD Code']";
    String SUPPLIER_HIERARCHY_LEVEL = "//select[@aria-label='Level']";
}