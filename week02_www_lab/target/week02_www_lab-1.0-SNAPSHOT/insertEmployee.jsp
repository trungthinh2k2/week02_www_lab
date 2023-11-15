<%--
  Created by IntelliJ IDEA.
  User: DTS
  Date: 01/11/2023
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Insert Employee</title>
</head>
<body>
<div class="container justify-content-center">
    <h2 class="text-center">Insert Employee</h2>
    <form action="ControlServlet?action=insert_employee" method="post">
        <div class="mb-3">
            <label for="fullName" class="form-label">Full Name: </label>
            <input type="text"  placeholder="Enter name"  class="form-control" id="fullName" name="full_name" required>
        </div>
        <div class="mb-3">
            <label for="dob" class="form-label">DOB: </label>
            <input type="text" placeholder="Enter date (yyyy-MM-dd)"  class="form-control" id="dob" name="dob" required>
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