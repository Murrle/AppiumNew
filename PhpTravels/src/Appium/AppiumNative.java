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


public class AppiumNative {
	@Test
	public void nativeApp() throws IOException{

		WebDriver driver;
	
	//System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");
	//System.setProperty("webdriver.chome.driver", "./Driver/chromedriver.exe");
	//WebDriver  driver = new FirefoxDriver();
	DesiredCapabilities capailities = new DesiredCapabilities();
	capailities.setCapability("AutomationName", "UIAutomator2"); //XCUITest --iphone
	capailities.setCapability("platformName", "Android");
	capailities.setCapability("platformversion", "6.0.1");
	capailities.setCapability("deviceName", "emulator-5554");
	capailities.setCapability("app", "C:/Users/Admin/Downloads/Apks/calculator.apk");
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capailities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TableLayout[2]/android.widget.TableRow[4]/android.widget.Button[2]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TableLayout[2]/android.widget.TableRow[4]/android.widget.Button[2]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TableLayout[2]/android.widget.TableRow[5]/android.widget.Button[4]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TableLayout[2]/android.widget.TableRow[6]/android.widget.Button[5]")).click();
	String test = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TableLayout[1]/android.widget.EditText")).getText();
	System.out.println(test);		
	}
}

	

