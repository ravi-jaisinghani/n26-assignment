package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  IncomeCategoryPage: Contains Page objects and actions of  IncomeCategoryPage
 *
 * @author ravi.jaisinghani
 */

public class IncomeCategoryPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(xpath="//android.widget.TextView[@text='Deposits']")
   private MobileElement depositsCategory;
   

   //Constructor
   public IncomeCategoryPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnDepositsButton(){
	   
	       depositsCategory.click();
	   	   LoggerClass.info("Clicked on Deposits Category button");
	   
	      }

  


}
