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
        <h2>用户注册</h2>
        <s:actionerror cssStyle="color: red"/>
        -------------------------------------------
        <s:fielderror cssStyle="color: blue"/>
   <!--     <form action="registerAction.action">
            username: <input type="text" name="username" size="20"/><br>
            password: <input type="password" name="password" size="20"/>  <br>
            repassword:<input type="password" name="repassword" size="20"><br>
            age:<input type="text" name="age" size="20"><br>
            birthday:<input type="text" name="birthday" size="20"> <br>
            graduation:<input type="text" name="graduation" size="20"> <br>
            <input type="submit" value="submit"/>
        </form>      -->
        <!--form  标签里面有一个theme属性   若将它设置为simple   则
                可以自己进行设置表格   同时也可以拥有struts标签库的一些功能-->
        <s:form action="registerAction.action" theme="simple">
            username: <s:textfield name="username" label="username"></s:textfield><br>
            password: <s:password name="password" label="password"></s:password><br>
            repassword: <s:password name="repassword" label="repassword"></s:password><br>
            age: <s:textfield name="age" label="age"></s:textfield><br>
            birthday: <s:textfield name="birthday" label="birthday"></s:textfield><br>
            graduation: <s:textfield name="graduation" label="graduation"></s:textfield><br>

            <s:submit value="submit"/>
        </s:form>

</body>
</html>