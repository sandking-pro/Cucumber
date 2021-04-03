Feature: Verifying AdactinHotelApp
Scenario Outline: Verifying AdactinHotelApp Login Deatails With valid Credentials

Given User is on the AdactinHotelApp login page
When User should enter "<userName>" and "<password>"
Then User should click the login button
Then User Should verify the Message
Then User Should Select "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkIn>","<checkOut>","<apr>" and "<cpr>"
Then User should click the search button
Then User should select hotel and click the continue button
Then User should enter "<firstName>","<lastName>","<address>","<crediCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>"and "<cvv>"
Then User should click the book now button

Examples:
				|userName|password|location|   hotels  |roomType|numberOfRooms| checkIn | checkOut |apr|cpr|firstName|lastName|address			 |crediCardNo				|creditCardType|expiryMonth|expiryYear|cvv|
				|prakash0| J5M3AD	|Sydney	 |Hotel Creek| Double	|			2			 |05/04/2021|06/04/2021| 2 | 2 |sand 		 |kumar		|18 kodambakkam|987654321123456789|AMEX					 |4					 |2022			|888|
				|prakash0| J5M3AD	|Sydney	 |Hotel Creek| Double	|			2			 |05/04/2021|06/04/2021| 2 | 2 |sand 		 |kumar		|18 kodambakkam|987654321123456789|AMEX					 |4					 |2022			|888|
				|prakash0| J5M3AD	|Sydney	 |Hotel Creek| Double	|			2			 |05/04/2021|06/04/2021| 2 | 2 |sand 		 |kumar		|18 kodambakkam|987654321123456789|AMEX					 |4					 |2022			|888|
				|prakash0| J5M3AD	|Sydney	 |Hotel Creek| Double	|			2			 |05/04/2021|06/04/2021| 2 | 2 |sand 		 |kumar		|18 kodambakkam|987654321123456789|AMEX					 |4					 |2022			|888|
				