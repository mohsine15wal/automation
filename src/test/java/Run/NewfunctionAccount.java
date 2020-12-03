package Run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import codetostart.Usiblity;
import facebook.forgot_pass;
import facebook.home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.PriorityQueue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class NewfunctionAccount extends Usiblity {
 
	
  
	@Test (priority = 2 ,dependsOnMethods = "g") //it means if "g" pass that "f" will run if "g" failed "f" won't run
  public void f() {
	
	home object= new home(driver);
		object.emailfield("mohsine@hotmail.com");
		object.passflied("mohsine");
		object.sign();
		
		
		  }
	@Test (priority = 1)	
	public void g() {
		System.out.println("g");
	}
}
	   
	   
   

  
  

