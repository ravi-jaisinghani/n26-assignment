package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  LaunchPage: Contains Page objects and actions of  LaunchPage
 *
 * @author ravi.jaisinghani
 */

public class LaunchPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(id="com.monefy.app.lite:id/buttonContinue")
   private MobileElement continuebutton;


   //Constructor
   public LaunchPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnContinuebutton(){
	       
	        WebDriverWait wait = new WebDriverWait(driver,30);
           wait.until(ExpectedConditions.visibilityOf(continuebutton));
	       continuebutton.click();
	   	   LoggerClass.info("Clicked on Continue button");
	   
	      }

}
