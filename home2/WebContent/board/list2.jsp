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

	
 	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	List<BoardDto> list;
	boolean isSearch = type!= null&& keyword!=null;
	
	
	if(isSearch)
	list = dao.list(type, keyword);
	else
 	list= dao.list();
 	
%>

<div align="center">

<table border = "1">
	<thead>
		<tr>
			<th>rn</th>
			<th>글번호</th>
			<th align = "left" width = "50%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<% for(BoardDto dto : list){%>
	<tr>
		<td><%=dto.getRn() %></td>
		<td><%=dto.getNo() %></td>
		<td align = "left">
		<!-- 말머리 출력 -->
		
		<%if(dto.getHead()!=null) {%>
		[<%=dto.getHead() %>]
		<%} %>
		
		<a href="/home/board/content.jsp?no=<%=dto.getNo()%>">
			<%=dto.getTitle() %>
		</a>
			<%if(dto.getReplycount() > 0) {%>
		<font color ="red">
			<%=dto.getReplycount() %>
		</font>
				<%} %>
		</td>
		<td><%=dto.getWriter() %></td>
		<td><%=dto.getWdate() %></td>
		<td><%=dto.getReadcount() %></td>
	</tr>
	<%} %>
	
	<tfoot>
		<tr>
		<td colspan = "6" align ="right"> <a href="write.jsp">글쓰기</a></td>
		</tr>
	
	</tfoot>

</table>

 	<h5>[이전] 1 2 3 4 5 6 7 8 9 10 [다음]</h5>
	<form action="list.jsp" method = "get">
		<select name = "type">
		
			<option value = "title"> 제목</option>
			<option value = "writer">작성자</option>
		</select>
		<input type = "search" name = "keyword" placeholder = "검색어" required>
		
		<input type = "submit" value = "검색"	>
			
	
	
	</form>



</div>
 <jsp:include page = "/template/footer.jsp"></jsp:include>