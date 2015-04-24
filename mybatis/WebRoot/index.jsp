<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


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
   <!-- <a href="toList" title="列表">查看</a> -->
   <form action="addUser" method="post">
   	用户名：<input type="text" name="name"><br/>
   	密码：<input type="text" name="password"><br/>
   	年龄：<input type="text" name="age"><br/>
   	<input type="submit" value="提交"><br/>
   </form>
  </body>
</html>
