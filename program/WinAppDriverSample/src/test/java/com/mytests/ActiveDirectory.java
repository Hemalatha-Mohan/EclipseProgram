package com.mytests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class ActiveDirectory {
	
	public static WindowsDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	//setup method
	
	public void setup() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app","C:\\Users\\Public\\Desktop\\Oracle VM VirtualBox.lnk" );
		cap.setCapability("platform", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
		
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"),cap);
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	 @AfterMethod
	 public void cleanUp() {
		 driver.quit();
		 setup();
		 
	 }
	 
	 @AfterSuite
	 public void tearDown() {
		 driver.quit();
		 
	 }
	 
	 @Test
	 public void checkStart() {
		driver.find
	 }

}
