package Appium;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Appium_GenericFunctions.GenericFunction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppiumMobileopers {

	
	public AndroidDriver<?> driver;
	@Test
	public void test() throws IOException {
		
		GenericFunction obj = new GenericFunction();
		driver =obj.launchBrowser(driver);
		//WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.EditText[1]"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} TouchAction action = new TouchAction(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.tap(driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.dolphpire.calculator.material:id/digit_7')]")));
        
        action.press(driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'com.dolphpire.calculator.material:id/pad_advanced')]")));
        action.moveTo(driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'com.dolphpire.calculator.material:id/pad_advanced')]")),0,888);

        //action.moveTo(driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'com.dolphpire.calculator.material:id/pad_numeric')]")),300,400);

        action.release();
       action.perform();
      }
  
		
	}
	

