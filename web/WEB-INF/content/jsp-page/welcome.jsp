<%--
  User: liudw
  Date: 2021/3/18 10:55
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcome page</title>
    </head>
    <body>
        <%-- 页面可以访问Controller传递出来的message --%>
        ${requestScope.message}<br>
        ${requestScope.msg}<br>
        <a href="/user/thankyou">How are you?</a>
    </body>
</html>
