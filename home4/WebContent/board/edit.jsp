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
 
 
 
 %>
    
    
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align = "center">

	<h2 ><font color= "red">글 이쁘게 써</font></h2>

	<form action = "/home/board/edit.do" method = "post">
	<input type = "hidden" name ="no" value = <%=dto.getNo() %>>
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
			<td><textarea name = "title" rows = "1" cols = "95"><%=dto.getTitle() %></textarea></td>
		</tr>
		<tr>
			<td colspan = "3">
			<textarea name = "content" rows="30" cols="100" required style ="resize:vertical"><%=dto.getContent() %></textarea>
			</td>
		
		</tr>
		<tr align = "right">
			
			<td colspan ="3"><a href = "#" >상세정보</a><input type = "submit" value ="수정하기"></td>
		</tr>
	
	
	</table>

</form>


</div>




 <jsp:include page = "/template/footer.jsp"></jsp:include>