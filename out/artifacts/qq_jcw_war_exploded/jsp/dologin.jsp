<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: jiangchangwei
  Date: 2017/5/18
  Time: 下午8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loginDAO" class="com.dao.LoginDAO" scope="page" />
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean isUser = false;
    try {
        isUser = loginDAO.isUser(username, password);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    if(isUser) {
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }else {
        response.sendRedirect("login_failure.jsp");
    }
%>
