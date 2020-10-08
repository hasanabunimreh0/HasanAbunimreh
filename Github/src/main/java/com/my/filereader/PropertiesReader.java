package com.my.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {


    public static final String FIlEPATH = "src/main/resources/config.properties";

    public static String getValue(String key)  {
        File file = new File(FIlEPATH);
        FileInputStream file1 = null;
        try {
            file1 = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
