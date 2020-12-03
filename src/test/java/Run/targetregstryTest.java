package Run;

import org.testng.annotations.Test;

import Target.registry;
import codetostart.targetstart;




public class targetregstryTest extends targetstart {
  //@Test
  public void regesrytest() {
		  
	  registry obj= new registry(driver);
		obj.signInButton();
		
  }
 
}
