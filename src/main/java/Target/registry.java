package Target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import codetostart.targetstart;

public class registry  {
	
	public WebDriver driver;
	
	
		@FindBy(xpath = ("(//*[text()=\"Weekly Ad\"])[2]")) 
		WebElement weekadd ;
		
		
		public registry(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		 public void signInButton() {
			 weekadd.click();
		        	
		    }
}
