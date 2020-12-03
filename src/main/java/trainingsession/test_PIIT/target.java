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

public class target {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		image();
		
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		image();
		
		driver.findElement(By.xpath("//*[@id=\"accountNav-createAccount\"]/a/div")).click();
		
		
	}
public static void image() throws IOException {
	Date dt = new Date();
	System.out.println(dt);
	String si= dt.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(si);
		 File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(shots,new File("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\walmart screenshot"+si+".png"));
}
}
