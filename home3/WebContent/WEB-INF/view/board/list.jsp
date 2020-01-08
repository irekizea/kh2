<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:set var = "context" value="${pageContext.request.contextPath}"></c:set>
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
	<c:forEach var = "dto" items="${list}">

	<tr>
		<td>${dto.no}</td>
		<td align = "left">
			<!-- 말머리 출력 -->
			<c:forEach var="i" begin="1" end="${dto.depth}">
				 &nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
			<c:if test="${dto.depth>0}">			
				<img src="${context }/image/fds.png" width='20'>
			</c:if>
	
			<c:if test = "${not empty dto.head }">
				${dto.head}
			</c:if>
		
			
			<a href="${context }/board/content.do?no=${dto.no}">
				${dto.title }
			</a>

				
		
				
		
		</td>
		<td>${dto.writer}</td>
		<td>${dto.wdate}</td>
		<td>${dto.readcount}</td>
	</tr>
	
	</c:forEach>
	
	
	</tbody>
	
		</table>
	
	</div>
	
	<div class="row-right"> 
	<a href="write.jsp"><input class="btn" type ="button" value="글쓰기"></a>
	
	
	
	</div>
	
	<div class="row">
	
	<jsp:include page="/template/navigator.jsp">
		<jsp:param name="pno" value="${pno}"/>
		<jsp:param name="count" value="${count }"/>
		<jsp:param name="navsize" value="${navsize }"/>
		<jsp:param name="pageSize" value="${pageSize}"/>
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