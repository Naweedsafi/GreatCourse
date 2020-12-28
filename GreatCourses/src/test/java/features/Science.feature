Feature: Science
  
  @Smoke1
  Scenario Outline: Front-end - Select EVERYDAY ENGINEERING from Science Course
     Given User navigate to application
     And User scroll down '<pixels>'
     And user click on Science Catagory
     And User scroll down '<pixels>'
     And user click on EveryDay Engineering 
     

    Examples: 
      | pixels   |
      | "1000"     |