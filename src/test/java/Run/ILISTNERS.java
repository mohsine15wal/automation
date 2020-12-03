package Run;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import codetostart.Usiblity;

public class ILISTNERS extends Usiblity implements ITestListener {
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		System.out.println("Automation started");
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("Automation passed");
		this.driver=((Usiblity) result.getInstance()).driver;
		
		//screen shot code
		
		Date dt = new Date();
			System.out.println(dt);
			String si= dt.toString().replace(" ", "_").replace(":", "_");
			 System.out.println(si);
				 File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					try {//
						FileHandler.copy(shots,new File("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\screenshotd\\passed"+si+".png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.println("Automation Failed");
		
		this.driver=((Usiblity) result.getInstance()).driver;
		
		//screen shot code 
			Date dt = new Date();
			System.out.println(dt);
			String si= dt.toString().replace(" ", "_").replace(":", "_");
			System.out.println(si);
	    	 File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					try {
						FileHandler.copy(shots,new File("C:\\Users\\mohsi\\eclipse-workspace\\test_PIIT\\screenshotd\\Failed"+si+".png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}

	

	

}
