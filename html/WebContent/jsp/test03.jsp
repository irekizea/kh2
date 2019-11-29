<%@page import="beans.SnackDao"%>
<%@page import="java.util.List"%>
<%@page import="beans.SnackDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


   <% 
   
	SnackDao dao = new SnackDao();
   List<SnackDto> list = dao.getList("허니");
   
   %>
    
    
   <!--  보여주기 위한 html 코드 --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
</head>

<body>
<table border = "1">
	
	<tr>
		<th>번호</th>
		<th>상품명</th>
		<th>판매가</th>
		<th>재고</th>
	</tr>

	<%for(SnackDto dto : list){ %>
	<tr>
		<td><%= dto.getNo() %></td>
		<td><%= dto.getName() %></td>
		<td><%= dto.getPrice() %></td>
		<td><%= dto.getStock() %></td>
	</tr>
	<%} %>
</table>



</body>
</html>