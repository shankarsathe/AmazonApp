/* Class Name= Shopbycatagorytest
 * Initiated android driver then created base class object to access the driver of base class
 * Created object of shopbycatagory homepage then creatred 2 methods 
 * One is to click on shopbycatagory and another one is used for click on kinderorereader * 
 */
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
			e.printStackTrace();
		} catch (InterruptedException e) {
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
			WebElement shopoption=shopbtcthomepage.clickOnShopbydepartment();
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
	@SuppressWarnings("unchecked")
	@Test(priority=3)
	public void clickonkindlereader()
	{
		try
		{
			shopbtcthomepage=new Shopbycatagoryhomepage(driver);
			WebElement kindleclick=shopbtcthomepage.clickonKindleAndEreadermenu();
			kindleclick.click();
			Thread.sleep(7000);
			System.out.println("clicked on kindle and e-reader menu");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			}
		
}
