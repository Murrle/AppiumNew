package Appium;

import static org.junit.Assert.*;

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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class Appium_JarFiles {
public AndroidDriver<?> driver;
	@Test
	public void test() throws IOException {
		
		DesiredCapabilities capailities = new DesiredCapabilities();
		capailities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9"); //XCUITest --iphone
		capailities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
		capailities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		capailities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capailities.setCapability("app", "C:/Users/Admin/Downloads/Apks/calculator.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capailities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
	String test =	driver.findElement(By.xpath("//*[@class='RTL']")).getText();
	System.out.println(test);
	File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile, new File("D:/test.jpg"));
	if(test.contains("Johny")){
		
		Reporter.log("Passed");
	}
		driver.quit();
		
		
	}	
		
	

}
