package org.facebook.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.IIT.MMP.ReusableMethods.BaseClass;
import org.IIT.MMP.ReusableMethods.ReadingExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider{
	
	@DataProvider(name="DP")
    public String[][] calling() throws IOException{
    	ReadingExcel re = new ReadingExcel();
     return re.readingXlswithoutHeading("Login.xls");
    
    }
	@Test(dataProvider ="DP")
	public static void openApp(String uName,String pwd) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Patient Login']")).click();
		Thread.sleep(30000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(30000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	
	}
	
	
	

}

