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
					<th>비밀번호</th>
					<td><input type = "password" name = "pw" required></td>
				
				</tr>
				<tr>
					<th>이름</th>
					<td><input type = "text" name = "name" required></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type = "text" name = "phone" required></td>
				</tr>
				<tr>
					<td colspan ="2" align = "right"><input type ="submit" value = "regist"> </td>
				
				</tr>
			</table>
		</form>
	</div>
			
			
			
			
			
			
			
			
			
			










<jsp:include page = "/template/footer.jsp"></jsp:include>