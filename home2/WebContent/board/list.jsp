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
	
	int pno;
	

	
	try{
		pno=Integer.parseInt(request.getParameter("pno"));
		if(pno<=0) throw new Exception();
		
	}
	catch(Exception e){
		pno=1;
	}
	
	int pageSize= 10;
	
	int finish = pno * pageSize;
	int start = finish -pageSize+1;



	BoardDao dao = new BoardDao();

	
 	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	List<BoardDto> list;
	boolean isSearch = type!= null&& keyword!=null;
	
	
	if(isSearch)
	list = dao.list(start, finish, type, keyword);
	else
 	list= dao.list(start, finish);
 	
	/**
	
	하단 네비게이터 계산하기
	-시작블록=(현제페이지-1)/네비게이터크기*네비게이터크기+1
	
	
	**/
	
	
	int navsize = 10;
	
	int count = dao.getCount(type, keyword);
	
	int startBlock = (pno-1)/navsize * navsize +1;
	int finishblock = startBlock +(navsize-1);
	int pagecount = (count+pageSize)/pageSize;
	

	
	// 만약 마지막 블록이 페이지 수보다 크다면 수정 처리
	if(finishblock>pagecount){
		finishblock = pagecount;
	}
	
%>


<article class = "w-100">
	<div class="row">
	
	<h2>자유 게시판</h2>
	<small><h5>글 이쁘게써</h5></small>
	
	</div>
	<div class="row">
		<table class="table">
			<thead>
			<tr>
				<th>글번호</th>
				<th width = "50%">제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			</thead>
			
	<tbody>
	<% for(BoardDto dto : list){%>
	<tr>
		<td><%=dto.getNo() %></td>
		<td align = "left">
			<!-- 말머리 출력 -->
			<% for(int i = 0; i<dto.getDepth(); i++){%>
				 &nbsp;&nbsp;&nbsp;&nbsp;
			<%} %>
			<%if(dto.getDepth()>0){ %>
				<img src="<%=request.getContextPath() %>/image/fds.png" width='20'>
			<%} %>
			
			<%if(dto.getHead()!=null) {%>
				[<%=dto.getHead() %>]
			<%} %>
			
			<a href="<%=request.getContextPath() %>/board/content.jsp?no=<%=dto.getNo()%>">
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
	</tbody>
	
		</table>
	
	</div>
	
	<div class="row-right"> 
	<a href="write.jsp"><input class="btn" type ="button" value="글쓰기"></a>
	
	
	
	</div>
	
	<div class="row">
	
	<jsp:include page="/template/navigator.jsp">
		<jsp:param name="pno" value="<%=pno%>"/>
		<jsp:param name="count" value="<%=count%>"/>
		<jsp:param name="navsize" value="<%=navsize%>"/>
		<jsp:param name="pageSize" value="<%=pageSize%>"/>
	</jsp:include>
	
	</div>
	<div class="row input-item">
	
	<form action="list.jsp" method = "get">
		<select name = "type">
		
			<option value = "title"> 제목</option>
			<option value = "writer">작성자</option>
		</select>
		<input type = "search" name = "keyword" placeholder = "검색어" required>
		
		<input type = "submit" value = "검색"	>
			
	
	
	</form>
	</div>


</article>



 <jsp:include page = "/template/footer.jsp"></jsp:include>