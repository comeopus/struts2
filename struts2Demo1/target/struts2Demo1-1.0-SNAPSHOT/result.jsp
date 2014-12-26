<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-11-11
  Time: 下午3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


            username: ${requestScope.username }<br/>
            password: ${requestScope.password }<br/>
            age:${requestScope.age}<br/>
            date:${requestScope.date}<br/>
            session:${sessionScope.hello}



</body>
</html>