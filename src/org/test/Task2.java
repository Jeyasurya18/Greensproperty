package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement txt = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		js.executeScript("arguments[0].scrollIntoView(true)",txt);
		
		driver.quit();

}
}
