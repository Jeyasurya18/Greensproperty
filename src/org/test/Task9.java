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
import org.openqa.selenium.interactions.Actions;

public class Task9 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.flipkart.com/");
		
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clk.click();
		
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("iphone",Keys.ENTER);
		
		WebElement txt1 = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(txt1).perform();
		
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(f);
		
		File fl=new File("C:\\Eclipse\\Task9.png");
		FileUtils.copyFile(f, fl);
		
		driver.quit();
		
		

}
	
	
}
