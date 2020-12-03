package codetostart;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class targetstart {
	public WebDriver driver;
	@Parameters({"browser","RUI"})
 
	@BeforeMethod
  public void beforeMethod(String browser, String site ) {
	  
	  if (browser.equalsIgnoreCase("Chrome")){

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
			String dir=System.getProperty("user.dir");
			System.out.println(dir);
			
			driver= new ChromeDriver();
			driver.get(site);
			driver. manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
		   
		} else if ( browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");
			String dir=System.getProperty("user.dir");
			
			driver= new FirefoxDriver();
			driver.get(site);
			driver. manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
}

@AfterClass
public void afterClass() {
	  driver.quit();
}
}


