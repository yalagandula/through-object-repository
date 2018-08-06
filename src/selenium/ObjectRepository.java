package selenium;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectRepository   {
	
	public Properties pro;

	public Properties getObjectProperties() throws Exception {
		
		 pro = new Properties();
		FileInputStream file = new FileInputStream("src\\java\\Get.properties");
		pro.load(file);
		
		file.close();
		return pro;
		
	}
	

	

}
