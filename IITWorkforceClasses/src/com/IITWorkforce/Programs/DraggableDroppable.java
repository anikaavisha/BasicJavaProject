package com.IITWorkforce.Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDroppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']")));
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']")));
		action.release(driver.findElement(By.xpath(".//*[@id='droppable']")));
		action.perform();
		String color= driver.findElement(By.xpath(".//*[@id='droppable']")).getCssValue("background-color");
		System.out.println(color);
		
	}

}
