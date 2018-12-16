package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Shopbycatagoryhomepage;
import Resources.baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Shopbycatagorytest {

	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	baseclass bc=new baseclass();
	Shopbycatagoryhomepage shopbtcthomepage;
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
	//accessing shop by catagory option and click on it
	
	@SuppressWarnings("unchecked")
	@Test(priority=2)
	public void clickonshopbycatagory()
	{
		try
		{
			shopbtcthomepage=new Shopbycatagoryhomepage(driver);
			Thread.sleep(10000);
			WebElement shopoption=shopbtcthomepage.Shopbtdepartment();
			shopoption.click();
			System.out.println("shop by catagory clicked");
			//shopbtcthomepage.Shopbtdepartment();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//clicking on kindle,E-Reader and E-Book
	@Test(priority=3)
	public void clickonkindlereader()
	{
		try
		{
			shopbtcthomepage=new Shopbycatagoryhomepage(driver);
			WebElement kindleclick=shopbtcthomepage.clickonkindlemenu();
			kindleclick.click();
			Thread.sleep(2000);
			System.out.println("clicked on kindle and e-reader menu");
			//shopbtcthomepage.Shopbtdepartment();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
}
