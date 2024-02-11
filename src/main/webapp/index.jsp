<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Simple Calculator</title>
  <style>
    body {
      font-family: Arial, sans-serif;
    }
    .operations {
      display: grid;
      grid-template-columns: repeat(2, 1fr);
      grid-gap: 10px;
      margin-top: 20px;
    }
    .operations button {
      padding: 10px;
      font-size: 16px;
      border: none;
      color: white;
      background-color: #4CAF50;
      cursor: pointer;
    }
    .operations button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<h1>Simple Calculator</h1>
<br/>
<form action="servlet" method="get">
  <label>
    <input type="number" name="num1" required>
  </label>
  <label>
    <input type="number" name="num2" required>
  </label>
  <div class="operations" style="display: grid;font-size: 20px;grid-gap: 5px">
    <button type="submit" name="op" value="add">Add</button>
    <button type="submit" name="op" value="subtract">Subtract</button>
    <button type="submit" name="op" value="multiply">Multiply</button>
    <button type="submit" name="op" value="divide">Divide</button>
  </div>
</form>
</body>
</html>
