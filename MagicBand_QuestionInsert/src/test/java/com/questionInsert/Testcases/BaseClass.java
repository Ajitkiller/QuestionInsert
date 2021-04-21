package com.questionInsert.Testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.questionInsert.utilities.ReadConfig;

public class BaseClass {

	public static Logger log=LogManager.getLogger(BaseClass.class.getName());
	ReadConfig readconfig=new ReadConfig(); 
	public String baseUrl=readconfig.getFormUrl();
	public static WebDriver driver;
	@BeforeClass
	public void steUp() {
	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		
	
	driver=new ChromeDriver();
	}
	@AfterClass
	public void closeBrowser(){
		
		driver.close();
		
	}
	
}
