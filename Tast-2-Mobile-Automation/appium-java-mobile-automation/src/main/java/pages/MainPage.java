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
 *  MainPage: Contains Page objects and actions of  MainPage
 *
 * @author ravi.jaisinghani
 */

public class MainPage {
   private AppiumDriver<MobileElement> driver;

   //Locators
   
   @AndroidFindBy(id="com.monefy.app.lite:id/income_button_title")
   private MobileElement incomeButton;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/expense_button_title")
   private MobileElement expenseButton;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/income_amount_text")
   private MobileElement incomeView;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/expense_amount_text")
   private MobileElement expenseView;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/balance_amount")
   private MobileElement balanceView;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/overflow")
   private MobileElement mainMenuTab;
   
   @AndroidFindBy(id="com.monefy.app.lite:id/snackbar_action")
   private MobileElement cancelLayout;
  
   @AndroidFindBy(xpath="//android.widget.TextView[@index='22']")
   private MobileElement billSpentPercentage;
    //

   //Constructor
   public MainPage(AppiumDriver<MobileElement> driver) {
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
   }
   
   
   public void clickOnIncomeButton(){
	   
	       incomeButton.click();
	   	   LoggerClass.info("Clicked on income button");
	   
	      }
   public void clickOnExpenseButton(){
	   
	   expenseButton.click();
   	   LoggerClass.info("Clicked on expense button");
   
      }
   
   public String getIncomeView(){
	   
   	   LoggerClass.info("Getting text of Income view");
   	   return incomeView.getText();
   
      }
   
    public String getExpenseView(){
	   
   	   LoggerClass.info("Getting text of Expense view");
   	   return expenseView.getText();
   
      }
   
    public String getBalance(){
	   
   	   LoggerClass.info("Getting text of Balance view");
   	   return balanceView.getText();
   
      }
   
    public void clickOnMainMenuTab(){
	   
	   mainMenuTab.click();
   	   LoggerClass.info("Clicked on Main Menu Tab button");
   
      }
    public void waitForCancelLayoutToDisapear(){
 	   
 	       //Waiting for Cancel pop-up to disappear
    	   WebDriverWait wait = new WebDriverWait(driver,60);
	       wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("com.monefy.app.lite:id/snackbar_action"))));
    
       }
    public String getBillSpentPercentage(){
 	   
    	   LoggerClass.info("Getting text of Bill Percentage on main view");
    	   return billSpentPercentage.getText();
    
       }

}
