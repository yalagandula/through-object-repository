package selenium;

import org.testng.annotations.Test;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Webdriver {
	FirefoxDriver driver;
	ObjectRepository pro=new ObjectRepository();
	
	@Test
	public void tester() throws Exception {
			  
		//ObjectRepository or=new ObjectRepository();
			//ObjectRepository op=new ObjectRepository();
			
			System.setProperty("webdriver.gecko.driver","C:\\browserDrivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 
			 Properties obj=pro.getObjectProperties();

			driver.get("url");
			driver.findElement(By.name(obj.getProperty("usd"))).sendKeys();
			driver.findElement(By.name("pass")).sendKeys("pwd");
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
			
}
