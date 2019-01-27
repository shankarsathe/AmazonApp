/* ClassName: Shopbycatagoryhomepage
 * In this class initiate android driver object the created two webelement
 * created Shopbycatagoryhomepage constructor to take base class driver's all properties.
 * created two methods in this class 1. clickOnShopbydepartment is for to access the shopbycatagory element and click on it.
 * 
 */
package Pages;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Shopbycatagoryhomepage {

	AndroidDriver<WebElement> driver;
	WebElement shopbycatagory;
	WebElement kindle;
	public Shopbycatagoryhomepage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickOnShopbydepartment()
	{
		try
		{
			shopbycatagory=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			return shopbycatagory;
	}
	public WebElement clickonKindleAndEreadermenu()
	{
		try
		{
			kindle=driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			return kindle;
						
	}
		
}