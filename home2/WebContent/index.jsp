<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% int a = 12; %>
<%--
	정적 include
	- 코드를 복사 붙여넣기 하는 방식으로 합치는 것
	- 변수가 공유되므로 이름 충돌이 발생

 --%>

<%--<%@ include file = "/template/header.jsp" --%>

<%-- 
	동적 include
	- 서비스 하기 직전에 결과만 임시로 합치는 것
	- 변수가 공유되지 않으므로 충돌이 발생하지 않는다 ㅣ

 --%>
 
 <jsp:include page = "/template/header.jsp"></jsp:include>



<h3>안녕안녕안녕안녕</h3>


<img src = "/home/image/buk.jpg">

	
<%--<%@ include file = "/template/footer.jsp"--%>

 <jsp:include page = "/template/footer.jsp"></jsp:include>