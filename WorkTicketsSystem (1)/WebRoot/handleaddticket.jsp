<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="UTF-8"%>
<%@ page import="com.service.TicketManageService" %>
<html>
  <head>
    <title>事物处理</title>
   </head>
  <body>
    <%
     String s1=request.getParameter("username"); 
      String s2=request.getParameter("id"); 
       String s3=request.getParameter("cause"); 
        String s4=request.getParameter("summary"); 
         String s5=request.getParameter("type"); 
          String s6=request.getParameter("ostype"); 
           String s7=request.getParameter("identity"); 
            String s8=request.getParameter("status"); 
             String s9=request.getParameter("closetime");
             SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
				Date date=simpleDateFormat.parse(s9);
				java.sql.Date closeDate=new java.sql.Date(date.getTime());
              String s10=request.getParameter("node"); 
               String s11=request.getParameter("solution"); 
                String s12=request.getParameter("servername"); 
                 String s13=request.getParameter("alertgroup"); 
                  String s14=request.getParameter("component"); 
                   String s15=request.getParameter("ticketnumber"); 
                    String s16=request.getParameter("opentime"); 
					date=simpleDateFormat.parse(s16);
					java.sql.Date openDate=new java.sql.Date(date.getTime());
                     String s17=request.getParameter("severity"); 
                     TicketManageService tms=new TicketManageService();
                     tms.insertTicket(s1,s2,s3,s4,s5,s6,s7,s8,closeDate,s10,s11,s12,s13,s14,openDate,s15,s17);
                     
    %>
    <script>
        alert("添加成功");
        window.location("addticket.jsp");
    </script>
  </body>
</html>
