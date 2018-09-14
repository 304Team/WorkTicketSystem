<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
      <head>
            <title>工作票添加</title>
            <style> 
                  body
                       {
                         background-size:cover;
                         background:url(image/bg4.jpg);
                       }
                  #add_frame{
                               width: 400px;
                               height: 260px;
                               padding: 13px;
                               position: absolute;
                               left:50%;
                               top:30%;
                               margin-left: -200px;
                               margin-top: -100px;
                               background-color:rgba(240, 255, 255, 0.5);
                               border-radius: 10px;
                               text-align: center;
                              }
                   form p > * {
                               display: inline-block;
                               vertical-align: middle;
                              }
                 .label_input {
                               font-size: 14px;
                               font-family: 宋体;
                               width: 65px;
                               height: 28px;
                               line-height: 28px;
                               text-align: center;
                               color: white;
                               background-color: #8FBC8F;
                               border-top-left-radius: 5px;
                               border-bottom-left-radius: 5px;
                              }
                  .text_field {
                               width: 278px;
                               height: 28px; 
                               border-top-right-radius: 5px;
                               border-bottom-right-radius: 5px;
                               border: 0;
                              }
                   #btn_add {
                               font-size: 14px;
                               font-family: 宋体;
                               width: 120px;
                               height: 28px;
                               line-height: 28px;
                               text-align: center;
                               color: white;
                               background-color: #8FBC8F;
                               border-radius: 6px;
                               border: 0;
                               float: left;
                              }
                  #image_logo {
                               margin-top: 30px;
                              }
               #add_control {
                               padding: 0 28px;
                              }
           </style>
     </head>
     <body>
           <div id="add_frame">
                      <p id="image_logo" style="font-size:30px;color:black;text-shadow: 5px 5px 5px white;">普通用户添加</p>
                           <form method="post">
                              <p><label class="label_input">用户全称</label><input type="text" id="username" class="text_field"/></p>
                              <p><label class="label_input">用户代码</label><input type="text" id="id" class="text_field"/></p>
                              <p><label class="label_input">原因</label><input type="text" id="cause" class="text_field"/></p>
                              <p><label class="label_input">问题描述</label><input type="text" id="summary" class="text_field"/></p>
                              <p><label class="label_input">组件类型</label><input type="text" id="type" class="text_field"/></p>
                              <p><label class="label_input">os类型</label><input type="text" id="ostype" class="text_field"/></p>
                              <p><label class="label_input">标识符</label><input type="text" id="identity" class="text_field"/></p>
                              <p><label class="label_input">工作票状态</label><input type="text" id="status" class="text_field"/></p>
                              <p><label class="label_input">工作票闭合时间</label><input type="text" id="closetime" class="text_field"/></p>
                              <p><label class="label_input">节点id</label><input type="text" id="node" class="text_field"/></p>
                              <p><label class="label_input">解决方案</label><input type="text" id="solution" class="text_field"/></p>
                              <p><label class="label_input">服务器名称</label><input type="text" id="servername" class="text_field"/></p>
                              <p><label class="label_input">告警组</label><input type="text" id="alertgroup" class="text_field"/></p>
                              <p><label class="label_input">组件</label><input type="text" id="component" class="text_field"/></p>
                              <p><label class="label_input">工作id</label><input type="text" id="ticketnumber" class="text_field"/></p>
                              <p><label class="label_input">工作票产生时间</label><input type="text" id="opentime" class="text_field"/></p>
                              <p><label class="label_input">问题严重程度</label><input type="text" id="severity" class="text_field"/></p>
                               <div id="add_control">
                                     <input type="button" id="btn_add" value="添加" onclick="handleaddticket.jsp"/>
                               </div>
                            </form>
         </div>
    </body>
</html>
