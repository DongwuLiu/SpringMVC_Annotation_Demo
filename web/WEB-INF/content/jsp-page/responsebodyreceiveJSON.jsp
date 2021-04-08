<%--
  User: liudw
  Date: 2021/4/7 15:48
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试返回json格式的数据</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/json2.js"></script>
    <script type="text/javascript">
        $(function () {
            testResponseBody();
        });

        function testResponseBody() {
            $.post("${pageContext.request.contextPath}/json/testRequestBodyResponseBody", null,
            function (data) {
                $.each(data, function () {
                    //创建一个<tr>对象
                    var tr = $("<tr align='left'/>");

                    /*
                    *
                    * appendTo()与append()方法的作用（界面效果）相同：都是在元素(内部)的结尾添加另一个元素
                    * 二者的区别：
                    *   appendTo()：A.appendTo(B)，将A添加到B的结尾；
                    *   append()：A.append(B)，将B添加到A的结尾；
                    *
                    * */

                    //方法一：
                    //向创建的<tr>对象中添加<th>、<td>，并将data中的值赋给<th>、<td>对象后添加到<tr>中
                    // $("<th/>").html(this.id).appendTo(tr);
                    // $("<td/>").html(this.name).appendTo(tr);
                    // $("<td/>").html(this.author).appendTo(tr);
                    // //将<tr>对象添加到id为booktable的表格中
                    // $("#booktable").append(tr);

                    //方法二：
                    tr.append($("<th/>").html(this.id+"d"));
                    tr.append($("<td/>").html(this.name+"d"));
                    tr.append($("<td/>").html(this.author+"d"));
                    tr.appendTo($("#booktable"));
                })
            }, "json");
        }
    </script>
</head>

<body>
    <table id="booktable" border="1" style="border-collapse: collapse;">
        <tr align="center">
            <th>编号</th>
            <th>书名</th>
            <th>作者</th>
        </tr>
    </table>
</body>
</html>
