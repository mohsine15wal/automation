package trainingsession.test_PIIT;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice3 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Thread.sleep(3000);
		
		driver.get("https://www.walmart.com");
		driver. manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Account'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vh-account-menu-root\"]/div[2]/div/a[1]/div/span/div")).click();
		
		driver.findElement(By.id("email")).sendKeys("mohsine15@hotmail.com");
		
		driver.findElement(By.id("password")).sendKeys("momo");
		
		driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button[1]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//*[text()='Account'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vh-account-menu-root\"]/div[2]/div/a[3]/div/span/div")).click();
		driver.findElement(By.xpath("(//*[text()='create an account'])[1]")).click();
	
	
	}
	
	 public static void Picture() throws IOException {
			
		 Date dt = new Date();
	System.out.println(dt);
	String si= dt.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(si);
		 File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(shots,new File("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\walmart screensho\\walmart"+si+".png"));
	}

}
