## How to Use

1. Run the `HelloServlet.java` class. This will start the server and deploy the servlet.
2. Open a web browser and navigate to the URL where the servlet is hosted (typically `localhost:8080/app_context/operations`, edit app_context based on your custom app name).
3. You will see a simple calculator interface. Enter two numbers in the provided fields.
4. Choose the operation you want to perform (Add, Subtract, Multiply, Divide) by clicking the corresponding button.

## Functionality

The `HelloServlet.java` class is a servlet that handles HTTP GET requests. It retrieves two numbers and an operation from the request parameters. Depending on the operation, it performs the corresponding mathematical operation using the `MathOperations` class and sends the result back in the HTTP response.

The `MathOperations.java` class contains methods for basic mathematical operations: addition, subtraction, multiplication, and division.

The `index.jsp` file is a JSP (JavaServer Pages) file that provides the HTML for the calculator interface. It includes a form where users can input two numbers and choose an operation. When the form is submitted, it sends a GET request to the servlet with the input numbers and chosen operation as parameters.
