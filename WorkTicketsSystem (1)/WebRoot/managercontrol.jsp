<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
     <title>系统管理界面</title>
         <style>
               a:link{
                         color:black;
                         text-decoration:none;
                     }
               a:visited {
                              color:blue;
                              text-decoration:none;
                         }
               a:hover {
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
                        position: absolute;
                        left:40%;
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
                          left:60%;
                          top: 58%;
                          margin-left: -200px;
                          margin-top: -100px; 
                          border-radius: 10px;
                          background-color:#F5F5DC;
                          background-repeat:repeat-y;
                     }
                .box2{
                           height:50px;
                           width:150px;
                           position: absolute;
                           left:80%;
                           top: 58%;
                           margin-left: -200px;
                           margin-top: -100px; 
                           border-radius: 10px;
                           background-color:#F5F5DC;
                           background-repeat:repeat-y;
                      }
         </style>
           <style> 
                  body{
                         background-size:cover;
                         background:url(image/bg4.jpg);
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
                  #add
                       {
                           width:150px;
                           height:30px;
                           padding:13px
                           background:blue;
                           text-align: center;
                           position: absolute;
                           left:40%;
                           top: 60%;
                           margin-left: -200px;
                           margin-top: -100px; 
                           border-radius: 10px;
                        }
                  #charge
                       {
                           width:150px;
                           height:30px;
                           padding:13px
                           background:blue;
                           text-align: center;
                           position: absolute;
                           left:60%;
                           top: 60%;
                           margin-left: -200px;
                           margin-top: -100px; 
                           border-radius: 10px;
                        }
                  #fenpei
                          {
                            width:150px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:80%;
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
                  <div class="box2"></div>
                         <div id="top">
                                <p style="font-size:40px;color:black;text-shadow: 5px 5px 5px white;">系统管理界面</p>
                         </div>
                         <div id="add">
<<<<<<< HEAD
                                <a href="adduser.jsp" style="font-size:20px">普通用户添加</a>
                         </div>
                         <div id="charge">
                                <a href="manageuser.jsp" style="font-size:20px">普通用户管理</a>
                         </div>
                         <div id="fenpei">
                                <a href="dividepower.jsp" style="font-size:20px">普通用户分配</a>
=======
                                <a href="普通用户添加.html" style="font-size:20px">普通用户添加</a>
                         </div>
                         <div id="charge">
                                <a href="用户状态管理.html" style="font-size:20px">普通用户管理</a>
                         </div>
                         <div id="fenpei">
                                <a href="用户权限分配.html" style="font-size:20px">普通用户分配</a>
>>>>>>> version 2.0
                          </div>
  </body>
</html>

