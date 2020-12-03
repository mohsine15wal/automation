package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver. manage().window().maximize();
		
		//Xpath=//input[@name='uid']
		//Xpath=//td[text()='UserID']
		
		WebElement creatanaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		creatanaccount.click();
		Thread.sleep(5000);
    //  WebElement sign = driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));	
	WebElement sign= driver.findElement(By.xpath("(//*[contains(text(),'Sign' )])[6]"));
		sign.click();
	
	
	}
	
	

}
