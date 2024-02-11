package com.example.ds_lab3;

import java.io.*;
import java.util.logging.Logger;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Methods";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Log a message to help with debugging
        Logger logger = Logger.getLogger(HelloServlet.class.getName());
        logger.info("HelloServlet accessed.");

        // Retrieve the numbers from the request parameters
        int x = Integer.parseInt(request.getParameter("num1"));
        int y = Integer.parseInt(request.getParameter("num2"));

        MathOperations math = new MathOperations();

        // Retrieve the "operation" parameter from the request
        String operation = request.getParameter("op");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Use a conditional structure based on the "operation" parameter
        if ("add".equals(operation)) {
            int added = math.add(x, y);
            out.println("Result of addition: " + added);
        } else if ("subtract".equals(operation)) {
            int subtracted = math.subtract(x, y);
            out.println("Result of subtraction: " + subtracted);
        } else if ("multiply".equals(operation)) {
            int multiplied = math.multiply(x, y);
            out.println("Result of multiplication: " + multiplied);
        } else if ("divide".equals(operation)) {
            if (y != 0) {
                double divided = math.divide(x, y);
                out.println("Result of division: " + divided);
            } else {
                out.println("Error: Division by zero is not allowed.");
            }
        } else {
            // Handle the case when the "operation" parameter is not recognized
            out.println("Invalid operation");
        }
    }

    public void destroy() {
    }
}
