package helpers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


/**
 * BaseAppiumClass contains AppiumDriver initialization and driver basic operations 
 *
 * @author ravi.jaisinghani
 */


public class BaseAppiumClass 
{
	
   public static AppiumDriver<MobileElement> driver=null;
   
   private static BaseAppiumClass baseSeleniumClass=null;
   
   private BaseAppiumClass()
   {
	 
    	    URL url;
			try {
					url = new URL(MonefyAUT.appiumServerURl);
					DesiredCapabilities capabilities = new DesiredCapabilities();
		    	    capabilities.setCapability("deviceName",MonefyAUT.deviceName);
		    	    capabilities.setCapability("udid", MonefyAUT.udid);
		    	    
		    	    capabilities.setCapability("platformName", MonefyAUT.platformName);
		    	    capabilities.setCapability("platformVersion",MonefyAUT.platformVersion);
		    	    capabilities.setCapability("appPackage", MonefyAUT.appPackage);
		    	    capabilities.setCapability("appActivity", MonefyAUT.appActivity);
		    	    
		    	    
		    	     driver= new AppiumDriver<MobileElement>(url, capabilities);
		    	     driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   
       
	      LoggerClass.info("Performing AppiumDriver Setup operation");

   }
   
  public static BaseAppiumClass getInstanceofSeleniumWebdriver()
  {
       if(baseSeleniumClass==null){
    	   baseSeleniumClass = new BaseAppiumClass();
       }
       return baseSeleniumClass;
   }
   
   public AppiumDriver<MobileElement> getDriver()
   {
	  LoggerClass.info("Returning the AppiumDriver Instance");  
   	  return driver;
   }
   
   public static void quit()
   {
      driver.quit();
      LoggerClass.info("Quiting the AppiumDriver");
      driver=null; 
   }
   public static void close()
   {
      driver.closeApp();
      LoggerClass.info("Closing the AppiumDriver");
      driver=null;  
   }   

}