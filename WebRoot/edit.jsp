<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newcircle.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <a href="/xiguanquan6/xiguanquan/circle_showCircle">返回主页</a>
    <h1 align="center">编辑圈子</h1>   
    <hr>   
   <div align="center">
     <s:form action="xiguanquan/circle_editCircle" method="post">  
       <s:textfield name="circle.circleid" label="圈子id（不可修改）"></s:textfield>
       <s:textfield name="circle.ctitle" label="标题"></s:textfield>
       <s:textfield name="circle.cword" label="内容" style="width:200px;height:200px"></s:textfield>   
       <s:submit value="提交"></s:submit>  
   </s:form>   
   </div>   
  </body>
</html>
