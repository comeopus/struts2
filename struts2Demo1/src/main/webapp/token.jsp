<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-11-11
  Time: 下午3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>

        <s:form action="token.action" theme="simple">
            username:<s:textfield name="username"></s:textfield>
            password:<s:password name="password"></s:password>
            <s:token></s:token>
            <s:submit value="submit"></s:submit>
        </s:form>


</body>
</html>