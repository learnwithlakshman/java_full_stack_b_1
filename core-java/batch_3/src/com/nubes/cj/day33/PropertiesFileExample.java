package com.nubes.cj.day33;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("db.properties")));
			System.out.println(properties.get("mysql.url"));
		} catch (IOException e) {
			System.out.println("While loading properties:"+e);
		}
	}
}
