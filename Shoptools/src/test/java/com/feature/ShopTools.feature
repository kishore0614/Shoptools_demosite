Feature: ShopTools Automation

Scenario: User buy T shirt
Given User Launch the url
When User Click the product(T-shirt)
Then Next page shown


Scenario: User Adding T-shirt into cart

When User Select Colour for T-Shirt
And User Select Size for T-Shirt
And User Added T-Shirt into cart
And User Navigate to Home Page
Then Next Page Shown1


Scenario: User navigated to Home Page

When User Click the Product(maxi dress)
Then Next Page Shown2


Scenario: User Adding maxi dress into cart

When User Select Colour for maxi dress
And User Select Size for maxi dress
And User Added maxi dress into cart
When User Click Bag button
Then Next Page Shown3


Scenario: User Checkout 

When User Click Checkout Button
Then Next Page Shown4


Scenario: User Place The Order

When User Enter First name
And User Enter Last name
And User Enter Company 
And User Enter address1
And User Enter address2
And User Enter City
And User Enter Postcode
And User Enter Phone no
And User Enter Email
And User Click Checkbox
And User Click PlaceOrder
Then Next Page Shown5

