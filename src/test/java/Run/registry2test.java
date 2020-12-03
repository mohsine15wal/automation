package Run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Target.registry2;
import facebook.forgot_pass;
import facebook.home;

public class registry2test  {
	 public WebDriver driver;
	@Test
  public void f() {
	
	registry2  object= new registry2 (driver);
	   object.weekyAddKey2();
	 
	   
  }
}
