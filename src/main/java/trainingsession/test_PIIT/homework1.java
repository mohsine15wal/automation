package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homework1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver. manage().window().maximize();
	
		Thread.sleep(5000);
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("mohsine15@hotmail.com");
		WebElement passw= driver.findElement(By.name("pass"));
		passw.sendKeys("momo123");
		WebElement signin= driver.findElement(By.name("login"));
		signin.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		WebElement create= driver.findElement(By.linkText("Create New Account"));
		create.click();
		
		Thread.sleep(3000);
		WebElement month= driver.findElement(By.name("birthday_month"));
			Select ob= new Select(month);	
			ob.selectByValue("6");
		
		Thread.sleep(3000);	
		WebElement day=driver.findElement(By.name("birthday_day"));
			Select da=new Select(day);
			da.selectByValue("4");
			
			Thread.sleep(3000);	
			WebElement year=driver.findElement(By.name("birthday_year"));
				Select ye= new Select(year);
				ye.selectByValue("1990");
		
				Thread.sleep(3000);
				WebElement female= driver.findElement(By.name("sex"));
				female.click();
				
		
		
	
		
	
	
	
	}

}
