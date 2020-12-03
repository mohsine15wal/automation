package codetostart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;

public class Usiblity {
 
	public WebDriver driver;
	
@Parameters({"browser","RUI"})
	
  @BeforeClass
  public void beforeClass(String  browser, String site) {
	
		
		if (browser.equalsIgnoreCase("Chrome")){

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
			String dir=System.getProperty("user.dir");
			System.out.println(dir);
			
			driver= new ChromeDriver();
			driver.get(site);
			driver. manage().window().maximize();
			
		   
		} else if ( browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");
			String dir=System.getProperty("user.dir");
			
			driver= new FirefoxDriver();
			driver.get(site);
			driver. manage().window().maximize();
		}
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
