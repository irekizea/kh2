<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>test2.jstp</h1>
    <!-- 세션에 저장된 데이터 확인 -->
    
    <h3>how = <%= session.getAttribute("how") %></h3>