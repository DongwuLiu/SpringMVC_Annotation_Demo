<%--
  User: liudw
  Date: 2021/3/22 16:54
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home page</title>
    </head>
    <body>
        欢迎${requestScope.get("msg")}登录本系统!<br>
        <a href="/json/bookinfobyjackson">JackSon JSON传递测试</a><br>
        <a href="/json/bookinfobyfastjson">FastJson JSON传递测试</a><br>
        <a href="/json/bookinfobyresponsebody">ResponseBody JSON传递测试</a><br>
        <a href="/xmlbookinfo">XML数据发送/接收测试</a><br>
        <a href="/registerForm">Form表单</a><br>
        <a href="/labelForm">Form标签</a>
    </body>
</html>
