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
    <title>Insert Customer</title>
</head>
<body>
<form action="ControlServlet?action=insertCust" method="post">
    Name: <input name="name"><br/>
    Email: <input name="email"><br/>
    Phone: <input name="phone"><br/>
    Addess: <input name="address"><br/>
    <input type="submit" value="Insert">
    <input type="reset" value="Clear">
</form>

</body>
</html>
