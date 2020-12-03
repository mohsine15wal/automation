package trainingsession.test_PIIT;


import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class popups {
static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		
		
		
		driver. manage().window().maximize();
	Picture();
		driver.findElement(By.id("cookie-close")).click();
		Picture();
		driver.findElement(By.id("T7-departure_1")).click();
		Picture();
		driver.findElement(By.xpath("(//*[text()='27'])[2]")).click();
			
}


	 public static void Picture() throws IOException {
		
		 Date dt = new Date();
	System.out.println(dt);
	String si= dt.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(si);
		 File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(shots,new File("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\screenshotd\\"+si+".png"));
	}

}
//capture the date and time
		 //convert to string format
		 //use with the picture name
	
//screen shot
		/*Thread.sleep(4000);
		WebElement sb= driver.findElement(By.name("submit"));
		sb.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	Thread.sleep(1000);
		driver.switchTo().alert().accept();
	Thread.sleep(1000);
		driver.switchTo().alert().accept();*/
