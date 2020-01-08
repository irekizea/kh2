<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
  <%
  	String pw = (String)session.getAttribute("pw");
  	session.removeAttribute("pw");
  
  %>
<jsp:include page = "/template/header.jsp"></jsp:include>


<div align = "center">


	<h2>임시 비번 발급 완료</h2>
	<h3>비밀번호 = <%=pw%></h3>
	


</div>



 <jsp:include page = "/template/footer.jsp"></jsp:include>