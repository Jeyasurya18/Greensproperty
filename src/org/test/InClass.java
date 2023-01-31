package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//To Use JavascriptExecutor Concept
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		
		//To ScrollDown using pixels 
		ji.executeScript("window.scrollBy(0,1000)");
		
		//To ScrollUp using pixels
		ji.executeScript("window.scrollBy(0,-800)");
		
		//To ScrollDown Using WebElement
		Thread.sleep(3000);
		WebElement li = driver.findElement(By.xpath("//img[@alt='Birthday store']"));
		ji.executeScript("arguments[0].scrollIntoView(true)",li);
		
		//To ScrollUp Using WebElement
		Thread.sleep(3000);
		WebElement liv = driver.findElement(By.xpath("(//img[@alt='Furniture'])[1]"));
		ji.executeScript("arguments[0].scrollIntoView(false)",liv);
		
		//To SetAttribute in SearchBox using WebElement
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		ji.executeScript("arguments[0].setAttribute('value','iphones')",txt);
	}

}
