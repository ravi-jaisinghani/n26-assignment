package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  IncomePage: Contains Page objects and actions of  IncomePage
 *
 * @author ravi.jaisinghani
 */

public class IncomePage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(id="com.monefy.app.lite:id/amount_text")
   private MobileElement incomeAmount;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/keyboard_action_button")
   private MobileElement chooseCategoryButton;
   


   //Constructor
   public IncomePage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnCategoryButtonButton(){
	   
	   	   chooseCategoryButton.click();
	   	   LoggerClass.info("Clicked on Choose Category button");
	   
	      }

   
   public void setIncomeAmount(String income){
	   
   	   LoggerClass.info("Setting text of Income amount");
   	   incomeAmount.click();
   	   //clicking on each number present in income String
   	   for(char ch : income.toCharArray())
   	   {
   		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard"+Character.toString(ch)).click();   
   	   }
   	   
   
      }


}
