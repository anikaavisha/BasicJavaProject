package com.IITWorkforce.Programs;



	
		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class DatePicker {

			public void pickingDate() {
				String dot = "9/November/2021";
				String day, month ,year;
				String calDay,calMonth,calYear;
				String date[] = dot.split("/");
				System.out.println(day =date[0]);
				System.out.println(month = date[1]);
				System.out.println(year =date[2]);
				
				 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (5)\\chromedriver.exe");
					ChromeDriver driver=new ChromeDriver();
					driver.get("http://cleartrip.com");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElement(By.id("DepartDate")).click();
					
					WebElement cal;
					cal=driver.findElement(By.className("calendar"));
					calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
					System.out.println(calYear);
					
					while(!(calYear.equals(year))){
						driver.findElement(By.className("nextMonth")).click();
						System.out.println(calYear);
						calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
						
					}
					
					calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
					while(!(calMonth.equals(month))){
						driver.findElement(By.className("nextMonth")).click();
						System.out.println(calMonth);
						calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
						}
					cal=driver.findElement(By.className("calendar"));
					List<WebElement> rows,cols;
					rows = cal.findElements(By.tagName("tr"));
					
				
					for(int i=0;i<rows.size();i++){
						
						cols = rows.get(i).findElements(By.tagName("td"));
					
						
						for(int j=0;j<cols.size();j++){
							calDay = cols.get(j).getText();
							if(calDay.equals(day)){
								cols.get(j).click();
								System.out.println(calDay);
								break;
							}
						
							
						}
					
					
					}
				
					

			}
			public static void main(String[] args) {
				DatePicker dp = new DatePicker();
				dp.pickingDate();
			}
	

}


