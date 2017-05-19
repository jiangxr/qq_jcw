<%--
  Created by IntelliJ IDEA.
  User: jiangchangwei
  Date: 2017/5/19
  Time: 下午1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理用户发送的信息</title>
</head>
<body>
提交的信息为：<%= request.getParameter("input")%>
</body>
</html>
