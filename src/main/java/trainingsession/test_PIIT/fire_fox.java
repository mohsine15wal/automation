package trainingsession.test_PIIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fire_fox {
   
	static WebDriver driver;
	
	
 public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
	 driver("chrome","https://www.amazon.com/");
	
	}
public static void driver(String browser, String RUI) {
	
	if (browser.equalsIgnoreCase("Chrome")){

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		String dir=System.getProperty("user.dir");
	System.out.println(dir);
	
	driver= new ChromeDriver();
	driver.get(RUI);
	driver. manage().window().maximize();
	
   
} else if (browser.equalsIgnoreCase("Firefox")) {
	
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");
	String dir=System.getProperty("user.dir");
	
	driver= new FirefoxDriver();
	driver.get(RUI);
	driver. manage().window().maximize();
	
}
	
}
}


	

	



