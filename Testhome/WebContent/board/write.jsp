<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>


	<div align = "center">
		<form action = "write.do" method ="post" width = "80%">
			<table class="table" style="width:70%">
				<tr>
					<td>게시판</td>
					<td>
						<select name = "head">
							<option value = "">선택</option>
							<option>공지</option>
							<option>정보</option>
							<option>일반</option>
						</select>
				</tr>
				<tr>
					<td>
						제목
					</td>
					<td>
						<textarea name ="title" rows = "1" cols = "100"></textarea>
					</td>
				</tr>
				<tr>
					<td>내용</td>
					
					<td colspan = "2">
						<textarea name = "content" rows="30" cols="100" required style="resize:vertical"></textarea>
					</td>
				
				
				</tr>
				<tr align = "right">
				
				<td colspan = "2"><input type = "submit"  value = "작성">
				
				</tr>
			
			
			
			
			</table>
		
		
		
		
		
		
		
		
		
		</form>
	
	
	
	
	
	
	
	
	</div>




 <jsp:include page = "/template/footer.jsp"></jsp:include>