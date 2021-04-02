Feature: Verifying AdactinHotelApp
Scenario: Verifying AdactinHotelApp Login Deatails With valid Credentials

Given User is on the AdactinHotelApp login page
When User should enter username and password
And User should click the login button
Then User Should verify the Message