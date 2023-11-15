<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.services.CustomerService" %>
<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.models.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DTS
  Date: 15/11/2023
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<%
    CustomerService services =new CustomerService();
    List<Customer> lst = services.getAll();
%>
<table width="80%" align="center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Email</th>
        <th><a href="insertCustomer.jsp">Insert</a> </th>
    </tr>
    <% for(Customer customer:lst){%>
    <tr>
        <td><%=customer.getId()%></td>
        <td><%=customer.getName()%></td>
        <td><%=customer.getAddress()%></td>
        <td><%=customer.getPhone()%></td>
        <td><%=customer.getEmail()%></td>
        <td>
            <a href="">Update</a>
            <a href="">Delete</a>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
