<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		type = ${param.type }
		keyword = ${param.keyword }
	
	
	</h3>
	

	
	<c:choose>
		<c:when test="${empty list }">
		<h3>검색어 입력</h3>
		</c:when>
				<c:otherwise>
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
					  
					  
					  <c:forEach var="dto" items="${list }">
					  
						<tr align = "center">

							<td>${dto.id }</td>
							<td>${dto.name}</td>
							<td>${dto.grade }</td>
							<td>${dto.phone}</td>
							<td>${dto.getJoindate }></td>
							<td>${dto.point }</td>
							<td> 
								<a href = "detail.jsp?id=${dto.getid }"> 상세정보</a>
								<a href = "out.do?id=${dto.getid }"> 회원탈퇴</a>
								<a href = "input.jsp?id=${dto.getid }">정보변경 </a>
							</td>
				</tr></c:forEach>
		
				</c:otherwise>
			</table>	

	</c:choose>

</div>


<jsp:include page = "/template/footer.jsp"></jsp:include>