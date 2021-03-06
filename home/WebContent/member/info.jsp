<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>

<%
	// 회원 정보를 불러오는 코드
	//1. session에서 id에 들어있는 데이터 꺼낸다
	//2. id를 주고 dao를 이용하여 회원정보 (MemberDto)를 꺼낸다
	//3. 원하는 위치에 출력한다.
	
	String id = (String)session.getAttribute("id");
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
  			<td><%=dto.getLast_login() %> </td>
 		</tr>
 		
 		
 		
 	
 
 	
 	</table>
 	<h4><a href = "check.jsp?go=/member/change_pw.jsp">비밀번호 변경</a></h4>
 	<h4><a href = "check.jsp?go=/member/change_info.jsp">회원정보 수정</a></h4>
 	<h4><a href = "check.jsp?go=/member/exit.jsp">회원 탈퇴</a></h4>
 
 
 
 </div>   
    
    
    
 <jsp:include page = "/template/footer.jsp"></jsp:include>