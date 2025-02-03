package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	public static String readProperty(String key) throws IOException {
	Properties props=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
	props.load(fis);
	String value=props.getProperty(key);
	
	return value;
			
	}
}
