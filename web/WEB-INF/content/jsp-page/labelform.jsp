<%--
  User: liudw
  Date: 2021/4/12 9:12
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form Lable练习</title>
</head>
    <form:form modelAttribute="formlable" method="post" action="register">
        <table>
            <tr>
                <th>颜色：</th>
                <td><form:select path="color" items="${colorList}" cssStyle="width: 80px;"/></td>
                <td>form:select标签，选项由后台List定义</td>
            </tr>
            <tr>
                <th>概率：</th>
                <td><form:select path="probabilityId" items="${probabilityList}" itemLabel="probabilityKey" itemValue="probabilityValue" cssStyle="width: 80px;"/></td>
                <td>form:select标签，选项由后台的List定义，List中存储的元素为Probability实体类对象，展示的标签和传送的值为dept对象属性</td>
            </tr>
            <tr>
                <th>爱好：</th>
                <td><form:select path="motion" items="${motionMap}" cssStyle="width: 80px;"/></td>
                <td>form:select标签，选项由后台的Map定义</td>
            </tr>
            <tr>
                <th>姓名：</th>
                <td><form:input path="userName"/></td>
                <td><font color="red"><form:errors path="userName"/></font></td>
            </tr>
            <tr>
                <th>性别：</th>
                <td><form:input path="sex"/></td>
                <td><font color="red"><form:errors path="sex"/></font></td>
            </tr>
            <tr>
                <th>年龄：</th>
                <td><form:input path="age"/></td>
                <td><font color="red"><form:errors path="age"/></font></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"/></td>
            </tr>
        </table>
    </form:form>
<body>

</body>
</html>
