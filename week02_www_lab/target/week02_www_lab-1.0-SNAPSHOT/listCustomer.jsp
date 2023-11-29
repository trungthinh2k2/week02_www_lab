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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>List Customer</title>
    <style>
        th{
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }

        td{
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
    </style>
</head>
<body>
<%
    CustomerService services =new CustomerService();
    List<Customer> lst = services.getAll();
%>
<div class="container">
    <h2 class="text-center">List Customer</h2>
    <table width="100%" border="1" align="center">
        <tr content="center" align="center">
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th colspan="2"><a href="insertCustomer.jsp">Insert</a> </th>
        </tr>
        <% for(Customer customer:lst){%>
        <tr>
            <td><%=customer.getId()%></td>
            <td><%=customer.getName()%></td>
            <td><%=customer.getAddress()%></td>
            <td><%=customer.getPhone()%></td>
            <td><%=customer.getEmail()%></td>
            <td>
                <a class="btn btn-success" href="#">Update</a>
            </td>
            <td>
                <a class="btn btn-danger" href="ControlServlet?action=delete-customer&customerIdDelete=<%= customer.getId() %>">Delete</a>
            </td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>
