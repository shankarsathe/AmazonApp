/*
 * Classname: Kindlesearchpage
 * On this page define  webelement use in method to access the element of the page after that created one constructor 
 * for to store the base class driver value into this driver.
 * Created 4 method for accessing the kindlereader, click on kinder reader search result, click on add to cart button
 * then last method is for to scroll down page for click on addtocart option of this page.
 */
package Pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Kindlesearchpage {

	AndroidDriver<WebElement> driver;
	WebElement KindleReaders;
	WebElement KindleSearchResult;
	WebElement AddtoCardButton;
	public Kindlesearchpage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickonKindlReader()
	{
		try
		{
			KindleReaders=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return KindleReaders;
	}
	public WebElement clickonKindleSearchResult()
	{
		try
		{
			KindleSearchResult=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return KindleSearchResult;
	}

	public WebElement clickOnAddtoCarBbutton()
	{
		try
		{		
			AddtoCardButton=driver.findElementById("add-to-cart-button");
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView('AddtoCardButton'))");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return AddtoCardButton;
	}

}

	
		

