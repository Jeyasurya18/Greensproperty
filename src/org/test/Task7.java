package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		WebElement txt = driver.findElement(By.id("heading20"));
		txt.click();
		
		WebElement txt1 = driver.findElement(By.xpath("//span[text()='Certification']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",txt1);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File fl = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(fl);
		
		File f=new File("C:\\Eclipse\\Task7.png");
		
		FileUtils.copyFile(fl, f);
		
		driver.quit();

	}
}
