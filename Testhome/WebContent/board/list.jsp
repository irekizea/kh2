<%@page import="java.util.List"%>
<%@page import="test.beans.BoardDto"%>
<%@page import="test.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 
 BoardDao bdao = new BoardDao();
 BoardDto bdto = new BoardDto();
 
 
 List<BoardDto> list = bdao.list();
 
 
 
 
 %>
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align="center">

	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
		<% for(BoardDto dto: list ){ %>
		
		<tr>
			<td><%=dto.getNo()%></td>
			<td><%=dto.getTitle() %></td>
			<td><%=dto.getWriter() %></td>
			<td><%=dto.getWdate() %></td>
			<td><%=dto.getReadcount() %></td>
		
		</tr>
		<%} %>
		<tr align ="right">
			<td><a href="write.jsp">글쓰기</a></td>
		
		</tr>
	
		<tr align = "center">
			<td colspan ="6"> 뒤로 1 2 3 4 5 6 7 8 9 10 앞으로 </td>
		</tr>
		<tr>
			
		</tr>
	
	</table>













</div>
			
			
			
			
			
			





<jsp:include page = "/template/footer.jsp"></jsp:include>