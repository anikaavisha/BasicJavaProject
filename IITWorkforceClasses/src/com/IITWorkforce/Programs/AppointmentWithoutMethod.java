package com.IITWorkforce.Programs;


	
		

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class AppointmentWithoutMethod{

			public static WebDriver driver;
			public static void datePicker(){
				String date= "1/January/2021";
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
			
			public static void apptTime(){
				Select select = new Select(driver.findElement(By.xpath(".//*[@id='time']")));
				select.selectByIndex(1);
				
			}

			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ektaj\\Desktop\\Selenium_Final\\SeleniumDownloadedFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.linkText("Schedule Appointment")).click();
			driver.findElement(By.xpath("//div[@class='panel panel-cascade']//div//a//input")).click();
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
		    Thread.sleep(3000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
			datePicker();
			apptTime();
			Thread.sleep(3000);
			driver.findElement(By.id(("ChangeHeatName"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='sym']")).sendKeys("Thanks");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			

		}

			


		}

	


	
	



