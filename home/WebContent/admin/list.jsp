<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>

<%

	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	boolean isSearch = type!= null && keyword != null;
	
	MemberDao dao = new MemberDao();
	
	List<MemberDto> list;
	
	if(isSearch){
		list = dao.search(type, keyword);
	}
	else{
		list = null;
	}
		
	
	
%>

<div align = "center">

	<form action="list.jsp" method = "get">
	
<!--   	<input type = "text" name = "type">-->	
	 	<select name = "type">
	 		<option value="id">아이디</option>
	 		<option value = "name">이름</option>
	 		<option value = "grade">등급</option>
	 		<option value = "phone">전번</option>
	 	</select>
	 	
	 	<input type = "text" name = "keyword">
	 	
	 	<input type = "submit" value = "검색">
	 
	 
	 </form>
	
	
	<h3>
		type = <%=request.getParameter("type")%>
		keyword = <%=request.getParameter("keyword")%>
	
	
	</h3>
	

	
	<%if(list==null){ %>
		<h3>검색어 입력</h3>
	<%}  else { %>
		<table border = "1" width = "80%">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>grade</th>
				<th>phone</th>
				<th>Joindate</th>
				<th>point</th>
				<th>관리메뉴</th>
			</tr>
			<% for(MemberDto dto : list){ %>
			<tr align = "center">

				<td><%= dto.getId()%></td>
				<td><%= dto.getName()%></td>
				<td><%= dto.getGrade()%></td>
				<td><%= dto.getPhone()%></td>
				<td><%= dto.getJoindate()%></td>
				<td><%= dto.getPoint()%></td>
				<td> 
				<a href = "detail.jsp?id=<%=dto.getId()%>"> 상세정보</a>
				<a href = "out.do?id=<%=dto.getId()%>"> 회원탈퇴</a>
				<a href = "input.jsp?id=<%=dto.getId()%>">정보변경 </a>
				</td>
				</tr>
					<%} %>
			</table>	

	<%} %>	

</div>


<jsp:include page = "/template/footer.jsp"></jsp:include>