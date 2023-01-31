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

public class Task12 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.snapdeal.com/");
		
		WebElement txt = driver.findElement(By.name("keyword"));
		txt.sendKeys("HP laptop",Keys.ENTER);
		
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(f);
		
		File fl=new File("C:\\Eclipse\\Task12.png");
		FileUtils.copyFile(f, fl);
		
		driver.quit();

}
}
