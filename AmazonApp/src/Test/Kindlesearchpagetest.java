/*
 * Classname: Kindlesearchpagetest
 * creating driver at class level for storing base class level driver value
 * creating base class object for access capabilitiese method to access launch driver
 * created onject of Kindlesearchpage page to access the Kindlesearchpage for webelement and method
 * created launch method to access capabilities for launching the driver
 * created kindlreaderclick method to click on kindle.
 * created clickkindle method to click on kindle's first search
 * Created clickonaddtocart method for adding the search result kindle in add to cad for purchase.
 */
package Test;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.Kindlesearchpage;
import Resources.baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Kindlesearchpagetest {
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	baseclass bc=new baseclass();
	Kindlesearchpage kindlesearchmepage;
	@BeforeClass
	public void launch()
	{
		try {
			driver=bc.desiredcapabilitie();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	@Test(priority=4)
	public void kindlreaderclick()
	{
		try
		{
			kindlesearchmepage=new Kindlesearchpage(driver);
			Thread.sleep(10000);
			WebElement kindleclick=((Kindlesearchpage) kindlesearchmepage).clickonKindlReader();
			kindleclick.click();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("unchecked")
	@Test(priority=5)
	public void clickkindle()
	{
		try
		{
			kindlesearchmepage=new Kindlesearchpage(driver);
			Thread.sleep(10000);
			WebElement kindle1=((Kindlesearchpage) kindlesearchmepage).clickonKindleSearchResult();
			kindle1.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
	@SuppressWarnings("unchecked")
	@Test(priority=6)
	public void clickonaddtocart()
	{
		try
		{
			kindlesearchmepage=new Kindlesearchpage(driver);
			Thread.sleep(10000);
			WebElement clickonadd=kindlesearchmepage.clickOnAddtoCarBbutton();
			clickonadd.click();
			String actualmsg=driver.findElementById("Added to card").getText();
			String msg="added to cart";
			Assert.assertEquals(actualmsg,msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
