<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-12-14
  Time: 下午2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
        <!--直接上传到jsp-->
        <!--<form action="fileUploadResult.jsp" method="post" enctype="multipart/form-data">
            username:<input type="text" name="username"/><br>
            file:<input type="file" name="file"/><br>
            <input type="submit" value="submit"/>
        </form> -->

        <form action="fileUpload.action" method="post" enctype="multipart/form-data">
            username:<input type="text" name="username"/><br>
            file:<input type="file" name="file"/><br>
            <input type="submit" value="submit"/>
        </form>

</body>
</html>