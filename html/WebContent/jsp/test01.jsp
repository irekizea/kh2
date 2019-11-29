<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <h2 align="center">구구단</h2>
	 <table align="center" border="1"> 
	 <tr> 
	 <td></td> 
	 <% for (int i = 2; i < 10; i++) { %>
	  <td align="center" width="80">
	  <%=i%></td>
	   
	   <% } %>
	    <% for (int i = 1; i < 10; i++) { %> 
	    <tr> <td width="50"><%=i%></td>
	     <% for (int j = 2; j < 10; j++) { %>
	     <td align="center">
	     <%=j%> X <%=i%>= <%=j * i%></td>
	     		<% } %> </tr> 
	     	<% } %> 
	     	</tr>
	      </table>


</body>
</html>