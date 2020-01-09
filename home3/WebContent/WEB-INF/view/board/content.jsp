<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs"%>
    
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align="center">

	<table border= "1" width="70%">
	
		<tr>
			<td>${dto.title}</td>
		</tr>
		<tr>
			<td>${dto.writer} ${mdto.grade}</td>
		</tr>
		
		<tr>
			<td height = "200" valign = "top">${dto.content}</td>
		</tr>
		
		<tr>
			<td>댓글${dto.replycount}
				조회수 ${dto.readcount}</td>
		</tr>
		
		<c:if test = "${not empty dto.head }">
				${dto.head}
			</c:if>
		
		
		
		<!--  댓글 목록 -->
		
		<c:if test="${ilist.size()>0 }">
		
		
		<tr>
			<td>
				<ul>
				<c:forEach var="fdto" items="${flist }">
					<li>
					<!-- 미리보기 출력 -->
					<img src = "download.do?no=${fdto.no}"width = "80" height="50">
						 ${fdto.uploadname }
						 ${fdto.filesize }
						 
						 <a href = "download.do?no=${fdto.no}"	> <img src = "../image/asdf.jpg" width ="25" height = "25">	</a>	
								
					</li>
				</c:forEach>
				</ul>
			
			
			
			
			</td>
		
		
		
		</tr>
		
		
		
		</c:if>
		
		
		
		<tr>
			<td>
					<table border ="1" width = "100%">
					<c:forEach var="rdto" items="${list }">
						<tr>
							<th width ="100">
								<img src ="http://placehold.it/100X100">
							</th>
							<td>
							
								${rdto.writer}
								<c:if test="${dto.writer==rdto.writer }">	
					
								<font color="red">(작성자)</font>

								</c:if>
									
								${rdto.wdate}
								
								<c:if test="${userId==rdto.writer }">
			
								<a href = "#">수정</a>
								<a href="reply_delete.do?no=${rdto.no}&origin=${dto.no}">삭제</a>
				
								</c:if>
								답글
								<br><br>
								${rdto.content}
							</td>
						</tr>
						
						</c:forEach>
					</table>
					
					
			</td>
		</tr>
		
		<!--  댓글 작성칸 표시 -->
		<tr>
			<td>
			
				<form action= "reply_insert.do" method="post">
					<input type = "hidden" name = "origin" value ="${dto.no}">
					<textarea name ="content" rows="4" cols ="100" required></textarea>
					
					<input type = "submit" value = "등록">
				</form>
				
			
			
			</td>
		</tr>
	
		<tr>
			<td align= "right">
				<a href="write.jsp"><input type = "button" value = "글쓰기"></a>
				<a href="write.jsp?superno=${dto.no}"><input type = "button" value = "답글쓰기"></a>
				
				
				<c:if test="${isMine or isAdmin}">
	
				<!--  수정/삭제 버튼은 관리자 이거나 본인글에만 표시 -->
				
				<a href="edit.jsp?no=${dto.no}"><input type = "button" value = "수정"></a>
				<a href="delete.do?no=${dto.no}"><input type = "button" value = "삭제"></a>

				</c:if>
				
				<a href="list.jsp"><input type = "button" value = "목록"></a>
			</td>
		</tr>
	
	
	
	
	
	</table>
</div>






 <jsp:include page = "/template/footer.jsp"></jsp:include>