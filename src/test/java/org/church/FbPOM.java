package org.church;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class FbPOM {
        
	    @Test
		public void login() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\TestngPro\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			PageFactory.initElements(driver, POMpom.class);
			
			POMpom.loginname.sendKeys("pravinanand07@gmail.com");
			POMpom.loginpassword.sendKeys("prn1234123");
			POMpom.loginlogin.click();
	}

}
