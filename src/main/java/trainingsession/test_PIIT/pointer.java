package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class pointer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver. manage().window().maximize();
		
		Thread.sleep(4000);
		
		// create an action object // action class always you put buid and performance
		Actions ob=new Actions(driver);
		
		ob.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		ob.moveToElement(driver.findElement(By.xpath("//*[text()='Sign in']"))).click().build().perform();
		
		
		// open a page in another windows
		ob.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.SHIFT).click().build().perform();	
      
		// to realese the key use this code
		ob.keyUp(Keys.SHIFT).build().perform();
	}

}
