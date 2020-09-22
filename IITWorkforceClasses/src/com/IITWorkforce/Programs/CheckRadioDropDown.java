package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRadioDropDown {
	public WebDriver driver;
	@Test
	public void practiceTotalQa(){
	    System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://total-qa.com/selenium-webdriver/practise-website/");
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		Select c = new Select(driver.findElement(By.id("COUNTRY")));
		c.selectByIndex(1);
		
		
	}

}
