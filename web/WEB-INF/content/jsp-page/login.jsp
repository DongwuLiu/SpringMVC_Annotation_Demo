<%--
  User: liudw
  Date: 2021/3/19 16:19
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login page</title>
    </head>
    <body>
        <form action="/user/login" method="post">
            <label>用户名：</label><input type="text" id="username" name="userName" class="input-content" placehold="请输入用户名" /><br>
            <label>密　码：</label><input type="password" id="password" name="password" class="input-content" /><br>
            <input type="reset" value="重置" />&nbsp;&nbsp;&nbsp;<input type="submit" value="登录" />
            <h5>${requestScope.msg}</h5>
        </form>
    </body>
</html>
