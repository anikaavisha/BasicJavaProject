package com.IITWorkforce.Programs;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorCommands {
        public static WebDriver driver;
        
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	Object o	= js.executeScript("return document.title");
	 String title = (String)o;
	 System.out.println(title);
	 
	 js.executeScript("return document.getElementById('email').setAttribute('value','adf@gmail.com')" );
	 
	 
		
		

	}

}
