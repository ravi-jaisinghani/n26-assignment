package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  LaunchReadyPage: Contains Page objects and actions of  LaunchReadyPage
 *
 * @author ravi.jaisinghani
 */

public class LaunchReadyPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(id="com.monefy.app.lite:id/buttonContinue")
   private MobileElement lrpbutton;


   //Constructor
   public LaunchReadyPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnContinuebutton(){
	       
	      	WebDriverWait wait = new WebDriverWait(driver,30);
	      	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/buttonContinue")));
	      	driver.findElement(By.id("com.monefy.app.lite:id/buttonContinue")).click();
	   		LoggerClass.info("Clicked on Continue button");
	   
	      }

}
