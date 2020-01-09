<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style> </style>
<div align="center">
	<h2>글 이쁘게써</h2>
	
	<form action="write.do" method="post" >
	
		<table border="1" width="70%">
			<tr>
				<th>말머리</th>
				<td>
					<select name="head">
						<option value="">선택하세요</option>
						<option>공지</option>
						<option>정보</option>
						<option>유머</option>
					</select>		
				</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>
					<textarea name = "title" rows = "1" cols = "95"></textarea>
				</td>
			</tr>

			<tr>
				<td colspan="2">
					<textarea rows="30" cols="100" name="content" required></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록하기">
					<a href="list.jsp">
						<input type="button" value="목록보기">
					</a>
				</td>
			</tr>
		</table>
		
	</form>
</div>



 <jsp:include page = "/template/footer.jsp"></jsp:include>