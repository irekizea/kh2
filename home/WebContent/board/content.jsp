<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="home.beans.BoardDao"%>
<%@page import="home.beans.BoardDto"%>
    <%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
   <%
   	int no = Integer.parseInt(request.getParameter("no"));
   BoardDao dao = new BoardDao();
   
   BoardDto dto = dao.get(no);
   MemberDao mdao = new MemberDao();
   MemberDto mdto = mdao.get(dto.getWriter());
   
   String userId = (String)session.getAttribute("id");
   String grade = (String)session.getAttribute("grade");

   boolean isMine = userId.equals(dto.getWriter());
   boolean isAdmin = grade.equals("관리자");
   

   //유휴 연결 시도 갯수(max-idle)
   //총 몇개 연결 가능(max=action)
   //
   //
   
	//추가 : Set<Integer> 형태의 저장소를 이용하여 이미 읽은 글은 조회수 증가를 방지
	//[1] 세션에 있는 저장소를 꺼내고 없으면 신규 생성한다.
	Set<Integer> memory = (Set<Integer>)session.getAttribute("memory");
	//memory가 없는 경우에는 null 값을 가진다
	if(memory == null){
		memory = new HashSet<>();
	}
	//[2] 처리를 수행한다.
	boolean isFirst = memory.add(no);
	System.out.println(memory);
	
	//[3] 처리를 마치고 저장소를 다시 세션에 저장한다
	session.setAttribute("memory", memory);
   
   
   if(!isMine && isFirst){
   dto.setReadcount(dto.getReadcount()+1);
   dao.cu(no);
   }
   
  	BoardDto dto2 = dao.rget(22);
   %>
    
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align="center">

	<table border= "1" width="70%">
	
		<tr>
			<td><%=dto.getTitle() %></td>
		</tr>
		<tr>
			<td><%=dto.getWriter() %><%=mdto.getGrade() %></td>
		</tr>
		
		<tr>
			<td height = "200" valign = "top"><%=dto.getContent() %></td>
		</tr>
		
		<tr>
			<td>댓글<%=dto.getReplycount() %>
				조회수 <%=dto.getReadcount() %></td>
		</tr>
		
		<!--  댓글 목록 -->
		
		<tr>
			<td>
					<table border ="1" width = "100%">
						<tr>
							<th width ="100">
								<img src ="http://placehold.it/100X100">
							</th>
							<td>
								
								작성일
								답글
								<br><br>
								내용
							</td>
						</tr>
					</table>
					
					
			</td>
		</tr>
		
		<!--  댓글 작성칸 표시 -->
		<tr>
			<td>
			
				<form action= "<%=request.getContextPath()%>/board/reply.do?no=<%=no %>" method="post">
					<textarea name ="rcontent" rows="4" cols ="100" required></textarea>
					
					<input type = "submit" value = "등록">
				</form>
				
			
			
			</td>
		</tr>
	
		<tr>
			<td align= "right">
				<a href="write.jsp"><input type = "button" value = "글쓰기"></a>
				<a href="write.jsp?superno=<%=dto.getNo()%>"><input type = "button" value = "답글쓰기"></a>
				
				
				<%if(isMine||isAdmin){%>
				<!--  수정/삭제 버튼은 관리자 이거나 본인글에만 표시 -->
				
				<a href="edit.jsp?no=<%=dto.getNo()%>"><input type = "button" value = "수정"></a>
				<a href="delete.do?no=<%=dto.getNo()%>"><input type = "button" value = "삭제"></a>
				<%} %>
				
				
				<a href="list.jsp"><input type = "button" value = "목록"></a>
			</td>
		</tr>
	
	
	
	
	
	</table>
</div>






 <jsp:include page = "/template/footer.jsp"></jsp:include>