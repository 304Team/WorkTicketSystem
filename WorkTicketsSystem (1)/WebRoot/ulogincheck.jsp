<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ page import="com.service.LoginService" %>
<html>
  <head>
    <title>校验页面</title>
  </head>
  <body>
    <%
      String s1=request.getParameter("username");
      String s2=request.getParameter("password");
      session.setAttribute("userid",s1);
      LoginService login=new LoginService();
      if(login.isNumber(s1)&&login.isSpecialChar(s2)){
         if(login.userLogin(s1,s2)==1){
     %>
     <jsp:forward page="ticketmanager.jsp"></jsp:forward>
     <%
     }
     else if(login.userLogin(s1,s2)==0){
     
      %>
     <script>
        alert("密码错误，请重试");
        window.location("userlogin.jsp");
    </script>
    <%
    }
    else{
    
     %>
     <script>
        alert("没有该用户，请重试");
        window.location("userlogin.jsp");
    </script>
    <%
    } }
      else{
      
     %>
     <script>
        alert("字符类型不正确，请确认");
        window.location("userlogin.jsp");
    </script>
    <%
    } %>
  </body>
</html>