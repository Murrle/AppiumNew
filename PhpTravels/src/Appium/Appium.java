package Appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Appium {
	
@Test
public void appium_test() throws IOException  {
	WebDriver driver;
	
	//System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");
	//System.setProperty("webdriver.chome.driver", "./Driver/chromedriver.exe");
	//WebDriver  driver = new FirefoxDriver();
	DesiredCapabilities capailities = new DesiredCapabilities();
	capailities.setCapability("AutomationName", "UIAutomator2"); //XCUITest --iphone
	capailities.setCapability("platformName", "Android");
	capailities.setCapability("platformversion", "6.0.1");
	capailities.setCapability("deviceName", "emulator-5554");//ZF62243R47
	capailities.setCapability("browserName", "chrome");
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capailities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.phptravels.net/login");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
