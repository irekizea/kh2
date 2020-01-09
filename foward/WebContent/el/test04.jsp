<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	MemberDao dao = new MemberDao();
	MemberDto dto = dao.get("b");
	
	request.setAttribute("dto", dto);
%>

<h1>아이디:${requestScope.dto.getId() }</h1>
<h1>아이디:${dto.getId() }</h1>
<h1>아이디:${dto.id}</h1>
<h1>포인트 :${dto.point}</h1>
<h1>가입일:${dto.joindate }</h1>