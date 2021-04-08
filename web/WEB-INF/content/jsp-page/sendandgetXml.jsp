<%--
  User: liudw
  Date: 2021/4/8 10:28
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试发送XML格式数据</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/json2.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#sendXMLInfo").click(function() {
                sendXML();
            });

            $("#getXMLInfo").click(function () {
                getXML();
            });
        });

        function sendXML() {
            var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                    "<xmlBook><id>1</id><name>疯狂Java讲义</name><author>李刚</author></xmlBook>";

            $.ajax("${pageContext.request.contextPath}/sendxml",    //发送请求的URL字符串
                {
                    type : "POST",  //请求方式：GET or POST
                    contentType : "application/xml",    //发送信息至服务器时的内容编码类型
                    data : xmlData, //发送到服务器的数据
                    async : true    //默认设置下，所有请求均为异步请求。如果设为false，则发送同步请求
                });
        }

        function getXML() {
            $.ajax("${pageContext.request.contextPath}/getxml",     //发送请求的URL字符串
                {
                    dataType : "text",  //预期服务器返回的数据类型
                    type : "POST",      //请求方式：GET or POST
                    async : true,       //默认设置下，所有请求均为异步请求。如果设为false，则发送同步请求
                    //请求成功后的回调函数
                    success : function (xml) {
                        //获得xml数据的id，name，author
                        var id = $("id", xml).text();
                        var name = $("name", xml).text();
                        var author = $("author", xml).text();

                        var tr = $("<tr align='center' />");
                        $("<td/>").html(id).appendTo(tr);
                        $("<td/>").html(name).appendTo(tr);
                        $("<td/>").html(author).appendTo(tr);
                        $("#booktable").append(tr);
                    },
                    error : function () {
                        alert("数据接收失败！");
                    }
                });
        }
    </script>
</head>
<body>
    <table id="booktable" border="1" style="border-collapse: collapse;">
        <tr align="center">
            <th>编号</th>
            <th>姓名</th>
            <th>作者</th>
        </tr>
    </table><br>
    <button id="sendXMLInfo">发送</button>
    <button id="getXMLInfo">接收</button>
</body>
</html>
