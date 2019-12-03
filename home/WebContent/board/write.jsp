<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align = "center">
	<form action = "/home/board/write.do">

	<table border = "1">
		<tr>
			<td>게시판</td>
			<td><select name = "head">
				<option>공지</option>
				<option>정보</option>
				<option>일반</option>
			</select></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><textarea name = "name" rows = "1" cols = "100"></textarea></td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
			<textarea name = "content" rows="30" cols="100"></textarea>
			</td>
		
		</tr>
		<tr align = "right">
			<td></td>
			<td><input type = "submit" name = "작성"></td>
		</tr>
	
	
	</table>

</form>


</div>




 <jsp:include page = "/template/footer.jsp"></jsp:include>