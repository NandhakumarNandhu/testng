package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass {

	public static void main(String[] args) {

		lanchBrowser();
		toPassUrl("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.id("email"));
		
		toSendKeys(text, "Nandhu");
		WebElement e = driver.findElement(By.id("pass"));
		
		toSendKeys(e, "Nandhu@123");
		
		WebElement r = driver.findElement(By.name("login"));
		
		toClick(r);
	}

}
