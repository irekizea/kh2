<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!--  param == el에서 파라미터를 접근 위한 내장객체
    	param.test==request.getParameter("test") 
    	el == dont concerned on null
    	
     -->
     <form action = "test02.jsp">
     	<input type = "text" name = "test" value=${param.test}>
     	<input type = "submit">
     
     </form>
     
     

    <h1>test=<%=request.getParameter("test") %></h1>
    <h1>test = ${param.test}</h1>