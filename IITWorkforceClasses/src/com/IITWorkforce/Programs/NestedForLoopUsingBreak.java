package com.IITWorkforce.Programs;


	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	 
public class NestedForLoopUsingBreak {

	public WebDriver driver;

	public boolean verifyServiceType(String sName) throws InterruptedException {
		boolean result = false;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.xpath("//form[@id='login-form']")).submit();
		driver.findElement(By.id("appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension"))
				.click();
		driver.findElement(By.id("appointmentschedulingui-manageAppointmentTypes-app")).click();
		List<WebElement> pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));

		// Example for Nested for loop
		outerloop: 
			for (int i = 0; i < pageList.size(); i++) {
			pageList.get(i).click();
			pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));
			List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
			for (int j = 0; j < tdList.size(); j++) {
				if (tdList.get(j).getText().contains(sName)) {
					System.out.println("Service Type Found!!!");
					result = true;
					break outerloop;
				}
			}
		}
		return result;
	}

	public boolean deleteServiceType(String serviceType) {
		boolean result = false;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.xpath("//form[@id='login-form']")).submit();
		driver.findElement(By.id("appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension"))
				.click();
		driver.findElement(By.id("appointmentschedulingui-manageAppointmentTypes-app")).click();

		List<WebElement> pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));

		// Example for Nested for loop
		outerloop: for (int i = 0; i < pageList.size(); i++) {
			pageList.get(i).click();
			pageList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable_paginate']/span/a"));
			List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
			for (int j = 0; j < tdList.size(); j++) {
				if (tdList.get(j).getText().contains(serviceType)) {
					driver.findElement(
							By.xpath("//table[@id='appointmentTypesTable']//span/i[@id='appointmentschedulingui-delete-"
									+ serviceType + "']"))
							.click();
					List<WebElement> deleteButtonList = driver.findElements(By.xpath("//button[text()='No']"));
					for (int k = 0; k < deleteButtonList.size(); j++) {
						WebElement e = deleteButtonList.get(k);

						if (e.isDisplayed() || e.isEnabled() || e.isSelected()) {
							e.click();
							System.out.println("Button Found ");
							result = true;
							break outerloop;

						}
					}
				}

			}
		}
		return result;
	}

}
