Feature: TO check Login Functionalitty of Practice pad Application.

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<UserName>"and"<PassWord>"
	
	Examples:
	|UserName|PassWord|
	|vma|password|
	|bhavesh|password|
	
	Scenario Outline: Create Student 
	Given i enter"<Name>"
	Then i enterr"<LastName>"
	Examples:
	|Name|LastName|
	|ahardik|anarola|
	|sssssss|ddddjhvds|
	|sadc|anarvvvvvola|
	
	
	
	