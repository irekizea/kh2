<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:include page = "/template/header.jsp"></jsp:include>
 
 
 <div align="center">
 	<form action="exit.do" method="post">
 	
 	<table>
 		<tr>
 			<th>탈퇴하려면 아이디 입력</th>
 			<td><input type="text" name="id" placeholder="id" required></td>
 			
 		
 		</tr>
 		<tr>
 		<td></td>
 		<td><input type = "submit" value = "exit"></td>
 		</tr>
 	
 	
 	</table>
 </form>
 
 </div>

  <jsp:include page = "/template/footer.jsp"></jsp:include>