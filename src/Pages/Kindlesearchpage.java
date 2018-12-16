package Pages;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Kindlesearchpage {

		AndroidDriver<WebElement> driver;
	public Kindlesearchpage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	public WebElement kindlreader()
	{
		WebElement kindleereaders=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]");
		return kindleereaders;
		////*[@id="sbdCategory3"]/div[2]/div[1]/div[1]/a/div/div
		}
	public WebElement clickonkindle() {
		WebElement reader=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View");
		return reader;
		////*[@id="resultItems"]/li[1]/a/div/div[2]/h5
	}

	public WebElement clickonaddtocatdbutton()
	{
		
		WebElement addbutton=driver.findElementById("add-to-cart-button");
		return addbutton;
		////*[@id="add-to-cart-button"]
	}

	public void TouchAction() {
		// TODO Auto-generated method stub
		//TouchAction().press(el0).moveTo(el1).release();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		
	}


	
	
}
