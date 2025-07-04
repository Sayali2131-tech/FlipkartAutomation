package propertyUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import keyword.Keywords;

public class Property {

	public static String getProperty(String key) {
		
		Properties prop = new Properties();
		 String value = null ;
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/config.properties"); 
		    prop.load(fis);
		    value  = prop.getProperty(key);
		 } catch (FileNotFoundException e) {
			Keywords.log.error("properties File not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
