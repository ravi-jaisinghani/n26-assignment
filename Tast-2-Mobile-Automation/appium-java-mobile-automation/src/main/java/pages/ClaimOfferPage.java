package pages;

import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  ClaimOfferPage: Contains Page objects and actions of  ClaimOfferPage
 *
 * @author ravi.jaisinghani
 */

public class ClaimOfferPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(id="com.monefy.app.lite:id/buttonClose")
   private MobileElement closebutton;


   //Constructor
   public ClaimOfferPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
   }
   
   
   public void clickOnCloseClaimOfferPage(){
	   
	       closebutton.click();
	   	   LoggerClass.info("Clicked on Close claim offer page button");
	   
	      }

}
