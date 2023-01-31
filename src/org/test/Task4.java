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

public class Task4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\seleniumDay7\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.className("close"));
		clk.click();
		
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",txt);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File fl = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(fl);
		
		File f=new File("C:\\Eclipse\\Sele.png");
		
		FileUtils.copyFile(fl, f);
		
		driver.quit();

}
}
