package genericLibraries;

import java.io.FileInputStream;

 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * this class contains all reusble methods to perform actions
 * on properties file
 * @param key
 * @return
 */

public class PropertiesUtility {
	private Properties property;
	/**
	 * this method is used to initialize properties file
	 * @param filepath
	 */
	public void propertiesInt(String filepath);
public void readData(String filePath) throws FileNotFoundException {
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filePath);
	}catch (FileNotFoundException e) { 
	
	e.printStackTrace();
	
	}


	property=new Properties();
	try
	{
		property.load(fis);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
/**
 * this method isnused to  fetch data from properties file
 * @param key
 * @return
 */
	

public String readData1(String key) {
	return property.getProperty(key);
}
public void writeToProperties(String key, String value,String filepath) {
	property.putIfAbsent(key, value);
	FileOutputStream fos= null;
	try {
		fos=new FileOutputStream ();
	}
}
}


	
	


