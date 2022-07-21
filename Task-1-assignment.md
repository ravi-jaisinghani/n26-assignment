# Exploratory Testing Sessions of Monefy Application:
----------------------------------------------
## Test charter 1
**Charter**: Analyze installation and Compatiblity test of Monefy application on diffrent OS
**Areas**:
 - Installing Monefy application on Android device
 - Installing Monefy application on IOS Device
 - Open application and check home screen on different Os
 - Uninstalling Monefy applucation on IOS/Android
 - Version of applications installed on IOS/Android

**Test Environments & URL**: Android OS and IOS

**Start**: 15/7/22  10.00 AM(IST)

**Tester**: Ravi Jaisinghani

**Task Breakdown**:

**Duration**: Short(60 Min)

**Session Setup time**:20 Min

**Test Design and Execution**:30 Min

**Data Files**: N/A

**Testing Notes**:

**View**:
 - Successful installation on android
 - Successful installation on IOS
 - Home screen is visible properly
 - application reopening properly on IOS/Android
 - application uninstalled Successfuly on IOS/Android
 - application version verified

**Risks**:
 - Installation needs to be checked on IOS version > 15
 - Installation can fail on older android version

**Bugs**: N/A
**Issues**: N/A
----------------------------------------------

## Test charter 2
**Charter**: Analyze and verify functionality of different pages of Monefy application
**Areas**:
 - Verify Monefy balance and categories percentage distribution 
 - Verify expense and income functionality
 - Verify Categories page functionality
 - Verify functionality of settings page
 - verify settings tab functionality
 - Verify Currencies tab functionality

**Test Environments & URL**: IOS

**Start**: 15/7/22  12.00 PM(IST)

**Tester**: Ravi Jaisinghani

**Task Breakdown**:

**Duration**: Medium(90 Min)

**Session Setup time**:10 Min

**Test Design and Execution**:80 Min

**Data Files**: N/A

**Testing Notes**:

**View**:
 - Balance and Category percentages is correct **(Automation candidate)**
 - expense addition and deletion is working fine **(Automation candidate)**
 - Category editing is working fine
 - Account > New transfer is giving wrong output (Bug)
 - Setting > Budget is giving wrong output(Bug)
 - Setting > export functionality is working fine
 - home> filter is working fine

**Risks**:
 - currency page is not tested as it requires subscription
 - Categories> expense/income add feature is not tested as it requires suscription
 - New income may not work if income is more than 10^9

**Bugs**: 
 - #BUG 0001
  Account transfer functionality is transferring money from one payment method to other even if balance is not available Popup should display throwing insufficient money
 - #BUG 0002
  Moenfy app is allowing expense even if budget limit is crossed

**Issues**: 
- It is very difficult to understand the Account page > new transfer flow
- It is very difficult to understand the Settings > carry over and Feture recurring records functionalities

----------------------------------------------

## Test charter 3
**Charter**: Analyze and verify installation Usability of Monefy application on diffrent OS
**Areas**:
 - Verify usablity of home screen
 - Verify usablity of accounts,settings,currency and Categories page

**Test Environments & URL**: Android OS and IOS

**Start**: 15/7/22  8.00 PM(IST)

**Tester**: Ravi Jaisinghani

**Task Breakdown**:

**Duration**: Short(60 Min)

**Session Setup time**:10 Min

**Test Design and Execution**:45 Min

**Data Files**: N/A

**Testing Notes**:

**View**:
- proper size of buttons on Home,account,settings and other screens
- easy to navigate to other screen from home page
- symbols showing categories are fairly clear
- text size is simple and clear for user to understand
- Account transfer page is functionality is difficult to understand
- Negative balance should have - sign with red color  
  
**Risks**:
- currency page is not tested as it requires subscription

**Bugs**: N/A
**Issues**:  
- It is very difficult to understand the Account page > new transfer flow

----------------------------------------------
