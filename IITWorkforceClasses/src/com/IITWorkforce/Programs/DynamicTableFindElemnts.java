package com.IITWorkforce.Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableFindElemnts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.valuepenguin.com/banking/average-bank-interest-rates");
		 List<WebElement> rows= driver.findElements(By.xpath("(//tbody[@class='Table--tbody'])[2]/tr"));
		int rowCount = rows.size();
		for(int i=0;i<rowCount;i++){
			WebElement eachRow = rows.get(i);
			String text= eachRow.getText();
			if(text.contains("Citibank")){
				System.out.println("RowNumber" + i);
				System.out.println(driver.findElement(By.xpath("(//tbody[@class='Table--tbody'])[2]/tr["+(i+1)+"]")));
			String  interestRate	= driver.findElement(By.xpath("(//tbody[@class='Table--tbody'])[2]/tr["+(i+1)+"]/td[4]")).getText();
				System.out.println(interestRate);
				
				
			}
		}

	}

}
