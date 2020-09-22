package com.IITWorkforce.Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAnAppointment {
	public static WebDriver driver;
	
	
	
	public  static void openApp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Schedule Appointment")).click();
		driver.findElement(By.xpath("//div[@class='panel panel-cascade']//div//a//input")).click();
	}
	
	public static void datePicker(String date){
		
		String apptDate[] = date.split("/");
		String day,month,year;
		day = apptDate[0];
		month = apptDate[1];
		year = apptDate[2];
		String calDay,calMonth,calYear;
		calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while(!(calYear.equals(year))){
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			}
		calMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		while(!(calMonth.equals(month))){
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			calMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			}

		
	List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(int i=0;i<dayList.size();i++){
	       calDay = dayList.get(i).getText();
	       if(calDay.equals(day)){
	    	   dayList.get(i).click();
	    	   
	       }
	    	   
	       }
		
		
		
	}
	
	public static void apptTime(String text){
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='time']")));
		select.selectByVisibleText(text);
		
	}
	
	public static void drSelection(){
		List<WebElement> drList	= driver.findElements(By.xpath("//table[@class='table']//td"));
		int drCount= drList.size();
		for(int i=0;i<drCount;i++){
			String text = drList.get(i).getText();
			System.out.println(text);
			if (text.contains("Dr.Beth")){
				driver.findElement(By.xpath("//td[1]//button[1]")).click();
				break;
			}
		}
	}
	
	public static void apptSchedule() throws InterruptedException{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		datePicker("1/January/2020");
		apptTime("10Am");
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement e= wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(("ChangeHeatName")))));
		System.out.println(e);
		e.click();
		
	}

	public static void main(String[] args) throws InterruptedException {
	openApp();
	drSelection();
    Thread.sleep(3000);
	apptSchedule();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='sym']")).sendKeys("Thanks");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	

}

	


}


