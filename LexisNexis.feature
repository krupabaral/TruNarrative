Feature: Preliminary Qualifying Task

@Test01
Scenario: Choose Your Industry link check after the page load
Given Initialize the browser with chrome
And Navigate to "https://risk.lexisnexis.co.uk/" home page
When User click on the Choose Your Industry Link
Then There will be links for Financial Services, Insurance, Life and Pensions, Corporations and Non-Profits


#@Test02
#Scenario Outline: Output Window check after clicking on Run button
#Given Initialize the browser with chrome
#And Navigate to "https://dotnetfiddle.net/" home page
#And First Name of <UserFirstName> starts with a Letter
#When Select NuGet Packages: nUnit 3.12.0
#Then nUnit package will be added
#When User click on the Share button
#Then The share link will start with "https://dotnetfiddle.net/"
#
#
#
#Examples:
#|UserFirstName|
#|Krupasindhu|
