package org.church;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDat {

	@Test(dataProvider="Grenade")
	public void d1(String a1,String a2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(a1);
		driver.findElement(By.id("pass")).sendKeys(a2);
	}
	@DataProvider(name="Grenade",parallel=true)
	public static Object[][]data() {
		return new Object[][] {{"praveen","12345"} , {"madhu","67890"} , {"kavi","09876"}};

	}
}
