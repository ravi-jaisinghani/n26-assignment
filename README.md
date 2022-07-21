# N26 - Assignment: Repolinks and Deliverables of all three Tasks
----------------------------------------------
## Task 1 exploratory charters for Monefy App

**Markdown file with exploratory charters**:

[Task-1-assignment.md](https://github.com/ravi-jaisinghani/n26-assignment/blob/main/Task-1-assignment.md) 

**Deliverables Points**:

1.Exploratory testing charters to document your testing.

-> Mentioned in Task-1-assignment.md file

2.Findings from your charters. Did everything work as expected? What bugs were discovered?

->Yes while performing testing sessions found two defects

#BUG 0001 Account transfer functionality is transferring money from one payment method to other even if balance is not available Popup should display throwing insufficient money

#BUG 0002 Moenfy app is allowing expense even if budget limit is crossed

3.Prioritisation of those charters - which area of the app or testing would you explore first and why?

-> Prioritised Tests in below order to find out earlier defects and considering importance of platforma and functionality for end user
    
a.Installation and compatiblity testing 

b.function testing
- balance ,expense and income functionality
- expense distribution functionality
- Money transfer functionality 
- Budget functionality
- export data functionality

c.Usablity testing

4.How much time you have planned for each charter?

->Two Small(60 min) sessions and one medium(90min) session. Details are here: Task-1-assignment.md

5.What kind of risks you need to mitigate for this type of application?

-> -Insecure Data Storage :expense and income data can be vulnerabe to other attacks
 
 -lack of input amout size validation(> 10^9 for income amount) 
    
----------------------------------------------

## Task 2 Appium Automaion framework for Monefy App Testing

**Framework Location**: 
[appium-java-mobile-automation](https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Tast-2-Mobile-Automation/appium-java-mobile-automation)

**Framework Setup and Execution Steps**:https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Tast-2-Mobile-Automation/appium-java-mobile-automation#readme

**Deliverables Points**:

1.A list of ideas/bullet points you would test for. Focus on good coverage, rather than complete test
cases.

-> Good coverage can be done by identifying critical sections and importance functionality of app e.g.
 - Expense/income/balance functionality and calcualation verification(Automated)
 - Expense Main page percentage distribution(Automated)
 - Main page actions and locators(Automated)
 - Money transfer functionality
 - category addition and data export

2.Outline the possibilities of automating proposed scenarios on different levels, together with a short summary of pros and cons of each of them.
- UI Level: Can cover E-2-E flows and simulates real time user interaction but initial capex and execution time is high
- Functional Level(Non-UI):Give confidence about backend functionality but cannot give validation on end user experience and UI behaviour


3.A test automation framework that perform the automated tests

-> [appium-java-mobile-automation](https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Tast-2-Mobile-Automation/appium-java-mobile-automation)

4.A short explanation of the provided solution inside the README file.

-> Readme file:https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Tast-2-Mobile-Automation/appium-java-mobile-automation#readme

----------------------------------------------

## Task 3 Rest-assured Api Automaion framework for petstore Application

**Framework Location**: 
[restassured-api-automation](https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Task-3-APi-Automation/restassured-api-automation)

**Framework Setup and Execution Steps**: 
https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Task-3-APi-Automation/restassured-api-automation#readme

****Deliverables Points**:**:

1.A list of test cases proposed for automation.
 
 - E-2-E Flow of Creation, reading updating , verifying and deleting the Pet(/pet) from Petstore
 - E-2-E Flow of Creation, reading , verifying and deleting the Order(/order) from Petstore
 - E-2-E Flow of Creation, reading updating , verifying and deleting the User(/user) from Petstore


2.Outline the possibilities of automating proposed scenarios on different levels, together with a short
summary of pros and cons of each of them.
- Unit Test level: Can find early bug in SDLC but require high time for maintainance due large number of tests
- Functional Level(Non-UI):Give confidence about backend functionality but cannot give validation on end user experience and UI behaviour


3.A test automation framework that exercises those scenarios

-> [restassured-api-automation] (https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Task-3-APi-Automation/restassured-api-automation)

4.A short explanation of the provided solution inside the README file.

-> Readme file: https://github.com/ravi-jaisinghani/n26-assignment/tree/main/Task-3-APi-Automation/restassured-api-automation#readme


----------------------------------------------
----------------------------------------------
