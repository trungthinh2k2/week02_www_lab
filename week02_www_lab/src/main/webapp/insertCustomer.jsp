<%--
  Created by IntelliJ IDEA.
  User: DTS
  Date: 15/11/2023
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Insert Customer</title>
</head>
<body>
<div class="container justify-content-center">
    <h2 class="text-center">Insert Customer</h2>
    <form action="ControlServlet?action=insert_customer" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Full Name: </label>
            <input type="text"  placeholder="Enter name"  class="form-control" id="name" name="cust_name" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email: </label>
            <input type="email" placeholder="Enter email" class="form-control" id="email" name="email" required>
        </div>
        <div class="mb-3">
            <label for="phone" class="form-label">Phone: </label>
            <input type="tel" placeholder="Enter phone" class="form-control" id="phone" name="phone" required>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address: </label>
            <input type="text" placeholder="Enter address" class="form-control" id="address" name="address" required>
        </div>
        <br>
        <div class="mb-3 col-md-3">
            <button type="submit" class="form-control btn btn-primary btn-block">Insert</button>
            <button type="reset" class="form-control btn btn-warning btn-block">Reset</button>
        </div>
    </form>
</div>
</body>
</html>
