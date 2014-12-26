<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.whut.platform.action.ognl.OgnlAction" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-12-19
  Time: 上午10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>

        username:<s:property value="username"/><br>
        password:<s:property value="password"/><br>
        -------------------------------------------<br>

        username:<s:property value="#parameters.username"/><br>
        password:<s:property value="#parameters.password"/><br>
        -------------------------------------------<br>

        request:<s:property value="#request.hello"/><br>
        session:<s:property value="#session.hello"/><br>
        application:<s:property value="#application.hello"/><br>
        -------------------------------------------<br>
        <!--底层实现-->
        request:<%= ((Map)ActionContext.getContext().get("request")).get("hello")%>  <br>
        session:<%= ActionContext.getContext().getSession().get("hello")%>  <br>
        application:<%= ActionContext.getContext().getApplication().get("hello")%><br>
        attr:<%= ((Map)ActionContext.getContext().get("attr")).get("hello")%>  <br >

        -------------------------------------------<br>
        person1:address:<s:property value="list[0].address"/> <br>
        person2:age:<s:property value="list[1].age"/> <br>
        size:<s:property value="list.size"/> <br>
        isEmpty:<s:property value="list.isEmpty()"/> <br>
        -------------------------------------------<br>
        <!--Action对象放在值栈的最上面   peek()方法返回的就是值栈ValueStack   所以它可以强制转换为OgnlAction-->
        person1:address:<%= ((OgnlAction)ActionContext.getContext().getValueStack().peek()).getList().get(0).getAddress()%><br>
        person2:age:<%= ((OgnlAction)ActionContext.getContext().getValueStack().peek()).getList().get(1).getAge()%> <br>
        person1:cat1:name:<%= ((OgnlAction)(ActionContext.getContext().getValueStack().peek())).getList().get(0).getCat().getName()%><br>
        -------------------------------------------<br>
        person2:friend:<s:property value="list[1].friends[2]"/><br>
        person2:friend:<%= ((OgnlAction)ActionContext.getContext().getValueStack().peek()).getList().get(1).getFriends()[2]%> <br>
        -------------------------------------------<br>
        person2:map2:<s:property value="list[1].map['hello2']"/><br>
        -------------------------------------------<br>
        <!--  过滤 -->
        filtering:<s:property value="list.{? #this.name.length()>2}[1].name"/>
        -------------------------------------------<br>

        <s:iterator value="list.{? #this.name.length()>2}">
            <s:property value="name"/>
            <s:property value="cat.color"/>
            <s:property value="friends[0]"/>
        </s:iterator>
</body>
</html>