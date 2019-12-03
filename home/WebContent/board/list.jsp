<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.BoardDao"%>
<%@page import="home.beans.BoardDto"%>

<%

	BoardDao dao = new BoardDao();
 	List<BoardDto> list= dao.list();
	
 	
 	
%>

<div align="center">

<table border = "1">
	<tr>
		<th>글번호</th>
		<th>말머리</th>
		<th width = "50%">제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<% for(BoardDto dto : list){%>
	<tr>
		<td><%=dto.getNo() %></td>
		<td><%=dto.getHead() %></td>
		<td><%=dto.getName() %></td>
		<td>작성자</td>
		<td><%=dto.getWdate() %></td>
		<td><%=dto.getRnum() %></td>
	</tr>
	<%} %>
	



</table>
</div>
 <jsp:include page = "/template/footer.jsp"></jsp:include>