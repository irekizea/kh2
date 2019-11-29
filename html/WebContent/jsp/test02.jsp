<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border = "1">
		<thead>
			<tr>
			<td> </td>
				<%for(int i =2; i<10; i++) {%>
				<th width = "30">
				<%=i %></th>
				<%} %>
				
		</thead>	
		<tbody>
			<% for (int k = 1; k<10; k++){ %>
				<tr> <td> <%=k%></td>
				<% for(int j = 2; j<10 ;j++){ %>
				<td><%=j %>X<%=k %>=<%=k *j %></td>
				 
				<%} %></tr>
		<% }%>
		</tbody>
		
	</table>


</body>
</html>