<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.models.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.week02_www_lab.backend.repositories.EmployeeRepository" %><%--
  Created by IntelliJ IDEA.
  User: DTS
  Date: 22/10/2023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Employee</title>
</head>
<%
  EmployeeRepository employeeRepository = new EmployeeRepository();
  List<Employee> employees = employeeRepository.getListEmployee();
%>
<body>
<div>
  <table width="80%" align="center" border="1">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>DOB</th>
      <th>Email</th>
      <th>Phone</th>
      <th>Address</th>
      <th>Status</th>
      <th colspan="2"><a href="">Insert</a></th>
    </tr>
    <%for (Employee emp: employees) {%>
    <tr>
      <td><%=emp.getId()%></td>
      <td><%= emp.getFullname() %></td>
      <td><%=emp.getDob() %></td>
      <td><%=emp.getEmail() %></td>
      <td><%=emp.getPhone() %></td>
      <td><%=emp.getAddress() %></td>
      <td><%=emp.getStatus() %></td>
      <td><a href="#">Update</a></td>
      <td><a href="#">Delete</a></td>
<%--      control?action=delete_emp?empId=<%=emp.getId()%>--%>
      <%}%>
    </tr>
  </table>
</div>
</body>
</html>
