Feature: Search

  @Smoke
  Scenario Outline: Front-end - This scenario will navigate to webpage and select a course
    Given User navigate to application
     And User scroll down '<pixels>'
     And user click on Science Catagory
     
      Examples: 
      | pixels   |
      | "400"     |
     

      
      
      
 