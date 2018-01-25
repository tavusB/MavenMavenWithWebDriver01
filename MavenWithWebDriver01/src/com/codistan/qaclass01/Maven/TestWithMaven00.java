package com.codistan.qaclass01.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWithMaven00 {
	//testng xml file acjak bolsan maven projecte gidip convert to testng basmaly
	@Test
	
	public void amazonTest() {
		
	
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\BN\\Desktop\\TAVUS CODISTAN\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com/");
	
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("fidget" + Keys.ENTER);
}
}
