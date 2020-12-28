Feature: Login	

 @Login
  Scenario Outline: Front-end - Creating Account and Sign in
  	 Given User navigate to application
  	 And User click on Sign in Element
  	 Then User click on Create an Account
  	 And User send keys FirstName
  	 And User send keys LastName
  	 And User send keys email
  	 And User send keys Password
  	 And User send keys Confirm Password
  	 And User click on Term and Services
  	 And User Check the box of Term and Services
  	 And User click on Create Account Button
  	 And User scroll down '<pixels>'
  	 
  	 
  	 Examples:
  	 | pixels |
  	  |"500"|
     
