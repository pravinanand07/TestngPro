package org.church;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedB {
static WebDriver driver;
@BeforeClass
public static void laucnch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
}
@BeforeMethod
public void start() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void m1() {
	WebElement el = driver.findElement(By.id("i-icon-profile"));
	el.click();
}
@Test
public void m2() {
	WebElement le = driver.findElement(By.id("signInLink"));
	le.click();
}
@Test
public void m3() {
	driver.findElement(By.id("mobileNoInp"));
}
@Test
public void m4() {
	WebElement al = driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[5]"));
    al.sendKeys("8939496474");
}
}
