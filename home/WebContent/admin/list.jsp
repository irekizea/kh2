<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>
<div align = "center">

	<form action=findAdmin.do>
	
		<table>
			<tr>
				<th>아이디</th>
				<td><input type = "text" name = "id" required></td>
			</tr>
			
			<tr>
			<td></td>
			<td align = "right"> <input type = "submit" value = "찾기"></td>
			</tr>
		
		</table>
	
	
	
	
	
	</form>


</div>




<jsp:include page = "/template/footer.jsp"></jsp:include>