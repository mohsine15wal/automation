package Run;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
 
	@Test(groups = {"smoke"})
  public void f() {
		System.out.println("somke test for f");
  }
  
  @Test(groups = {"smoke","adhoc"})
  public void f1() {
	  System.out.println("somke and adhoc test for f1");
  }
  
  @Test(groups = {"adhoc","Regression"})
  public void f2() {
	  System.out.println("adhoc,Regression test for f2");
  }
  @Test (groups = {"smoke","Regression"})
  public void f3() {
	  throw new SkipException("forcefuly skipping");
	 // System.out.println("smoke,Regression test for f3");
  }
  @Test(groups = {"adhoc"})
  public void f4() {
	  System.out.println("adhoc test for f4");
  }
  @Test(groups = {"Regression"})
  public void f5() {
	  System.out.println("Regression test for f5");
  }
}
