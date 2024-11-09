# Cyrus Lacson - Examination Submission for Datacom Application Purposes Only

The ‘Our Locations’ page found in https://datacom.com/nz/en/contact-us .

Write test cases and automate the test cases where the following criteria is met:
- the test case will give value if automated
- the test can be developed in the allocated time.
---------------------------------------------
Created Test Cases:
- Successfully Navigate Website of Datacom
- Successfully Navigate to Our Locations Page
- Validate if Region is present on the locations page
- Validate if State is present on the locations page
- Validate state name per each state
- Validate address per each state
- Validate contactNumber per each state
- Validate email per each state

---------------------------------------------
### **Feature File:** 

- **src/test/resources/features/DatacomLocations.feature** - main feature file for the Our Locations page of Datacom - Test tag is @testValidateLocationsPage

### **StepDefinition**: 
- **src/test/java/stepDefinitions/Datacom/NavigationSteps.java** - step definition for the navigation from main browser page up until our locations page
- **src/test/java/stepDefinitions/Datacom/OurLocationsSteps.java** - step definition for the validation of the our locations page

### **PageObjects:**
- **src/test/java/pages/Datacom/Navigation.java** - main page object for the actions of the navigation from main browser page up until our locations page
- **src/test/java/pages/Datacom/OurLocations.java** - main page object for the validation of the our locations page

### **Other Files**
- **src/test/java/utils/DriverFactory.java** - java file for setting up of the webdriver
- **src/test/java/utils/GenerateTestData.java** - java file for which is mainly used for the conversion of list of maps to inputstream (mainly for mock data)
- **src/test/java/utils/PageBase.java** - java file mainly used for page object actions and validations
- **src/test/java/Cucumber/runners/PortfolioTestRunner.java** - test runner for the created automation suite
- **src/test/java/pageObject/Datacom/OurLocations/State.java** - POJO created for the State for Mock Data preparation
