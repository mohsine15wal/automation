package trainingsession.test_PIIT;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver. manage().window().maximize();
		
		Thread.sleep(4000);
		
		// create an action object // action class always you put buid and performance
		Actions ob=new Actions(driver);
				
		ob.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		ob.moveToElement(driver.findElement(By.xpath("//*[text()='Sign in']"))).click().build().perform();
	
		
	
		ob.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.SHIFT).click().build().perform();	
      	ob.keyUp(Keys.SHIFT).build().perform();
      		
		
		String parentwindowhandle= driver.getWindowHandle();
		System.out.println(parentwindowhandle);
		
		Set<String> Multiplewindows=driver.getWindowHandles();
		
		for (String windows: Multiplewindows) {
			 			System.out.println(windows);
					
			 			if (windows.equalsIgnoreCase(parentwindowhandle));{
						System.out.println("this is to switch");
					
					} else {
						driver.switchTo().window(windows);
					}
		}
				 
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("mohsine");
		
		driver.switchTo().window(parentwindowhandle);
		WebElement user=driver.findElement(By.id("ap_customer_name"));
		user.sendKeys("essadsi");
	}

	

}
