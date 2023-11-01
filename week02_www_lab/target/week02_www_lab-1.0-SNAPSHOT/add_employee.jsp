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
    <title>Title</title>
</head>
<body>
<h1>Add Employee</h1>
<form action="employee.jsp" method="post">
    <input type="text"  placeholder="Enter name" required>
    <input type="text" placeholder="Enter date (yyyy-MM-dd)" required>
    <input type="email" placeholder="Enter email" required>
    <input type="text" placeholder="Enter phone" required>
    <input type="text" placeholder="Enter address" required>
    <a href="ControlServlet?action=add_employee"><button type="submit" formaction="">Submit</button></a>

</form>
</body>
</html>