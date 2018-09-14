<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.service.UserManageService,com.service.LoginService" %>
<html>
  <head>
   <title>事物处理</title>
    </head>
  <body>
    <%
    String s1=request.getParameter("username");
    String s2=request.getParameter("id");
    String s3=request.getParameter("password");
    UserManageService ums=new UserManageService();
    LoginService login=new LoginService();
    if(login.isNumber(s2)&&login.isSpecialChar(s3)){
    
     %>
     <script>
        alert("添加成功");
        window.location("adduser.jsp");
    </script>
    <%
    }else
       %>
       <script>
        alert("字符不正确，请确认");
        window.location("adduser.jsp");
    </script>
  </body>
</html>
