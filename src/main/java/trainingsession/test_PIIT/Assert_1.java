package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assert_1 {
static WebDriver driver;

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\Driver\\geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver. manage().window().maximize();
	
		
		
		//to verify that the create account button is displayed 
		WebElement createAccount= driver.findElement(By.xpath("//a[@id='u_0_2']"));
		boolean button= createAccount.isDisplayed();
		System.out.println(button);
		
		//to verify the text is displayed
		WebElement tex= driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		String text= tex.getText();
		System.out.println(text);
	}

}
