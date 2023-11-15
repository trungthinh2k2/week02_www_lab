<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.models.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.repositories.EmployeeRepository" %>
<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.services.EmployeeService" %><%--
  Created by IntelliJ IDEA.
  User: DTS
  Date: 22/10/2023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <title>Employee</title>
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
  EmployeeService employeeService =new EmployeeService();
  List<Employee> lst = employeeService.getListEmployee();
%>
<div class="container">
  <h2 class="text-center">List Employee</h2>
  <table width="100%" border="1" align="center">
    <tr content="center" align="center">
      <th>ID</th>
      <th>Name</th>
      <th>DOB</th>
      <th>Email</th>
      <th>Phone</th>
      <th>Address</th>
      <th>Status</th>
      <th colspan="2"><a href="insertEmployee.jsp">Insert</a></th>
    </tr>
    <%for (Employee emp: lst) {%>
    <tr>
      <td><%=emp.getId()%></td>
      <td><%= emp.getFullname() %></td>
      <td><%=emp.getDob() %></td>
      <td><%=emp.getEmail() %></td>
      <td><%=emp.getPhone() %></td>
      <td><%=emp.getAddress() %></td>
      <td><%=emp.getStatus() %></td>
      <td><a class="btn btn-success" href="#">Update</a></td>
      <td><a class="btn btn-danger" href="#">Delete</a></td>
      </tr>
    <%}%> <br>
  </table>
</div>
</body>
</html>
