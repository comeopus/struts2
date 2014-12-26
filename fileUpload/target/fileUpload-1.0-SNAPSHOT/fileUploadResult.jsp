<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-12-14
  Time: 下午2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%    /*
        InputStream is = request.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String buffer=null;
        while ((buffer=br.readLine())!=null){
            out.print(buffer + "<br>");
        }
        br.close();
        is.close();   */
%>

            username : ${requestScope.username }<br>
            file: ${requestScope.file}<br>
            file2: ${requestScope.file2 }<br>


</body>
</html>