package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilitys {
	public static String propertiesRead(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\PropertyFiles");
		prop.load(file);
		
//		String url=prop.getProperty("url");
//		String username=prop.getProperty("username");
//		String password=prop.getProperty("password");
		
		String data =prop.getProperty(key);
		
		return data;
	}

}
