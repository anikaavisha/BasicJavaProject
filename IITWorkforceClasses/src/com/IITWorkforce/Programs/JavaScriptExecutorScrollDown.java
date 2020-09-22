package com.IITWorkforce.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutorScrollDown {
	public WebDriver driver;
	public JavaScriptExecutorScrollDown (WebDriver driver){
		this.driver = driver;
	}
	
	public void patientLogin(String userName, String pass) throws InterruptedException{
		//driver.findElement(By.xpath("//a[text()='Patient Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[1]")));
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void adminLogin(String userName, String pass) throws InterruptedException{
	//driver.findElement(By.xpath("//a[text()='Office Login']")).click();
    WebDriverWait wait = new WebDriverWait(driver,50);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[2]")));
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0,3100)");
//    js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//a[text()='Login'])[2]")));
	driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.name("admin")).click();
		
		
	}

}
