package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitPageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/");
		driver.findElement(By.id("btn-huge-main")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		Boolean s = wait.until(ExpectedConditions.titleContains("CollegeWeek"));
		System.out.println(s);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='register']/button")).click();
		Boolean b= wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2"), "Tell us a little about yourself"));
		System.out.println(b);
		String text= driver.findElement(By.xpath("//h2")).getText();
		System.out.println(text);
		
		
		
		
		
	}

}
