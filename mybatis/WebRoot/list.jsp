<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
	  <table border="1">
	  	  <tr>
		  	<td colspan="4"><a href="user/toAdd?id=${user.id }" title="添加">添加</a></td>
		  </tr>
		  <tr>
		  	<td>序号</td><td>名称</td><td>年龄</td><td>操作</td>
		  </tr>
	   	<c:forEach var="user" items="users" varStatus="xh">
	   		<td>${xh.index }</td>
	   		<td>${user.name }</td>
	   		<td>${user.age }</td>
	   		<td>
	   			<a href="user/toUpdate?id=${user.id }" title="修改">修改</a>
	   			<a href="user/delete?id=${user.id }" title="删除">删除</a>
	   		</td>
	   	</c:forEach>
	   </table>
  </body>
</html>
