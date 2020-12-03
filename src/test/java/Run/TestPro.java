package Run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestPro {
  @Test
  public void f() throws IOException {
	  Properties pro= new Properties();
	  FileInputStream ds =new FileInputStream("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\src\\main\\java\\trainingsession\\test_PIIT\\Conf.properties");
	  pro.load(ds);
	  System.out.println(pro.getProperty("name"));
	  System.out.println(pro.getProperty("student"));
  }
}
