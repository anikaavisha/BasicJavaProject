package com.IITWorkforce.Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.malabargoldanddiamonds.com/us/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='menu3']/div/a/span"))).build().perform();
	    driver.findElement(By.linkText("Ring")).click();
	    driver.findElement(By.xpath("(//label[@class='label_filter icon-checkboxes-01'])[6]/input")).click();
	    action.moveToElement(driver.findElement(By.xpath("(//span[text()='Gold Bar'])[1]"))).build().perform();
	    driver.findElement(By.linkText("8g")).click();
	    
		
		

}
}
