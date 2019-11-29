<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>

<%

String id = request.getParameter("uid");
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
 	
 	
 	<h4><a href = "/home/admin/change_info.jsp">회원정보 수정</a></h4>
 	<h4><a href = "/admin/exit.jsp">회원 탈퇴</a></h4>
 
 
 </div>
 
 <jsp:include page = "/template/footer.jsp"></jsp:include>
 	