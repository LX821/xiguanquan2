<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="author" content="">
	<link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

	<header>
	<s:form action="/xiguanquan/circle_queryCircles" method="post">
      <label>圈子名称：</label><input type="text" name="keyWords" placeholder="请输入关键词"><s:submit value="查询"></s:submit>
    </s:form>
    <div class="wrapper">
		<nav>
			<ul class="main_nav">
				<li><a href="/xiguanquan6/xiguanquan/circle_showCircle?usernid=${usernid}">首页</a></li>
			    <li><a href="newcircle.jsp">发表圈子 </a></li>
				<li><a href="/xiguanquan6/newtrend.jsp?usernid=${usernid}">发表动态 </a></li>
				<li><a href="xiguanquan/circle_showAcircle?usernid=${usernid}">关注的圈子 </a></li>
			</ul>
		</nav>
	</div>
	</header><!-- Header End -->
	<section class="main wrapper">
		<article>
	      <s:form>
             <c:forEach var="circle" items="${circleList}">
			<div class="post">
				<h1 class="title">
					<a href="xiguanquan/circle_showDetail?circleid=${circle.circleid}"><c:out value="${circle.ctitle}"></c:out></a>
				</h1>
				
				<p><c:out value="${circle.cword}"></c:out></p>
				<a href="xiguanquan/circle_attend?circleid=${circle.circleid}&usernid=${usernid}&ctitle=${circle.ctitle}">关注</a>
                <a href="xiguanquan/circle_showEdit?circleid=${circle.circleid}">编辑</a>
                <a href="xiguanquan/circle_deleteCircle?circleid=${circle.circleid}">删除</a>
			</div>
	  </c:forEach>
    </s:form>
    </article>
</section>
</body>
</html>