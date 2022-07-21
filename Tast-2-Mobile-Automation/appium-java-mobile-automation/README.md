# Appium-Java Mobile Automation

## A Generalised App automation framework using Appium, Java and POM


## Tools Used:: 
1. Java
2. Appium
3. Adnroid Sdk
4. Node
5. Appium-doctor
6. Maven
7. Testng
8. ReportNG

## Pre-requisites - 
1. Install Java and set variable in  system path(JAVA_HOME).
2. Install Maven and set variable in  system path(MAVEN_HOME).
3. Install Android SDk and set variable in system path(ANDROID_HOME)
4. Exctract platform-tools for particular version(e.g.28) and set variable in sytem path (ANDROID_HOME/platform-tools)
5. Exctract build-tools for particular version(e.g.28) and set variable in sytem path (ANDROID_HOME/build-tools)
6. Install Node and Appium
7. install appium-doctor to check validity of Appium setup


**All other required dependencies are managed by pom.xml file*
## About :: 
This Mobile app Automation test framework has been built to test E-2-E flow of apps application on different Os depending on the input configurations.

## Framework Architecture Diagram ::

<img width="790" alt="acrchitecture_diagram_final" src="https://user-images.githubusercontent.com/104636105/180179247-97bde87b-8b9f-4417-8501-4b4fd9c1250d.png">


## Project Structure :: 
```
root
  |--src/main/java
      |--helpers
          |--BaseAppiumClass(Used for Selenium Webdriver Initialization)
          |--BaseUtils( Base util function)
          |--MonefyAUT( Application under test configurations i.e device name,os type)
          |--LoggerClass(Implements logs)
      |--Pages 
          |--ClaimOfferPage()
          |--ExpenseCategoryPage()
          |--IncomeCategoryPage()
          |--IncomePage()
          |--LaunchControlPage()
          |--LaunchPage()
          |--LaunchReadyPage()
          |--MainPage()
           
  |
  |--src/test/java
      |--demotests
          |--MonefyTest(Contains E-2-E tests)
      |--testdata
          |--MonefyTest.properties(test data used by MonefyTest )
  | 
  |--src/main/resources
      |--log4j2.xml (log4j configurations)
  |
  |--pom.xml (project dependencies)
  |
  |--testng.xml (test suite run declaration)
  
```

  ## Feature's of automation framework ::
  - Generalised framework can automate any application with minimal changes
  - Support different Os(Andoroid or IOS) with minimal changes
  - Modularised structure, reusable functions  
  - POM implementation
  - Generalised Xpaths: 

  ## How to run tests ::
  Move to project location from terminal.
  
  run appium server
  
  attach android device using cable  and run command adb devices
  
  check device connected and change configurations in MonefyAUT.java accordingly
  
  Run all tests using maven command ::```mvn test  ```

  ## Reporting :: 
  ReportNG reports will be saved on path::
  ``` /target/surefire-reports/html/index.html> ```    
  
  ## Logs:
  Logs can be found on path::
  ``` /output/logfile.log> ```

  ## Things that can still be improved::
  - More Modularization of framework.
  - Adding exception handeling
