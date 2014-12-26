<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-12-15
  Time: 下午7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="scripts/jquery-1.10.2.js"></script>

    <script type="text/javascript">
        function getInfo()
        {
            var postData = {
                name:$("#name").val()
            };
            $.post("getJsonAction2.action",postData,getCallback);
        }

        function getCallback(data,status){

            var id = data.id;
            var name = data.name;
            var age = data.age;
            var address = data.address;

            var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>age</th><th>address</th><tr align='center'><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" + address + "</td></tr></table>";

            $("#theBody table:eq(0)").remove();

            $("#theBody").append(html);

        }
    </script>

</head>
<body id="theBody">

    <select id="name">
         <option value="zhangsan">zhangsan</option>
          <option value="lisi">lisi</option>
    </select>

    <input type="button" value="get information" onclick="getInfo()"/>

</body>
</html>