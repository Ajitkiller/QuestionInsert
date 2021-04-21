package com.questionInsert.Testcases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.questionInsert.utilities.ReadConfig;

public class DemoTc extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		ReadConfig readconfig=new ReadConfig();
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		WebDriver driver;
		
		driver=new ChromeDriver();
		log.info("Opening browser successfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://magicband-test.azurewebsites.net/admin/create/form");
		log.info("Opening Question injection successfully");
		WebElement board=driver.findElement(By.name("boards"));
		
		Select s1=new Select(board);
		s1.selectByVisibleText("CBSE");
		
		s1.selectByIndex(0);
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame is : "+frames.size());
		for (int i = 0; i < frames.size(); i++) {
			WebElement franam=frames.get(i);
			System.out.println(franam.getAttribute("title"));
		}
		//Window handle method
		/*String winHandleBefore = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//label[text()='Select correct option 2']")).click();
		System.out.println("Option 2 Label is added");
		
		driver.switchTo().frame(5);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys("aaaaaaaaaaaaaaaaaa");
		driver.switchTo().window(winHandleBefore);*/		
		//driver.switchTo().frame(1);
		//Select radio button 2
		
	/*	for (int i = 0; i < 5; i++) {
			
		driver.switchTo().frame(i);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys("aaaaaaaaaaaaaaaaaa");
		Thread.sleep(3000);
		log.info(i+" no of frame is selected");
		driver.switchTo().window(winHandleBefore);
		}*/
		
	}
	
}
