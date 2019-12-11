<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>

<%

String id = request.getParameter("id");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.get(id);
	
%>

<jsp:include page = "/template/header.jsp"></jsp:include>
    
 <div align = "center">
 
 
 	<h2><%=id %> 정보</h2>
 	<table border = "1" width ="450" style="border-collapse:collapse;">
 		<tr>
 			<th width = "25%"> 아이디 </th>
 			<td> <%=dto.getId()%> </td>
 		</tr>
 		
 		<tr>
 			<td> 이름</td>
  			<td> <%=dto.getPw() %> </td>
 		</tr>
 		 		<tr>
 			<td> 등급 </td>
  			<td> <%=dto.getGrade() %> </td>
 		</tr>
 		
 		 		<tr>
 			<td> 전화번호 </td>
  			<td> <%=dto.getPhone() %></td>
 		</tr>
 		
 		 		<tr>
 			<td> 주소 </td>
  			<td>
  			<%=dto.getAddress() %>
  		
  			
  			 </td>
 		</tr>
 		
 		 		<tr>
 			<td> 가입일 </td>
  			<td> <%=dto.getJoindateWithFromat() %></td>
 		</tr>
 		
 		 		<tr>
 			<td> 최종로그인</td>
  			<td> <%=dto.getLast_loginWithFormat() %> </td>
 		</tr>
 		<tr>
 			<th>포인트</th>
 			<td> <%=dto.getPoint() %></td>
 		</tr>
 		


 	</table>
 	
 	
 	<form action="change_info.jsp">
 	</form>
 	<h4><a href = "spare.do?id=<%=dto.getId()%>">비번 변경</a></h4>
 	<h4><a href = "input.jsp?id=<%=dto.getId()%>">회원정보 수정</a></h4>
 	<h4><a href = "out.do?id=<%=dto.getId()%>">회원 탈퇴</a></h4>

 
 </div>
 
 

 
 
 <jsp:include page = "/template/footer.jsp"></jsp:include>
 	