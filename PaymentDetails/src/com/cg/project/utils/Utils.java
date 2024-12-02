package com.cg.project.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	public static long PAGE_LOAD=20;
    public static long IMPLICIT_WAIT=30;
	
	public static WebDriver  getWebDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD,TimeUnit.SECONDS);
       
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS); //wait till all elements are loaded
        return driver;
	}
}
