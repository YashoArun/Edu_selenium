package edu_selenium;

import org.openqa.selenium.WebDriver;

public class day1 {

	WebDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "")
		driver = new CromeDriver();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
