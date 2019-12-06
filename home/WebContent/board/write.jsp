<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align = "center">

	<h2 ><font color= "red">글 이쁘게 써</font></h2>

	<form action = "/home/board/write.do" method = "post">
	<%if(request.getParameter("superno")!=null){ %>
	<input type="hidden" name = "superno" value ="<%=request.getParameter("superno") %>">
	<%} %>
	<table border = "1" width = "80%">
		<tr>
			<td colspan = "2">게시판</td>
			<td><select name = "head">
				<option value = "">선택</option>
				<option>공지</option>
				<option>정보</option>
				<option>일반</option>
			</select></td>
		</tr>
		<tr>
			<td colspan = "2">제목</td>
			<td><textarea name = "title" rows = "1" cols = "95"></textarea></td>
		</tr>
		<tr>
			<td colspan = "3">
			<textarea name = "content" rows="30" cols="100" required style ="resize:vertical"></textarea>
			</td>
		
		</tr>
		<tr align = "right">
			
			<td colspan ="3"><a href = "#" >상세정보</a><input type = "submit" name = "작성"></td>
		</tr>
	
	
	</table>

</form>


</div>




 <jsp:include page = "/template/footer.jsp"></jsp:include>