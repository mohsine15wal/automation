package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facelogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver. manage().window().maximize();
		driver.findElement(By.name("email"));
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement sign= driver.findElement(By.name("login"));
		WebElement forgot= driver.findElement(By.linkText("Forgot Password?"));
		WebElement signbt = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button/"));
		
		
				 email.sendKeys("mohsine15@hotmail.com");
		         pass.sendKeys("momomo");
		         sign.click();
		        //forgot.click();
		        signbt.click();
		  

	}

	

}
