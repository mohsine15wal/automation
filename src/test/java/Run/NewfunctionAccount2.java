package Run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import codetostart.Usiblity;
import facebook.forgot_pass;
import facebook.home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class NewfunctionAccount2 extends Usiblity  {
 
	
	  
   @Test
   public void forpass()  {
	 
	   home object= new home(driver);
	   object.forglink();
	
	forgot_pass obj= new forgot_pass(driver);
	 
	   SoftAssert gt =new SoftAssert();
	   String text_in= obj.text_in_forget_your_page().getText();
	   System.out.println(text_in);
	  
	  gt.assertEquals(text_in, "Find Your Account");
	  obj.searchFiled("mohsine@hotmail.com");
	   obj.searchButton();
	  
	   gt.assertAll();
	   
	   
   }

 
  }

 
  

