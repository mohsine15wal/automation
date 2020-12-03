package facebook;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class home {
		
		public WebDriver driver;
		
		@FindBy(name = "email")
		WebElement emaikey;
		
		@FindBy(name = "pass") 
		WebElement passkey;
		
		@FindBy(xpath = "//*[text()=\"Forgot Password?\"]")
		WebElement forglink;
		
	//@FindBy(xpath = "//*[text()=\"Create New Account\"]") 
	//WebElement creaacout;
		
		@FindBy( name = "login")
		
		WebElement signin;
		
		public home(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	public void emailfield(String name) {
		
		// Explicit wait code
		WebDriverWait it =new WebDriverWait(driver, 10);
		it.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		
			emaikey.clear();
			emaikey.sendKeys(name);
			
		}
	
	public void passflied(String pass) {
		
		WebDriverWait dg=new WebDriverWait(driver,10);
		dg.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
		 
		passkey.sendKeys(pass);
	}
	
	public void sign() {
		signin.click();
}
	public void forglink() {
		forglink.click();
		
	}
	
}
