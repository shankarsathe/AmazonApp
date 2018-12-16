package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Kindlesearchpage;
import Pages.Shopbycatagoryhomepage;
import Resources.baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Kindlesearchpagetest {
	
	@SuppressWarnings("rawtypes")
	//creating driver at class level for storing base class level driver value
	AndroidDriver driver;
	//creating base class object for access capabilitiese method to access launch driver
	baseclass bc=new baseclass();
	
	Kindlesearchpage kindlesearchmepage;
	//used this constructor for launching android driver.
	@BeforeClass
	public void launch()
	{
		try {
			driver=bc.desiredcapabilitie();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//clicking on kindel's first search result
	@Test(priority=4)
	public void kindlreaderclick()
	{
		try
		{
			kindlesearchmepage=new Kindlesearchpage(driver);
			Thread.sleep(10000);
			WebElement kindleclick=((Kindlesearchpage) kindlesearchmepage).kindlreader();
			kindleclick.click();
			//Thread.sleep(2000);
			System.out.println("clicked on kindle first search result");
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
			WebElement kindle1=((Kindlesearchpage) kindlesearchmepage).clickonkindle();
			kindle1.click();
			//Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=6)
	public void clickonaddtocart()
	{
		try
		{
			kindlesearchmepage=new Kindlesearchpage(driver);
			Thread.sleep(10000);
			kindlesearchmepage.TouchAction();
			WebElement clickonadd=kindlesearchmepage.clickonaddtocatdbutton();
			clickonadd.click();
			//Thread.sleep(10000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
