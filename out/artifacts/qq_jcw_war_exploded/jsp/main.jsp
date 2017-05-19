<%--
  Created by IntelliJ IDEA.
  User: jiangchangwei
  Date: 2017/5/19
  Time: 下午1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>聊天界面</title>
</head>
<body>
<h1>欢迎<font color="red"><%= request.getParameter("username")%></font>登录~</h1>
sessionId:<%= session.getId()%>
<hr>
<div align="center">
    <div id="showInfo">
        <textarea name="show" style="height: 300px;width: 100%;" readonly></textarea>
    </div>
    <form action="doMain.jsp" name="inputForm" method="post">
    <div id="inputInfo">
        <input type="text" name="input" maxlength="100" style="width: 80%;height: auto;">
        <input type="submit" name="submit" value="提交" >&nbsp;&nbsp;
        <input type="reset" name="reset" value="取消">
    </div>
    </form>
</div>
</body>
</html>
