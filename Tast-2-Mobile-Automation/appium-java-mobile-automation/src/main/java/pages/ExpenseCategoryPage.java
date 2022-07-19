package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 *  ExpenseCategoryPage: Contains Page objects and actions of  ExpenseCategoryPage
 *
 * @author ravi.jaisinghani
 */

public class ExpenseCategoryPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(xpath="//android.widget.TextView[@text='Bills']")
   private MobileElement billsCategory;
   

   //Constructor
   public ExpenseCategoryPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnBillsButton(){
	   
	       billsCategory.click();
	   	   LoggerClass.info("Clicked on Bills Category button");
	   
	      }

  


}
