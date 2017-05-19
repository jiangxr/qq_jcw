<%--
  Created by IntelliJ IDEA.
  User: jiangchangwei
  Date: 2017/5/18
  Time: 下午6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h1>用户登录</h1>
<hr>
<div align="center">
    <form action="dologin.jsp" name="loginFomr" method="post">
        <table>
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <input type="text" name="username" value="" />
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <input type="password" name="password" value="" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="submit" value="登录">&nbsp;&nbsp;
                    <input type="reset" name="reset" value="取消">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
