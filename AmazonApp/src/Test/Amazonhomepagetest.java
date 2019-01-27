/*
 * ClannName: Amazonhomepagetest
 * define android driver, created baseclass and amazonhomepage object,
 * created launch method to launch the driver
 * created clickonhumbergermenui method to click on humbergermenu
 */
package Test;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.Amazonhomepage;
import Resources.baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Amazonhomepagetest<AdriodDriver> {
	
	AndroidDriver<?> driver;
	baseclass bc=new baseclass();
	Amazonhomepage homepage;
	@BeforeClass
	public void launch()
	{
		try {
			driver=bc.desiredcapabilitie();
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void clickonhumbergermenui()
	{
		try
		{
			homepage=new Amazonhomepage((AndroidDriver<WebElement>) driver);
			WebElement humber=homepage.clickonHumbergerMenu();
			humber.click();
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
