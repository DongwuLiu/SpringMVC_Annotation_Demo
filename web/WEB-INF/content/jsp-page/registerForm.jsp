<%--
  User: liudw
  Date: 2021/4/8 16:39
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户-注册</title>
</head>

<body>
<%-- modelAttribute与commandName属性都可以更改当前form对象绑定model中的JavaBean名称 --%>
    <form:form modelAttribute="regs" method="post" action="register">
        <table>
            <tr>
                <th>姓名：</th>
                <td><form:input path="userName"/></td>
                <td>form:input标签</td>
            </tr>
            <tr>
                <th>性别：</th>
                <td><form:input path="sex"/></td>
                <td>form:input标签</td>
            </tr>
            <tr>
                <th>年龄：</th>
                <td><form:input path="age"/></td>
                <td>form:input标签</td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><form:password path="password" showPassword="true"/></td>
                <td>form:password标签</td>
            </tr>
            <tr>
                <th></th>
                <td><form:hidden path="individualSignature"/></td>
                <td>form:hidden标签</td>
            </tr>
            <tr>
                <th>个人说明：</th>
                <td><form:textarea path="personalDescription" rows="10" cols="30"/></td>
                <td>form:textarea标签</td>
            </tr>
            <tr>
                <th>选择课程：</th>
                <td>
                    <form:checkbox path="selectionCourse" value="JAVAEE" label="JAVAEE"/>
                    <form:checkbox path="selectionCourse" value="Spring" label="Spring"/>
                    <form:checkbox path="selectionCourse" value="Mybatis" label="Mybatis"/>
                </td>
                <td>form:checkbox标签</td>
            </tr>
            <tr>
                <th></th>
                <th><form:checkbox path="userAgreement" label="已经阅读相关协议"/></th>
                <td>form:checkbox标签</td>
            </tr>
            <tr>
                <th>爱好：</th>
                <td><form:checkboxes path="hobby" items="${hobbyList}"/></td>
                <td>form:checkboxes标签，选项由后台List定义</td>
            </tr>
            <tr>
                <th>学历：</th>
                <td><form:checkboxes path="education" items="${educationMap}"/></td>
                <td>form:checkboxes标签，选项由后台的Map定义</td>
            </tr>
            <tr>
                <th>选择部门：</th>
                <td><form:checkboxes path="depts" items="${deptList}" itemValue="id" itemLabel="name"/></td>
                <td>form:checkboxes标签，选项由后台的List定义，List中存储的元素为Dept实体类对象，展示的标签和传送的值为dept对象属性</td>
            </tr>
            <tr>
                <th>性别：</th>
                <td>
                    <form:radiobutton path="sex" value="男" label="男"/>
                    <form:radiobutton path="sex" value="女" label="女"/>
                </td>
                <td>form:radiobutton标签</td>
            </tr>
            <tr>
                <th>结果：</th>
                <td><form:radiobuttons path="result" items="${resultList}"/></td>
                <td>form:radiobuttons标签，选项由后台的List定义</td>
            </tr>
            <tr>
                <th>大小：</th>
                <td><form:radiobuttons path="size" items="${sizeMap}"/></td>
                <td>form:radiobuttons标签，选项由后台的Map定义</td>
            </tr>
            <tr>
                <th>态度：</th>
                <td><form:radiobuttons path="attitudes" items="${attitudeList}" itemValue="attitudeValue" itemLabel="attitudeKey"/></td>
                <td>form:radiobuttons标签，选项由后台的List定义，List中存储的元素为Attitude实体类对象，展示的标签和传送的值为attitude对象属性</td>
            </tr>
        </table>
    </form:form>
</body>
</html>