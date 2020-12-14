package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "https://www.bmw.com/en/index.html";
	        String expectedTitle = "BMW.com | The international BMW Website";
	        String actualTitle = "";

	 

	        driver.get(baseUrl);
	        actualTitle = driver.getTitle();

	 

	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }

	 

	        driver.close();
		
	}

}
