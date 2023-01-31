package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("motorolo",Keys.ENTER);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(f);
		
		File fl=new File("C:\\Eclipse\\Task10.png");
		FileUtils.copyFile(f, fl);
		
		driver.quit();

}
}
