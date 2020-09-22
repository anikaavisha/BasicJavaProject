package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableRow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.valuepenguin.com/banking/average-bank-interest-rates");
		String rate = driver.findElement(By.xpath("/tbody//td[text()='Capital One']/following-sibling::td[3]")).getText();
		System.out.println(rate);

	}

}
