package trainingsession.test_PIIT;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver. manage().window().maximize();
		
		Thread.sleep(6000);
		//WebElement create= 
		driver.findElement(By.linkText("Create New Account")).click();
		//create.
		
		Thread.sleep(6000);
		WebElement month= driver.findElement(By.name("birthday_month"));
			Select ob= new Select(month);	
			ob.selectByValue("6");
		
		Thread.sleep(6000);	
		WebElement day=driver.findElement(By.name("birthday_day"));
			Select da=new Select(day);
			da.selectByValue("4");
			
		
			WebElement year=driver.findElement(By.name("birthday_year"));
				Select ye= new Select(year);
				ye.selectByValue("1990");
				
				WebElement femal=driver.findElement(By.id(("u_2_2")));
			
				femal.click();
				
				femal.clear();
				Thread.sleep(2000);	
				driver.findElement(By.id("u_1_3")).click();
				
				
	}

}
