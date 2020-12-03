package Run;

import org.testng.annotations.Test;

import codetostart.Usiblity;
import facebook.home;

import org.testng.annotations.DataProvider;

public class Provider extends Usiblity {
 
	@Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  home object= new home(driver);
		object.emailfield(n);
		object.passflied(s);
		Thread.sleep(6000);
		object.sign();
  }
//data provider help us 
 
	@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"mohsine@hotmail.com", "mohsine" },
      new Object[] { "mohsine12@hotmail.com", "mohsine12" },
      new Object[] { "mohsine123@hotmail.com", "12mohsine12" },
    };
  }
}
