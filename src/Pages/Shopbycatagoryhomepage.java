package Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Shopbycatagoryhomepage {

	AndroidDriver<WebElement> driver;
	public Shopbycatagoryhomepage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	//accessing shop by department option on humbergermenu
		public WebElement Shopbtdepartment()
		{
			WebElement shopbycatagory=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]");
			
				//	("//*[@text='Shop by Category']");
			return shopbycatagory;
		}
		//method is used to click on kindle e-reader and e-book option on shop by catagory list screen
		public WebElement clickonkindlemenu(){
			
			WebElement kindle=(WebElement) driver.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]");
			return kindle;
						
		}
		
}