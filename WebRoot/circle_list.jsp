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
    
    <title>圈子</title>
    
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
  <s:form action="/xiguanquan/circle_queryCircles" method="post">
  <label>圈子名称：</label><input type="text" name="keyWords" placeholder="请输入关键词"><s:submit value="查询"></s:submit>
  </s:form>
  
  <td><a href="newcircle.jsp">发表圈子 </a></td>
  <td><a href="newtrend.jsp?usernid=${usernid}">发表动态 </a></td>
  <td><a href="xiguanquan/circle_showAcircle?usernid=${usernid}">关注的圈子 </a></td>
  <a href="/xiguanquan6/xiguanquan/circle_showCircle?usernid=${usernid}">首页</a>
  <div align="center">
     <s:form>
       <table>
         <c:forEach var="circle" items="${circleList}">
          <tr>
            <td>标题：<a href="xiguanquan/circle_showDetail?circleid=${circle.circleid}"><c:out value="${circle.ctitle}"></c:out></a></td>
            <td>内容：<c:out value="${circle.cword}"></c:out></td>
            <td><a href="xiguanquan/circle_attend?circleid=${circle.circleid}&usernid=${usernid}&ctitle=${circle.ctitle}">关注</a></td>
            <td><a href="xiguanquan/circle_showEdit?circleid=${circle.circleid}">编辑</a></td>
            <td><a href="xiguanquan/circle_deleteCircle?circleid=${circle.circleid}">删除</a></td>
          </tr>
        </c:forEach>
      </table>
    </s:form>
    </div>
  </body>
</html>