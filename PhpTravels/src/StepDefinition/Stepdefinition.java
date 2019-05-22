package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	WebDriver driver;
	
	
	public void openbrowser() throws IOException{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
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
		
		
		
	}
	@Given("user has to login to test")
	//@After(order =2)
	public void close1(){
		
		System.out.println("user has to login to test");
	}
	
	@Given("user has to login")
public void close2(){
		
		System.out.println("user has to login");
	}	
	
	@When("i have {int} pens")
public void close4(int i){
		
		System.out.println("number of pens: "+i);
	}
	
	
	@Then("i have {int} pen(s) are black/blue")
public void close5(int i){
		
		System.out.println("number of pens: "+i);
		
	}
	
	@Given("user has to login to tester")
public void close6(){
		
		System.out.println("Background");
		
	}
	
	
	@Then("i have \"(.*)\" and \"(.*)\"")
public void Datadriven(String username, String password){
		
		System.out.println(username+" "+password);
		
	}
	
	@When("i have username and password")
	public void Datatables(DataTable table){
		
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		for(int i=0;i<data.size();i++){
			
			System.out.println(data.get(i).get("Fields"));
			System.out.println(data.get(i).get("Values"));
			
		}
			
			
		}
	
}
