package Run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import codetostart.Usiblity;
import facebook.home;

public class NewTest extends Usiblity {
  @Test
  public void f1() throws IOException {
	  home object= new home(driver);
	  Properties pro= new Properties();
	  FileInputStream ds =new FileInputStream("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\src\\main\\java\\trainingsession\\test_PIIT\\Conf.properties");
	  pro.load(ds);
	  String name=pro.getProperty("name");
	  String psw=pro.getProperty("password");
	  
	  object.emailfield(name);
		object.passflied(psw);
		object.sign();
  }
  //@Test
  public void g1() {
	 
	  home object= new home(driver);
		object.emailfield("mohsine150@hotmail.com");
		object.passflied("mohs");
		object.sign();
  }
 // @Test
  public void g2() {
	 home object= new home(driver);
	  WebDriver driver = null;
		
	
		WebElement emaikey= driver.findElement(By.name("name"));
		
}
}
