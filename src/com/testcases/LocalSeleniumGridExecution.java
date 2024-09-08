package com.testcases;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocalSeleniumGridExecution {
	
	public static RemoteWebDriver driver;
	
	@Test
	
	public void OpenBrowser() throws MalformedURLException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		//Step 1 setup the URL for selenium grid
		
		String url = "http://192.168.1.4:4444/wd/hub";
		
		//Step 2 we have to set up the chromeoptions for lauching the browser
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//step 3 - Create a map interface to define the build and name of the test
		
	/*	Map<String,Object> cloudOption = new HashMap();
		
		cloudOption.put("build", "Smoke Test");
		cloudOption.put("name", "Chrome Test");
		
		options.setCapability("cloud-options", cloudOption);*/
		
		driver = new RemoteWebDriver(new URL(url),options);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}
	
	
}

