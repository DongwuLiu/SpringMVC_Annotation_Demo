<%--
  User: liudw
  Date: 2021/3/18 15:40
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%-- 此处添加/user是因为在HelloController类被注释为@RequestMapping(value = "/user")，所以调用/hello方法时需要写成/user/hello --%>
  <a href="/user/hello">hello</a>
  </body>
</html>
