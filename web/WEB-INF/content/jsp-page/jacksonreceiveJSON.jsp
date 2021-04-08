<%--
  User: liudw
  Date: 2021/3/25 9:42
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>receive json page</title>

        <script type="text/javascript" src="/js/jquery.min.js"></script>
        <script type="text/javascript" src="/js/json2.js"></script>
        <script type="text/javascript">
            $(function () {
                testRequestBody();
            });

            function testRequestBody() {
                $.ajax("${pageContext.request.contextPath}/json/testRequestBodyJackson",
                    {
                        dataType : "json",  //预期服务器返回的数据类型
                        type : "post",      //请求方式：get或post
                        contentType : "application/json",   //发送信息至服务器时的内容编码格式
                        data : JSON.stringify({id : 1, name : "Spring MVC企业应用实战"}),
                        async : true,       //默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
                        //请求成功后的回调函数
                        success : function (data) {
                            console.log(data);
                            $("#id").html(data.id);
                            $("#name").html(data.name);
                            $("#author").html(data.author);
                        },
                        error : function (data) {
                            alert("数据发送失败！");
                        }
                    });
            }
        </script>
    </head>
    <body>
        编号：<span id="id"></span><br>
        书名：<span id="name"></span><br>
        作者：<span id="author"></span><br>
    </body>
</html>
