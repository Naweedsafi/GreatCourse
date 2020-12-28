Feature: Checkout	

 @CheckOut
  Scenario Outline: Front-end - Choosing format and click submit
  
  	 Given User navigate to application
     And User scroll down '<pixels>'
     And user click on Science Catagory
     And User scroll down '<pixels>'
     And user click on EveryDay Engineering 
     And user click on radio Button
     And user click on submit button
          
     Examples: 
      | pixels   |
      | "1000"     |