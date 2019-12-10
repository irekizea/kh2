<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String context= request.getContextPath();

%>


			<a href = "<%=context%>/index.jsp" >홈으로</a>
			<a href = "#">로그인</a>
			<a href = "<%=context%>/member/regist.jsp">회원가입</a>
			<a href = "#">회원정보</a>
			<a href = "#">회원탈퇴</a>
			<a href = "#">로그아웃</a>
			<a href = "#">회원찾기</a>
			<a href = "<%=context%>/board/list.jsp">게시판</a>
	