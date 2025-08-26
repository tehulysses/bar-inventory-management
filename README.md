# WESTERN GOVERNORS UNIVERSITY
## D287 – JAVA FRAMEWORKS
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
mainscreen.html
> + Line 14 - changed title
> + Line 19 - changed h1
> + Line 21/53 - changed h2
> + Line 30/31 - changed link text

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
> about.html
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

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
> BootStrapData.java
> + Line 42 - added conditional statement to prevent duplicate data
> + Line 43-89 - added five InhousePart objects to sample data using Part setters
> + Line 94 - added conditional statement to prevent duplicate data
> + Line 96-105 - added five Product objects using setters

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
>AddProductController.java
> + Line 177 - added a buyProduct function with mapping
> + Line 184 - created if/else statement to check for inventory and return "failure" if inv == 0 or "success" if inv > 0
> + Line 188-189 - product inventory decremented by 1 and then value saved to reflect accurate inventory level.

>mainscreen.html
> + Line 87 - added "buy now" button with correct mapping

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
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

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
>InventoryValidator.java
> + Line 33/36 - added custom error messages for min/max violations

>EnufPartsValidator.java
> + Line 37 - added validation to check if adding product would make part inventory go below minimum.
> + Error message displays properly

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
>PartTest.java
> + Line 161 - added new unit test for setting inventory below minimum
> + Line 178 - added new unit test for setting inventory above maximum

J.  Remove the class files for any unused validators in order to clean your code.
>DeletePartValidator.java
> + Deleted file for 0 usages.