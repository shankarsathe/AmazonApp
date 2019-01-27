package Resources;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import io.appium.java_client.android.AndroidDriver;

public class baseclass{
	@SuppressWarnings("rawtypes")
	static AndroidDriver driver;
		@SuppressWarnings("rawtypes")
		
		//Used to access the application in mobile and accessit.
		 public AndroidDriver desiredcapabilitie() throws MalformedURLException, InterruptedException
		 {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			 capabilities.setCapability("deviceName", "Moto G");
			 capabilities.setCapability("platformVersion", "6.0");
			 capabilities.setCapability("platformName", "Android");
			 capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			 capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			 try
			 {
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 System.out.println("app launched");
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			
			 return driver;
			 }
	//Closing the driver instance	
	@AfterSuite
		public void teardown() {
			// TODO Auto-generated method stub
			driver.quit();
		}
	}
