package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcplicitWaitElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.philasd.org/");
		
		Select e = new Select(driver.findElement(By.xpath(".//*[@id=':0.targetLanguage']/select")));
		e.selectByVisibleText("Zulu");
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement p= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//font[text()='Unentshisekelo yokujoyina iqembu lethu? ']")));
	
	String s= p.getText();
	System.out.println(s);

	}

}