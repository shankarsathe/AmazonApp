package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Amazonhomepage;
import Resources.baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Amazonhomepagetest<AdriodDriver> {
	
	AndroidDriver driver;
	baseclass bc=new baseclass();
	Amazonhomepage homepage;
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
	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void clickonhumbergermenui()
	{
		try
		{
			homepage=new Amazonhomepage(driver);
			WebElement humber=homepage.clickonhumbergermenu();
			humber.click();
			driver.close();		
			//homepage.clickonhumbergermenu();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
