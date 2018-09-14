<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
         <title>首页</title>
         <style>
             a:link{
                         color:black;
                         text-decoration:none;
                   }
             a:visited{
                         color:blue;
                         text-decoration:none;
                      }
             a:hover{
                         color:green;
                         text-decoration:none;
                     }
             a:active {
                          color:red;
                          text-decoration:none;
                      }

                   .box{
                          height:50px;
                          width:150px;
                          position:absolute;
                          left:45%;
                          top: 58%;
                          margin-left: -200px;
                          margin-top: -100px; 
                          border-radius: 10px;
                          background-color:#F5F5DC;
                          background-repeat:repeat-y;
                        }
                   .box1{
                          height:50px;
                          width:150px;
                          position: absolute;
                          left:75%;
                          top: 58%;
                          margin-left: -200px;
                          margin-top: -100px; 
                          border-radius: 10px;
                          background-color:#F5F5DC;
                          background-repeat:repeat-y;
                        }
           </style>
           <style type="text/css"> 
                    body{
                          background-size:cover;
                          background-image:url(image/bg4.jpg);
                          
                        }

                    #top
                        {
                          width:100%;
                          height:100px;
                          padding: 0.1px;
                          background:none;
                          position: absolute;
                          top:10%;
                          text-align: center;
                        }
                    #xi
                        {
                          width:150px;
                          height:30px;
                          padding:13px
                          background:blue;
                          text-align: center;
                          position: absolute;
                          left:45%;
                          top: 60%;
                          margin-left: -200px;
                          margin-top: -100px; 
                          border-radius: 10px;
                         }
                     #pu
                         {
                          width:150px;
                          height:30px;
                          padding:13px
                          background:blue;
                          text-align: center;
                          position: absolute;
                          left:75%;
                          top: 60%;
                          margin-left: -200px;
                          margin-top: -100px; 
                          border-radius: 10px;
                         }
          </style>
  </head>
  <body>
        <div class="box"></div>
            <div class="box1"></div>
                <div id="top">
                    <p style="font-size:40px;color:black;text-shadow: 5px 5px 5px white;">工作票管理系统</p>
                </div>
                <div id="xi">
                    <a href="managerlogin.jsp" style="font-size:20px">系统管理员登录</a>
                </div>
                <div id="pu">
                    <a href="userLogin.jsp" style="font-size:20px">普通用户登录</a>
                </div>
 </body>
</html>