package com.epam.ivalua.constants;

public final class CommonValidationConstants {

    private CommonValidationConstants() {
        throw new IllegalStateException("Common Validation Constants class");
    }

    public static final String CONFIG_FILE_DIRECTORY = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";
    public static final String WELCOME_TITLE_TEXT = "Welcome to McDonald's Source2Pay";
    public static final String HOMEPAGE_TITLE_TEXT = "Administration Homepage";
}