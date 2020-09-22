package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement w	= driver.findElement(By.id("u_0_m"));
	w.sendKeys("Ekta");
	System.out.println(w.getAttribute("value"));
	System.out.println(w.getAttribute("name"));
	System.out.println(w.getSize());
	System.out.println(w.getTagName());
	System.out.println(w.getCssValue("background-color"));
	}

}
