package com.questionInsert.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuestionBankPage {

	WebDriver ldriver;
	
	public QuestionBankPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="boards")
	@CacheLookup
	WebElement txtBoard;
	
	@FindBy(name="grades")
	@CacheLookup
	WebElement txtGrade;
	
	@FindBy(name="subjects")
	@CacheLookup
	WebElement txtSubject;
	
	@FindBy(name="topics")
	@CacheLookup
	WebElement txtTopic;
	
	@FindBy(name="subtopics")
	@CacheLookup
	WebElement txtSubtopic;
	
	@FindBy(name="question_type")
	@CacheLookup
	WebElement txtQuesType;
	
	@FindBy(name="source")
	@CacheLookup
	WebElement txtSource;
	
	@FindBy(name="difficulty_level")
	@CacheLookup
	WebElement txtDifficultyLevel;
	
	@FindBy(xpath="//a[contains(text(),'Click to paste')]")
	@CacheLookup
	WebElement linkClickToPaste;
	
	public void setBoard(String bname) 
	{
		Select s1=new Select(txtBoard);
		s1.selectByVisibleText(bname);
	}
	public void setGrade(String gname) 
	{
		Select s1=new Select(txtGrade);
		s1.selectByVisibleText(gname);
	}
	
	public void setSubject(String sname) 
	{
		txtSubject.sendKeys(sname);
	}
	
	public void setTopic(String tname) 
	{
		txtTopic.sendKeys(tname);
	}
	public void setSubtopic(String subname) 
	{
		txtSubtopic.sendKeys(subname);
	}
	public void setQuestionType(String quetypename) 
	{
		txtQuesType.sendKeys(quetypename);
	}
	public void setSource(String sourcename) 
	{
		txtSource.sendKeys(sourcename);
	}
	public void setDifficultyLevel(String difflevelname) 
	{
		txtDifficultyLevel.sendKeys(difflevelname);
	}
	public void setEnterQuestion(String equestionname, WebDriver driver) 
	{
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(equestionname);
		driver.switchTo().window(winHandleBefore);
	}
	public void setClickToPaste(String clicktopaste) 
	{
		linkClickToPaste.click();
	}
	public void setOptionOne(String OptionOne, WebDriver driver) 
	{
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(OptionOne);
		driver.switchTo().window(winHandleBefore);
	}
	public void setOptionTwo(String optionTwo, WebDriver driver) 
	{
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(optionTwo);
		driver.switchTo().window(winHandleBefore);
	}
	public void setOptionThree(String optionThree, WebDriver driver) 
	{
		String winHandleBefore = driver.getWindowHandle();
	
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(optionThree);
		driver.switchTo().window(winHandleBefore);
	}
	public void setOptionFour(String optionFour,  WebDriver driver) 
	{ 
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(4);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(optionFour);
		driver.switchTo().window(winHandleBefore);
	}
	public void radioOptionOne(WebDriver driver) {
		driver.findElement(By.xpath("//label[text()='Select correct option 1']")).click();
		System.out.println("Option 1 is selected");
	}
	public void radioOptionTwo(WebDriver driver) {
		driver.findElement(By.xpath("//label[text()='Select correct option 2']")).click();
		System.out.println("Option 2 is selected");
	}
	public void radioOptionThree(WebDriver driver) {
		driver.findElement(By.xpath("//label[text()='Select correct option 3']")).click();
		System.out.println("Option 3 is selected");
	}
	public void radioOptionFour(WebDriver driver) {
		driver.findElement(By.xpath("//label[text()='Select correct option 4']")).click();
		System.out.println("Option 4 is selected");
	}
	
	public void totalNumberOfFrame(WebDriver driver)
	{
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame is : "+frames.size());
		for (int i = 0; i < frames.size(); i++) {
			WebElement franam=frames.get(i);
			System.out.println(franam.getAttribute("title"));
		}
	}
	
	public void extendedSolution(String ExeSolution, WebDriver driver) {
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(11);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(ExeSolution);
		driver.switchTo().window(winHandleBefore);
	}
	public void selectHintAnswer(String hintAnswer, WebDriver driver) {
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().frame(12);
		driver.findElement(By.xpath("//html[@dir='ltr']//body")).sendKeys(hintAnswer);
		driver.switchTo().window(winHandleBefore);
	}
	
	public void saveButton(WebDriver driver) {
		driver.findElement(By.xpath("//div[@class='col-md-6 text-right']//button")).click();
	}
	
	
}
