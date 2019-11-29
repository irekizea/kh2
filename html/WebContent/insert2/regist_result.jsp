<%@page import="beans.KHMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% KHMemberDao dao = new KHMemberDao(); 



%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>등록 완료</h1>

	
		<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
		</tr>
		
		<tr>
			<th></th>
			<th></th>
		</tr>
	

	</table>
	
		<h2> <a href= "regist.jsp"> 추가 등록</a></h2>
	
</body>
</html>