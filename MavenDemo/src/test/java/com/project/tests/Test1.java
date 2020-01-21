package com.project.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1  {
	static
	{
	System.setProperty("webdriver.chrome.driver",
			"./src/test/resources/driver/chromedriver.exe");
	}
	
	@Test
	public void method1() {
		WebDriver d1=new ChromeDriver();		
		d1.manage().window().maximize();
		//Thread.sleep(500);
		d1.get("https://google.com");
		Reporter.log("hello world",true);
	
	}
}