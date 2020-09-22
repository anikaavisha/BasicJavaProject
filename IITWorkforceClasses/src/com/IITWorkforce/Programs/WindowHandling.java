package com.IITWorkforce.Programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.xpath("//input[@id='query']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@class='getqbtn']")).click();
		driver.switchTo().defaultContent();
		String w= driver.getWindowHandle();
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> allW= driver.getWindowHandles();
	     for(String eachW : allW){
	    	 if(!eachW.equals(w)){
	    		 driver.switchTo().window(eachW);
	    		 driver.getTitle();
	    	String price = driver.findElement(By.id("ltpid")).getText();
	    	//method used to convert String to double but in this string(price ) we have comma which we will replace) 
	    	    double p  = Double.parseDouble(price.replace(",", ""));
	    	    System.out.println(p);
	    	 }
	    	 
	     }
		
		

	}

}
