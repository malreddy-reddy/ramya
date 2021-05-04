package com.malreddy.maven.java.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
   @Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement en = driver.findElement(By.id("identifierId"));
		en.clear();
		en.sendKeys("malreddy047");
		WebElement en1 = driver.findElement(By.id("identifierNext"));
        en1.click();
        Thread.sleep(5000);
        driver.close();
	}
}


