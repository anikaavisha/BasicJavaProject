package com.IITWorkforce.Programs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryingDatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String departureDate= "1/January/2022";
		String date[] = departureDate.split("/");
		String day = date[0];
		String month = date[1];
		String year = date[2];
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		String calDay= null;;
		String calMonth;
		String calYear;
		driver.findElement(By.id("DepartDate")).click();
		calYear	= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    System.out.println(calYear);
	while(!(calYear.equals(year))){
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
		calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		
	}
	calMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
	System.out.println(calMonth);
	while(!(calMonth.equals(month))){
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
		calMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		
		
		
		
		
	}
	
List<WebElement> allDay	= driver.findElements(By.xpath("//table[@class='calendar']//td"));
for(int i=0;i<allDay.size();i++){
	calDay= allDay.get(i).getText();
	if(calDay.equals(day)){
		allDay.get(i).click();
		
		break;
	}
}
System.out.println(calYear);
System.out.println(calMonth);
System.out.println(calDay);

	}

}
