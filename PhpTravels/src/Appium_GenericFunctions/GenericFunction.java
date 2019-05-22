package Appium_GenericFunctions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GenericFunction {

	public AndroidDriver<?> launchBrowser(AndroidDriver<?> driver) throws MalformedURLException{
		
		DesiredCapabilities capailities = new DesiredCapabilities();
		capailities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9"); //XCUITest --iphone
		capailities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
		capailities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZF62243R47");
		//capailities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capailities.setCapability("app", "C:/Users/Admin/Downloads/Apks/oreo.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capailities);
		//driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public void Click(WebElement elemnt){
		if(elemnt.isDisplayed()&&elemnt.isEnabled()){
			
			elemnt.click();
			Reporter.log("Clicked on"+elemnt);
		}else{
			Reporter.log(elemnt+" "+" is either disabled or not displayed");
			
		}
		
		
		
	}
	
	public void setdata(WebElement elemnt,String data){
		if(elemnt.isDisplayed()&&elemnt.isEnabled()){
			
			elemnt.sendKeys(data);
			Reporter.log("Data eneterd in "+elemnt);
		}else{
			Reporter.log(elemnt+" "+" is either disabled or not displayed");
			
		}
		
		
		
	}
	
}
