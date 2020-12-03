package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class Automation {
static WebDriver driver;
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
// how to open browser 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			// driver= new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	//driver. manage().window().maximize();
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\Driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	

	driver.get("https://www.amazon.com/");
			driver. manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		driver .findElements(By.id("twotabsearchtextbox"));
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-text"));
			searchbox.sendKeys("iphone11");
			driver.findElement(By.id("nav-search-submit-text"));		
			searchbutton.click();
		
			
		
		
			
		
		
	}

}