# Rest-Assured API Automation

## A simple automation framework to test APIs.


## Tools of the Trade:: 
1. Java
2. Rest-Assured
3. Maven
4. Testng
5. Allure Reporting

## Pre-requisites - 
1. Java is installed and available in system path.
2. Maven is installed and available in system path.
3. Allure is installed.

**All other required dependencies are managed by pom.xml file*

## About ::
This API test framework has been built to test the User APIs.Validations like status code and response parameters have been taken care of as the test cases.

## Project Structure :: 
```
root
  |--src/main/java
      |--APIHelper (HTTP helper methods using Rest-Assured)
      |
      |--PetStoreAPI (Module functions to hit API call's on Pet swagger tool)
  |--src/test/java (contains test cases)
  |
  |--pom.xml (project dependencies)
  |
  |--testng.xml (test suite run declaration)
  ```

  ## How to run tests :: 
  Move to project location from terminal.
  Test to run class name is mentioned in testng.xml.
  Run all tests using maven command ::
  ```mvn test ```

  ## Reporting ::
  To view allure reports, make sure allure is configured in your system. Then run the command::
  ``` allure serve <path to \target\surefire-reports> ```    

  Resources::
  1. [Rest Assured] (https://rest-assured.io/)
  2. [Allure Reporting] (https://docs.qameta.io/allure/#:~:text=Allure%20Framework%20is%20a%20flexible,from%20everyday%20execution%20of%20tests.)
  

  ## Things that can still be improved::
  - Better handling of test data.
  - Logging for better reporting.
  - More modularization of framework.
  
