

<%@page import="beans.KHMemberDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.KHMemberDao"%>
<%  

	KHMemberDao dao = new KHMemberDao();
	List<KHMemberDto> list = dao.getList();


%>




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">




<title>Insert title here</title>
</head>
<body>

<div >
	<table border = "1">
		<thead>
		
			<tr>
			<th>no</th>
			<th>name</th>
			<th>id</th>
			<th>point</th>
			<th>joindate</th>
			
			</tr>
		
		
		</thead>
	
	
		
		
		</tbody>
	

	
	
	</table>
	</div>

</body>
</html>