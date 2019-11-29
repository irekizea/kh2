<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:include page = "/template/header.jsp"></jsp:include>
 
 <div align = "center">
 <h1>회원 가입</h1>
 
 <form action = "regist.do" method = "post">
 
 	<table>
 		<tr>
 			<th>아이디</th>
 			<td><input type = "text" name = "id" required></td>
 		</tr>
 		<tr>
 			<th>pw</th>
 			<td><input type = "password" name = "pw" required></td>
 		</tr>
 	<tr>
 			<th>이름</th>
 			<td><input type = "text" name = "name" required></td>
 		</tr>
 		<tr>
 			<th rowspan= "3">주소</th>
 			<td><input type = "text" name = "post" size ="6" placeholder = "우편번호">
 				<input type = "button" value = "우편번호 찾기">
 			</td>
 		</tr>
 		<tr>
 		
 			<td><input type = "text" name = "basic_addr" placeholder = "기본주소" size = "50"></td>
 		</tr>
 		<tr>
 	
 			<td><input type = "text" name = "extra_addr" placeholder = "상세주소" size = "50"></td>
 		</tr>
 		<tr>
 			<th>연락쳐</th>
 			<td><input type = "tel" name = "phone" required></td>
 		</tr>
 		<tr>
 		<td></td>
 		<td align = "right">
			<input type = "submit" value = "regist">
		</td> 		
 		
 		</table>
 	</form>
 	
 	
 
 
 </div>
 <br><br><br>
 
 
  <jsp:include page = "/template/footer.jsp"></jsp:include>