<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
         <title>普通用户管理界面</title>
              <style type="text/css">
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
                              width:100px;
                              position: absolute;
                              left:35%;
                              top: 58%;
                              margin-left: -200px;
                              margin-top: -100px; 
                              border-radius: 10px;
                              background-color:#F5F5DC;
                              background-repeat:repeat-y;
                            }
                        .box1{
                                 height:50px;
                                 width:100px;
                                 position: absolute;
                                 left:45%;
                                 top: 58%;
                                 margin-left: -200px;
                                 margin-top: -100px; 
                                 border-radius: 10px;
                                 background-color:#F5F5DC;
                                 background-repeat:repeat-y;
                             }
                         .box2{
                                   height:50px;
                                   width:100px;
                                   position: absolute;
                                   left:55%;
                                   top: 58%;
                                   margin-left: -200px;
                                   margin-top: -100px; 
                                   border-radius: 10px;
                                   background-color:#F5F5DC;
                                   background-repeat:repeat-y;
                              }
                          .box3{
                                   height:50px;
                                   width:100px;
                                   position: absolute;
                                   left:65%;
                                   top: 58%;
                                   margin-left: -200px;
                                   margin-top: -100px; 
                                   border-radius: 10px;
                                   background-color:#F5F5DC;
                                   background-repeat:repeat-y;
                              }
                          .box4{
                                   height:50px;
                                   width:100px;
                                   position: absolute;
                                   left:75%;
                                   top: 58%;
                                   margin-left: -200px;
                                   margin-top: -100px; 
                                   border-radius: 10px;
                                   background-color:#F5F5DC;
                                   background-repeat:repeat-y;
                              }
                          .box5{
                                   height:50px;
                                   width:100px;
                                   position: absolute;
                                   left:85%;
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
                            height:150px;
                            padding: 0.1px;
                            background:none;
                            position: absolute;
                            top:13%;
                            text-align: center;
                          }
                    #chakan
                          {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:35%;
                            top:60%;
                            margin-left: -200px;
                            margin-top: -100px; 
                            border-radius: 10px;
                          }
                   #add
                         {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:45%;
                            top:60%;
                            margin-left: -200px;
                            margin-top: -100px; 
                            border-radius: 10px;
                          }
                  #chaxun
                         {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:55%;
                            top:60%;
                            margin-left: -200px;
                            margin-top: -100px; 
                            border-radius: 10px;
                          }
                    #daoru
                          {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:65%;
                            top:60%;
                            margin-left: -200px;
                            margin-top: -100px; 
                            border-radius: 10px;
                          }
                  #daochu
                          {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:75%;
                            top:60%;
                            margin-left: -200px;
                            margin-top: -100px; 
                            border-radius: 10px;
                          }
                 #tongji
                          {
                            width:100px;
                            height:30px;
                            padding:13px
                            background:blue;
                            text-align: center;
                            position: absolute;
                            left:85%;
                            top:60%;
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
               <div class="box3"></div>
                <div class="box4"></div>
                 <div class="box5"></div>
                  <div id="top">
                       <p style="font-size:40px;color:black;text-shadow: 5px 5px 5px white;">普通用户管理界面</p>
                  </div>
                   <div id="chakan">
<<<<<<< HEAD
                       <a href="islook.jsp" style="font-size:20px">查看</a>
                   </div>
                    <div id="add">
                         <a href="isaddticket.jsp" style="font-size:20px">新增</a>
                    </div>
                     <div id="chaxun">
                        <a href="isquery.jsp" style="font-size:20px">查询</a>
                     </div>
                    <div id="daoru">
                         <a href="isimport.jsp" style="font-size:20px">导入</a>
                     </div>
                    <div id="daochu">
                         <a href="isexport.jsp" style="font-size:20px">导出</a>
                    </div>
                       <div id="tongji">
                            <a href="isstatistics.jsp" style="font-size:20px">统计</a>
=======
                       <a href="查看.html" style="font-size:20px">查看</a>
                   </div>
                    <div id="add">
                         <a href="新增.html" style="font-size:20px">新增</a>
                    </div>
                     <div id="chaxun">
                        <a href="查询.html" style="font-size:20px">查询</a>
                     </div>
                    <div id="daoru">
                         <a href="导入.html" style="font-size:20px">导入</a>
                     </div>
                    <div id="daochu">
                         <a href="导出.html" style="font-size:20px">导出</a>
                    </div>
                       <div id="tongji">
                            <a href="统计.html" style="font-size:20px">统计</a>
>>>>>>> version 2.0
                       </div>
     </body>
</html>

