<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<html>   
  <head>   
    <title> 注册页面 </title> 
  </head>   
  <body>   
    <h1 align="center">用户注册页面</h1>   
    <hr>   
   <div align="center">
     <s:form action="xiguanquan/user_addUser" method="post">  
       <s:textfield name="user.userName" label="用户名"></s:textfield>   
       <s:textfield name="user.nickname" label="昵称"></s:textfield>
       <s:password name="user.upassword" label="密码"></s:password>
       <s:textfield name="user.occupation" label="职业"></s:textfield> 
       <s:submit value="注册"></s:submit>  
   </s:form>   
   </div>   
  </body>   
  
</html> 
