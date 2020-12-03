package Run;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logges {

	public static Logger lg =Logger.getLogger(logges.class.getName());

public static void main(String[] args) {
		// TODO Auto-generated method stub
PropertyConfigurator.configure("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\src\\main\\java\\trainingsession\\test_PIIT\\logged.properties");
	lg.info("this is our first logs for use");
}


}
