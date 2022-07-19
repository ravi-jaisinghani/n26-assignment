package demotest;


import pages.*;
import helpers.BaseAppiumClass;
import helpers.BaseUtils;
import helpers.LoggerClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import helpers.MonefyAUT;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.util.*;




/**
 *  MonefyTest: Contains Sample MonefyTest application Tests for given scenario's
 *
 * @author ravi.jaisinghani
 */


public class MonefyTest {
	 AppiumDriver<MobileElement> driver;
	 static String testDatafileName;
	 Properties testData;
	 static String currency="£";
	 
   @BeforeTest
   public void setup(){
	   LoggerClass.info("************************ Setup  Started ************************"); 
	   
	   testDatafileName=this.getClass().getSimpleName()+".properties";
	   testData=new Properties();
	   testData= BaseUtils.getTestDataFile(testDatafileName);
	   BaseAppiumClass baseseleniumWd = BaseAppiumClass.getInstanceofSeleniumWebdriver();
	   driver=baseseleniumWd.getDriver();
	   LoggerClass.info("************************ Setup  Completed ************************"); 
	   
	   
   }

   @Test
   public void monefyIncomeExpenseTest() {
       
	   
	   LoggerClass.startTestCase("monefyIncomeExpenseTest");
	  
	    
	  
	   LoggerClass.info("Clicking on launch page Continue button"); 
       LaunchPage launchPage = new LaunchPage(driver);
       launchPage.clickOnContinuebutton();
  
       
       LoggerClass.info("Clicking on launch Control Page Continue button"); 
       LaunchControlPage launchControlPage = new LaunchControlPage(driver);
       launchControlPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on launch Ready Page Continue button"); 
       LaunchReadyPage launchReadyPage = new LaunchReadyPage(driver);
       launchReadyPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on Cancel button on Claim offer page"); 
       ClaimOfferPage claimOfferPage = new ClaimOfferPage(driver);
       claimOfferPage.clickOnCloseClaimOfferPage();
       
       
      
       MainPage mainPage = new MainPage(driver);
       mainPage.clickOnIncomeButton();
       
       IncomePage incomePage = new IncomePage(driver);
       incomePage.setIncomeAmount(testData.getProperty("amount"));
       incomePage.clickOnCategoryButtonButton();
       
       
       IncomeCategoryPage incomeCategoryPage = new IncomeCategoryPage(driver);
       incomeCategoryPage.clickOnDepositsButton();
       
       mainPage = new MainPage(driver);
       mainPage.waitForCancelLayoutToDisapear();
       mainPage.clickOnExpenseButton();
       
       IncomePage expensePage = new IncomePage(driver);
       expensePage.setIncomeAmount(testData.getProperty("amount"));
       expensePage.clickOnCategoryButtonButton();
       
       ExpenseCategoryPage expenseCategoryPage = new ExpenseCategoryPage(driver);
       expenseCategoryPage.clickOnBillsButton();
       
       
       mainPage = new MainPage(driver);
       LoggerClass.info("Data is"+mainPage.getIncomeView());
       LoggerClass.info("Data is"+mainPage.getExpenseView());
       LoggerClass.info("Data is"+mainPage.getBalance());

    
       
       LoggerClass.info("Verifying Income Amount on Main page");
       Assert.assertEquals(mainPage.getIncomeView(),currency+testData.getProperty("incomeViewAmout"));
       
       LoggerClass.info("Verifying Expense Amount on Main page");
       Assert.assertEquals(mainPage.getExpenseView(),currency+testData.getProperty("expenseViewAmount"));
       
       LoggerClass.info("Verifying Balance Amount on Main page");
       Assert.assertEquals(mainPage.getBalance(),"Balance "+currency+testData.getProperty("balanceAmount"));
       
             
       LoggerClass.endTestCase("monefyIncomeExpenseTest");
	   
   }
   
   @Test
   public void monefyExpensePercentageTest() {
       
	   
	   LoggerClass.startTestCase("monefyExpensePercentageTest");
	   
	  
	   LoggerClass.info("Clicking on launch page Continue button"); 
       LaunchPage launchPage = new LaunchPage(driver);
       launchPage.clickOnContinuebutton();
  
       
       LoggerClass.info("Clicking on launch Control Page Continue button"); 
       LaunchControlPage launchControlPage = new LaunchControlPage(driver);
       launchControlPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on launch Ready Page Continue button"); 
       LaunchReadyPage launchReadyPage = new LaunchReadyPage(driver);
       launchReadyPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on Cancel button on Claim offer page"); 
       ClaimOfferPage claimOfferPage = new ClaimOfferPage(driver);
       claimOfferPage.clickOnCloseClaimOfferPage();
       
        
       MainPage mainPage = new MainPage(driver);
       mainPage.clickOnIncomeButton();
       
       IncomePage incomePage = new IncomePage(driver);
       incomePage.setIncomeAmount(testData.getProperty("amount"));
       incomePage.clickOnCategoryButtonButton();
       
       
       IncomeCategoryPage incomeCategoryPage = new IncomeCategoryPage(driver);
       incomeCategoryPage.clickOnDepositsButton();
       
       mainPage = new MainPage(driver);
       mainPage.waitForCancelLayoutToDisapear();
       mainPage.clickOnExpenseButton();
       
       IncomePage expensePage = new IncomePage(driver);
       expensePage.setIncomeAmount(testData.getProperty("amount"));
       expensePage.clickOnCategoryButtonButton();
       
       ExpenseCategoryPage expenseCategoryPage = new ExpenseCategoryPage(driver);
       expenseCategoryPage.clickOnBillsButton();
       
       
       
       mainPage = new MainPage(driver);
         
      LoggerClass.info("Verifying Bill Percentage on main page");
       Assert.assertEquals(mainPage.getBillSpentPercentage(),testData.getProperty("billPercentage"));
       
       
       LoggerClass.endTestCase("monefyExpensePercentageTest");
	   
   }

   @Test
   public void monefyVerifyMainPageTest() {
       
	   
	   LoggerClass.startTestCase("monefyVerifyMainPageTest");
	   
	  
	   LoggerClass.info("Clicking on launch page Continue button"); 
       LaunchPage launchPage = new LaunchPage(driver);
       launchPage.clickOnContinuebutton();
  
       
       LoggerClass.info("Clicking on launch Control Page Continue button"); 
       LaunchControlPage launchControlPage = new LaunchControlPage(driver);
       launchControlPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on launch Ready Page Continue button"); 
       LaunchReadyPage launchReadyPage = new LaunchReadyPage(driver);
       launchReadyPage.clickOnContinuebutton();
       
       LoggerClass.info("Clicking on Cancel button on Claim offer page"); 
       ClaimOfferPage claimOfferPage = new ClaimOfferPage(driver);
       claimOfferPage.clickOnCloseClaimOfferPage();
       
        
       MainPage mainPage = new MainPage(driver);
       
       LoggerClass.info("Verifying income view field on main page");
       mainPage.getIncomeView();
       
       LoggerClass.info("Verifying expense view field on main page");
       mainPage.getExpenseView();
       
       LoggerClass.info("Verifying Balance view field on main page");
       mainPage.getBalance();
       
       LoggerClass.info("Verifying expense bill category field on main page");
       mainPage.getBillSpentPercentage();
       
       LoggerClass.info("Verifying Menu button on main page");
       mainPage.clickOnMainMenuTab();
           
       LoggerClass.endTestCase("monefyVerifyMainPageTest");
	   
   }
   
    @AfterMethod
    public void afterEachTest(){
   	 	LoggerClass.info("************************ After Test  Started ************************"); 
   	 	driver.resetApp();
        LoggerClass.info("************************ After Test  Completed ************************"); 
      }
    @AfterTest
    public void close(){
    	 LoggerClass.info("************************ Teardown  Started ************************");
         BaseAppiumClass.close();
         LoggerClass.info("************************ Teardown  Completed ************************"); 
       }
   }