<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
 <%
 
 String method = request.getMethod();// 전송방식(get/post)
 String ip= request.getRemoteAddr();
 
 request.setCharacterEncoding("UTF-8");
 
 String uploader = request.getParameter("uploader");
 String test = request.getParameter("test");
 
 
 // url encoding 방식
 // 하나의 이름에 하나의 값만 저장 가능 파일은 정보가 여러개임(이름, 내용, 유형)
 
 
 
 %>
 
 <h2> method : <%=method %></h2>
 <h2> <%=ip %></h2>
 
 <h2>uploader : <%=uploader %></h2>
 <h2> test : <%=test %></h2>