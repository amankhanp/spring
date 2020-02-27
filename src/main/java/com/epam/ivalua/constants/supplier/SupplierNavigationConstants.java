package com.epam.ivalua.constants.supplier;

public interface SupplierNavigationConstants {

    String BROWSE_SUPPLIERS = "//a[text()='Browse Suppliers']";
    String CREATE_SUPPLIERS = "//div/a[text()='Suppliers']//..//a[text()='Create']";
    String SUPPLIER_SAVE = "//div[@objecttype='supplier']//..//input[@value='Save']";
    String SUPPLIER_SAVEANDCLOSE = "//div[@objecttype='supplier']//..//input[@value='Save & Close']";
    String SUPPLIER_CREATE_TITLE = "//h1[text()='Create']";
    String SUPPLIER_ADD = "//div[@objecttype='supplier']//..//input[@value='Add Supplier']";

    String SUPPLIER_SAVE_MODIFY = "//table[@id='proxyActionBar_x_plhState']//..//input[@value='Save']";
    String SUPPLIER_SAVEANDCLOSE_MODIFY = "//table[@id='proxyActionBar_x_plhState']//..//input[@value='Save & close']";
    String SUPPLIER_CLOSE = "//table[@id='proxyActionBar_x__plhcButtons']//..//input[@value='Close']";
    String SUPPLIER_CREATECHANGEREQUEST = "//table[@id='proxyActionBar_x__plhcButtons']//..//input[@value='Create a change request']";
}