/*Classname: AmazonHomepage
 * Created android driver object to store the baseclass driver value to perform the functionality
 * created amazon home page constructor to store the base class driver value into this class driver values
 * created one method to click on humberger menu successfully * 
 */
package Pages;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Amazonhomepage{
	
	AndroidDriver<WebElement> driver;
	WebElement humberger;
	public Amazonhomepage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickonHumbergerMenu()
	{
		try
		{
			humberger=driver.findElementById("action_bar_burger_icon");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return humberger;
	}
	
}