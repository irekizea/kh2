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
   
 //  Set<Integer> memory = (Set<Integer>)session.getAttribute("memory");
   
   
  // if(memory == null){
//	   Set<Integer> memory = new HashSet<>();
//	   }
   
 //  boolean isFirst=memory.add(no);
  // System.out.println(memory);
   
   
  // session.setAttribute("memory", memory);
   
   
   if(!isMine && isFirst){
   dto.setReadcount(dto.getReadcount()+1);
   dao.cu(no);
   }
   
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
	
		<tr>
			<td align= "right">
				<a href="write.jsp"><input type = "button" value = "글쓰기"></a>
				<a href="#"><input type = "button" value = "답글쓰기"></a>
				
				
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