package Target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registry2 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[text()=\"View the Weekly Ad\"]")
	WebElement weeklyabbkey2;
	
	public registry2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void weekyAddKey2() {
		weeklyabbkey2.click();
	}
	
}
