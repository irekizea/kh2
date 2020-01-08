<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	아이디 찾기 결과 페이지
	-id라는 이름의 파라미터를 받아서 결과를 화면에 표시
	-파라미터 없다면 못찾은 상태로 간주 결과 표시
--%>

<%
	String id = request.getParameter("id");
%>






<jsp:include page="/template/header.jsp"></jsp:include>

<% if(id!=null) {%>
<!--  검색 성공시 -->
<h2> 아이뒤 <%=id %> 임</h2>
<h3><a href="login.jsp"> 로긴하러가기</a></h3>

<%}else{ %>
<h2> 입력한 정보 해당 회원 없음</h2>
<h3><a href="find.jsp">다시 입력</a></h3>
<%} %>
























<jsp:include page="/template/footer.jsp"></jsp:include>