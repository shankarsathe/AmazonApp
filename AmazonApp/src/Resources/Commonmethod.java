/* Classname: Commonmethod
 * In this class created two methods
 * 1. created for to screenshot
 * 2. created for to scroll down on page.
 */
package Resources;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Commonmethod {
	 @SuppressWarnings("rawtypes")
	public void screenShot(ITestResult result, AndroidDriver driver)
	 {
			 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
			 if(ITestResult.FAILURE==result.getStatus())
			 {
				 try
				 {
					 // To create reference of TakesScreenshot
					 TakesScreenshot screenshot=(TakesScreenshot)driver;
					 // Call method to capture screenshot
					 File src=screenshot.getScreenshotAs(OutputType.FILE);
					 // Copy files to specific location 
					 // result.getName() will return name of test case so that screenshot name will be same as test case name
					 FileUtils.copyFile(src, new File(".//screenshots"+result.getName()+".png"));
					 System.out.println("Successfully captured a screenshot");
				 }
				 catch (Exception e)
				 {
					 System.out.println("Exception while taking screenshot "+e.getMessage());
				 }
			 }
		}
	
}

