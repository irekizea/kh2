<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>

<br><br>

<div align = "center">
	<form action = "find.do">
		<table>
			<tr>
				<td>이름</td>
				<td><input type = "text" name = "name" required></td>
			</tr>	
			<tr>
				<td>전화 번호</td>
				<td><input type = "text" name = "phone"></td>
			</tr>
			<tr>
			<td></td>
			<td align = "right"><input type = "submit" value="find"></td>
			</tr>
		
		</table>	
	
	</form>
</div>




<jsp:include page = "/template/footer.jsp"></jsp:include>