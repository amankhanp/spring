package com.epam.ivalua.utilities;

import lombok.extern.log4j.Log4j;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Log4j
public class CommonUtils {

    private CommonUtils() {
        throw new IllegalStateException("Common Utils class");
    }

    public static String encodeAString(String textValue){
        return Base64.getEncoder().encodeToString(textValue.getBytes(StandardCharsets.UTF_8));
    }

    public static String decodeAString(String textValue){
        byte[] decodeArray = Base64.getDecoder().decode(textValue);
        return new String(decodeArray, StandardCharsets.UTF_8);
    }
}