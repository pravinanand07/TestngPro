package org.church;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMpom {

	@FindBy(id="email")
	public static WebElement loginname;
	@FindBy(id="pass")
	public static WebElement loginpassword;
	@FindBy(xpath="//*[@id=\'u_0_b\']")
	public static WebElement loginlogin;
}
