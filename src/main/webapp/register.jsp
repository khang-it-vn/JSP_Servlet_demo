<%@ page import="java.util.ArrayList" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "jstl" %>
<%@ page import="com.example.JSPTutorial.Entities.Person" %><%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 1/7/2023
  Time: 10:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng ký-Tài khoản</title>
</head>
<body>
    <%ArrayList<Person> persons = (ArrayList<Person>) request.getAttribute("persons"); %>
  <div>Số điện thoại đăng nhập <%=request.getAttribute("numberPhone") %></div>

<jstl:forEach var="person" items="${persons}">
    <div>Danh sách: <jstl:out value="${person.getName()}"/></div>
</jstl:forEach>
    <jstl:forEach var="person" items="${accounts}">
        <div>Danh sách: <jstl:out value="${person.getUsername()}"/></div>
    </jstl:forEach>
</body>
</html>
