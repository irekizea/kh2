<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  테이블 사용시 table 부터 th/td까지는 아무것도 넣으면 안됨  ex)form -->
	<form action = "login.do" method = "post">
	
	<table>
		<tr>
		<th>아이디</th>
		<th><input type = "text" name = "id" required></th>		
		</tr>
		<tr>
		<th>비밀번호 </th>
		<th><input type = "text" name = "pw" required></th>		
		
		</tr>
	
	</table>
	<input type = "submit">
	</form>


</body>
</html>