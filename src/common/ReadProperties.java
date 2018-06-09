package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	InputStream fis=null;
	
	public static String getPropValue(String value) throws IOException{
	
	FileInputStream fileInput = new FileInputStream("./src/resources/TestData.properties");
	Properties prop = new Properties();
	prop.load(fileInput);
	String temp = prop.getProperty(value);
	return temp;
	
	}
}
