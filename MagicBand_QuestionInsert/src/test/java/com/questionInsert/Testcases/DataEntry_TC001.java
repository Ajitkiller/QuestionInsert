package com.questionInsert.Testcases;

import org.testng.annotations.Test;

import com.questionInsert.pageObject.QuestionBankPage;


public class DataEntry_TC001 extends BaseClass{

	@Test
	public void QuestionInjection() throws InterruptedException {
		
		driver.get(baseUrl);
		String txt=driver.getTitle();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		System.out.println(txt);		
		QuestionBankPage questionPage=new QuestionBankPage(driver);
		Thread.sleep(4000);
		questionPage.setBoard("CBSE");
		Thread.sleep(1000);
		questionPage.setGrade("Class 9");
		Thread.sleep(1000);
		questionPage.setSubject("Maths");
		Thread.sleep(2000);
		questionPage.setTopic("Number Systems");
		Thread.sleep(2000);
		questionPage.setSubtopic("Number systems");
		Thread.sleep(2000);
		questionPage.setSource("https://www.ncertbooks.guru/mcq-questions-for-class-9-science-chapter-10-with-answers/");
		Thread.sleep(2000);
		questionPage.setDifficultyLevel("4");
		Thread.sleep(5000);
		questionPage.totalNumberOfFrame(driver);
		questionPage.setEnterQuestion("The mass of moon is about 0.012 times that of the earth and its diameter is about 0.25 times that of earth. The value of G on the moon will be", driver);
		Thread.sleep(3000);
		questionPage.setOptionOne("Same as that on the earth", driver);
		Thread.sleep(3000);
		questionPage.setOptionTwo("About one-fifth of that on the earth", driver);
		questionPage.radioOptionTwo(driver);
		Thread.sleep(3000);
		questionPage.setOptionThree("About one-sixth of that on the earth", driver);
		Thread.sleep(1000);
		Thread.sleep(5000);
		questionPage.setOptionFour("About one-fourth of that on the earth", driver);
		questionPage.extendedSolution("Same as that on the earth", driver);
		Thread.sleep(4000);
		questionPage.selectHintAnswer("This is hint answer", driver);
		questionPage.saveButton(driver);
		System.out.println("Save button clicking successfully");
		Thread.sleep(4000);
	}
		
}
