package org.church;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleProb {
	static WebDriver driver; 
@BeforeClass
public static void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@BeforeMethod
public void Start() {
	Date a = new Date();
	System.out.println(a);
}
@Test
public void s1() {
	driver.findElement(By.id("email")).sendKeys("pravinanand07");
}
@Test
public void s2() {
	driver.findElement(By.id("pass")).sendKeys("1234567890");
}
@Test
public void s3() {
	driver.findElement(By.id("u_0_b")).click();
}
@AfterMethod
public void end() {
	Date a = new Date();
	System.out.println(a);
}
@AfterClass
public static void quit() {
	driver.quit();
}
}
