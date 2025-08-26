
> + Line 14 - changed title
> + Line 19 - changed h1
> + Line 21/53 - changed h2
> + Line 30/31 - changed link text


> + Line 5 - changed title
> + Line 8 - added div with class of "container"
> + Line 9-11 - added h1, hr, h2
> + Line 12 - added paragraph with "about us" message
> + Line 17 - added link to main screen

> mainscreen.html
> + Line 21 - added link to "about us" page

> AboutUsController.java
> + Line 8 - added GetMapping annotation for "/aboutus"
> + Line 9 - added the mapping function to return "/aboutus"


> BootStrapData.java
> + Line 42 - added conditional statement to prevent duplicate data
> + Line 43-89 - added five InhousePart objects to sample data using Part setters
> + Line 94 - added conditional statement to prevent duplicate data
> + Line 96-105 - added five Product objects using setters


>AddProductController.java
> + Line 177 - added a buyProduct function with mapping
> + Line 184 - created if/else statement to check for inventory and return "failure" if inv == 0 or "success" if inv > 0
> + Line 188-189 - product inventory decremented by 1 and then value saved to reflect accurate inventory level.

>mainscreen.html
> + Line 87 - added "buy now" button with correct mapping

>Part.java
> + Line 31/33 - added new variables for min and max inventory
> + Line 59-65 - added new constructor for Part object
> + Line 93-111 - added setters and getters for min and max variables

>mainscreen.html
> + Line 76/77 - added table headers for min/max inventory
> + Line 48/49 - added min/max inventory columns

>BootStrapDate.java
> + Line 48/49 - set min/max inventory levels
> + Line 61/62 - set min/max inventory levels
> + Line 72/73 - set min/max inventory levels
> + Line 83/84 - set min/max inventory levels
> + Line 94/95 - set min/max inventory levels

> InhousePartForm.html
> + Line 26-30 - added text input fields for min/max inventory values in form

> InhousePartForm.html
> + Line 30-36 - added text input fields for min/max inventory values in form

> OutsourcedPartForm.html
> + Line 31-37 - added text input fields for min/max inventory values in form

>application.properties
> + Line 6 - renamed the file the persistent storage is saved to.

>InventoryValidator.java
> + created inventory validator
> + Line 32-39 - created logic for min/max value constraints

>ValidInventory.java
> + created validator interface for inventory
> + Line 20 - updated error message

>InventoryValidator.java
> + Line 33/36 - added custom error messages for min/max violations

>EnufPartsValidator.java
> + Line 37 - added validation to check if adding product would make part inventory go below minimum.
> + Error message displays properly


>PartTest.java
> + Line 161 - added new unit test for setting inventory below minimum
> + Line 178 - added new unit test for setting inventory above maximum

>DeletePartValidator.java
> + Deleted file for 0 usages.
