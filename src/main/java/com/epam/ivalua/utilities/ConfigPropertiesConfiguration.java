package com.epam.ivalua.utilities;

import com.epam.ivalua.constants.CommonValidationConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertiesConfiguration {

    public static Properties properties;
    public FileInputStream fileInputStream = null;

    public ConfigPropertiesConfiguration() {
        try {
            fileInputStream = new FileInputStream((new File(CommonValidationConstants.CONFIG_FILE_DIRECTORY)));
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}