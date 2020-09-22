package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framePractice {
public WebDriver driver;
	@Test 
	public void frames(){
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://total-qa.com/live-examples/subframe1/");
		driver.switchTo().frame("Frame 1 ");
		driver.findElement(By.id("Frame1txt")).sendKeys("a");

	}

}
