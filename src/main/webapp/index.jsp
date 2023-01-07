<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="login" method="get">
    <input type="submit" value="redirect-login">
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>