<%@page import="beans.KHMemberDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.KHMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장객체</title>
</head>
<body>
	<form action = "/db/kh_searchid" method = "post">
		<input type = "text" name= "q" required>
				<input type = "submit" value ="검색">
		
		</form>
</body>
</html>