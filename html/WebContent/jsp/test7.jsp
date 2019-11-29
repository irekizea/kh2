<%@page import="beans.SnackDto"%>
<%@page import="beans.SnackDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
	 request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	
	if(name==null)
		name="";


	SnackDao dao = new SnackDao();
	List<SnackDto> list = dao.getList(name);
  	List<SnackDto> list2 = dao.search();
%> 
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장객체</title>



</head>
<body>
	<h1> 과자 검색</h1>
	
	
	<form action = "test7.jsp" method = "post">
		<input type = "search" name= "name" placeholder = "이름입력 " required value=<%=name %>>
		<input type = "submit" value ="검색">
		
		
		</form>
	<a href = "test7.jsp">목록복</a>
	
	
	
	<% if(name == null || name.trim().equals("")){%>
		 
	<table  border="1" style="border-collapse:collapse;">
	
	<tr>
		<th>no</th>
		<th>name</th>
		<th>price</th>
		<th>stock</th>
	</tr>
	
		<tbody  align = center>
		<tr>
		<%for(SnackDto dto : list2) { %>
			<td><%= dto.getNo()%></td>
			<td><%= dto.getName()%></td>
			<td><%= dto.getPrice()%></td>
			<td><%= dto.getStock()%></td>
			</tr>
			<%} %>
			
		</table>
	
	
	<%}
	else{
	
	if(list.size()!=0){%>
	
  
	<table  border="1" style="border-collapse:collapse;">
	
	<tr>
		<th>no</th>
		<th>name</th>
		<th>price</th>
		<th>stock</th>
	</tr>
	
		<tbody  align = center>
		<tr>
		<%for(SnackDto dto : list) { %>
			<td><%= dto.getNo()%></td>
			<td><%= dto.getName()%></td>
			<td><%= dto.getPrice()%></td>
			<td><%= dto.getStock()%></td>
			</tr>
			<%} %>
	
	
	
	</table>
	
	<%}
	
	else{%>
		<h3>대상 없음</h3>
	
	
	
	<% } 
	}%>
</body>
</html>