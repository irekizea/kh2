<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
    
 <%
 	String id = (String)session.getAttribute("id");
 	MemberDao dao = new MemberDao();
 	MemberDto dto = dao.get(id);
 
 %>
<jsp:include page = "/template/header.jsp"></jsp:include>

<div align = "center">

	<form action = "change_info.do">
		<table>
			<tr>
				<th>전화번호 입력</th>
				<td>
				<input type ="text" name = "phone" value="<%=dto.getPhoneStr() %>">
				</td>
			</tr>
			<tr>
				<th rowspan="3">주소 입력</th>
				<td>
				<input type = "text" name = "post" value="<%=dto.getPostStr()%>">
				</td>
			</tr>
			
			<tr>
			
				<td>
				<input type = "text" name = "basic_addr" value="<%=dto.getBasic_addrStr() %>">
				</td>
				
			</tr>
			<tr>
				
				<td>
				<input type = "text" name = "extra_addr" value = "<%=dto.getExtra_addrStr()%>">
				</td>
			</tr>
				
			<tr>
				<td></td>
				<td align = "right"><input type="submit" name = "변경"></td>
			</tr>

		
		</table>

	</form>

</div>


<jsp:include page = "/template/footer.jsp"></jsp:include>