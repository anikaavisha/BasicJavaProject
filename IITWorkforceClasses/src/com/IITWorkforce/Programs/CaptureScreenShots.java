package com.IITWorkforce.Programs;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {
	public static WebDriver driver;
	
	public static void captureScreenShot(WebDriver driver) throws IOException{

		TakesScreenshot tsh = (TakesScreenshot)driver;
		File f = tsh.getScreenshotAs(OutputType.FILE);
		String file = f.getAbsolutePath();
		FileUtils.copyFile(f,new File("C:\\ScreenShots\\SS"+Calendar.getInstance().getTimeInMillis()+".jpg"));
	}
	
    
	public static void main(String[] args) throws IOException {
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//captureScreenShot(driver);
		//captureScreenShot(driver);
		
		int a=5;
		String b="bjj";
		String c = a+b;
		System.out.println(c);
		
		
		

	}

}
