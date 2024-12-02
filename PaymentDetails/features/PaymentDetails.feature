Feature: Payment Details 
	This feature will test payment details for Debit Card
	
Background: User has already filled all neccessery details in Room booking form

@SmokeTest
Scenario: User will try to register payment details with invalid set of information
 Given User is on Payment Details page
 
 	When User click 'Register' link without entering 'FirstName' 
 	Then 'Please fill the First Name' message should display
 	
 	When User click 'Register' link without entering 'LastName' 
 	Then 'Please fill the Last Name' message should display
 	
 	When User click 'Register' link without entering 'DebitCardNo' 
 	Then 'Please fill the Debit card Number' message should display
 	
 	When User click 'Register' link without entering 'CVV' 
 	Then 'Please fill the CVV' message should display
 	
 	When User click 'Register' link without entering 'CardExpMonth' 
 	Then 'Please fill expiration month' message should display
 	
 	When User click 'Register' link without entering 'CardExpYear' 
 	Then 'Please fill the expiration year' message should display
 
Scenario: User will try to register payment details with valid set of information

Given User is on Payment Details page
 
 When User click 'Register' link after entering Valid set of information 
 Then 'Registarion successful!!!' message should display