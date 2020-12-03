package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgot_pass {
	public WebDriver driver;
	
	@FindBy(id = "identify_email")
	WebElement searchfield;
	
	
	@FindBy(name = "did_submit")
	WebElement searchbutton;
	
	@FindBy (xpath = "(//*[text()=\"Find Your Account\"])[2]")
			WebElement findyourAccountin;


	
	public forgot_pass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
   
    
        public void searchFiled( String name1) {
    	searchfield.sendKeys(name1);
    	searchfield.clear();
        	
    }


    public void searchButton() {
    	searchbutton.click();
    	
        	
    }
	
	public WebElement text_in_forget_your_page() {
		
				return findyourAccountin;
		
	}
	
	
}
