package com.scubaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gokulpa/Documents/SCUBA DIVE 2023/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		// GokulBranch
	}

}
