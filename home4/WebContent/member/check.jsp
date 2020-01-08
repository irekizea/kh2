<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 

	공통 모듈로 사용할 비밀번호 검사 페이지
	목적지 정보(go)받아서 hidden 형태로 form 에 청부
 --%>


<%
	String go = request.getParameter("go");
%>

<jsp:include page = "/template/header.jsp"></jsp:include>


<div align = "center">
	<h2> 비번 확인</h2>
	
	<form action = "check.do" method= "post">
	<input type = "hidden" name ="go" value= "<%=go %>">
	<input type = "password" name= "pw" required>
	<input type = "submit" name = "확인">	

	
	</form>
<%if(request.getParameter("error") != null){ %>
<h4> <font color = "red"> 비번 확인</font></h4>

<%} %>

</div> 


<jsp:include page = "/template/footer.jsp"></jsp:include>

