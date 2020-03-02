package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static String URL;
	public static String BROWSER;
	
	private static final String PROPERTIES_FILE = "config.properties";

	static {
		readproperties();
	}

	private static void readproperties() {

		Properties prop = new Properties();
		try {
			FileReader fr = new FileReader(new File(PROPERTIES_FILE));
			prop.load(fr);

			BROWSER = prop.getProperty("browser");
			URL = prop.getProperty("url");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
