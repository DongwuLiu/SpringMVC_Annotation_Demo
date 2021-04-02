<%--
  User: liudw
  Date: 2021/3/18 16:55
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>thanks page</title>
    </head>
    <body>
        ${requestScope.message}<br>
        <a href="/user/hi">Hello</a>
        ${requestScope.msgs}
    </body>
</html>
