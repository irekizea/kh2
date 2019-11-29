<%@page import="beans.KHMemberDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.KHMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
	//q라는 이름의 파라미터를 받는 코드
	
	String q = request.getParameter("q");
	
	KHMemberDao dao = new KHMemberDao();
	List<KHMemberDto> list = dao.search(q);
	
%> 
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장객체</title>
</head>
<body>
	
	<form action = "test5_2.jsp" method = "get">
		<input type = "search" name= "q" placeholder = "이름입력 " required>
		<input type = "submit" value ="검색">
		
		
		</form>
	
  
	<table border = "1">
	
	<tr>
		<th>no</th>
		<th>name</th>
		<th>id</th>
		<th>point</th>
		<th>joindate</th>
	</tr>
	
		<tbody  align = center>
		<tr>
		<%for(KHMemberDto dto : list) { %>
			<td><%= dto.getNo()%></td>
			<td><%= dto.getName()%></td>
			<td><%= dto.getId()%></td>
			<td><%= dto.getPoint()%></td>
			<td><%= dto.getJoindate()%></td>
			
			</tr>
			<%} %>
	
	
	
	</table>
</body>
</html>