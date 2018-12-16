package Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Amazonhomepage{
	
	
	//baseclass base=new baseclass();
	AndroidDriver<WebElement> driver;
	public Amazonhomepage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
	}
	
	//Accessing humberger menu
	
	public WebElement clickonhumbergermenu()
	{
		WebElement humberger=driver.findElementById("action_bar_burger_icon");
		return humberger;
		
	}
	
}