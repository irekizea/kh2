<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		 <!--  홈페이지 메뉴를 구현
		 	-주의 : 경로는 절대경로를 사용해야 한다(불려가서 실행되므로)
		 	-명령 : request.getContextPath() 이용시 자동으로 주서 첫부분 구해옴
		  -->
<%
	String context = request.getContextPath();
	String id = (String)session.getAttribute("id");
	
	String grade=(String)session.getAttribute("grade");
	boolean admin = grade!=null&& grade.equals("관리자");
%>
		  
		  
		 <a href = "<%=context %>/index.jsp"> 홈으로</a>
		 
		
		
		 <%if(id==null){ %>
		 <a href = "<%=context %>/member/login.jsp"> 로그인</a> 
		  <a href = "<%=context%>/member/regist.jsp"> 회원가입</a>
	
		 <%}else{ %>
		  <a href = "<%=context%>/member/info.jsp"> 회원정보</a>
		 <a href = "<%=context %>/member/logout.do"> 로그아웃</a>
		 <a href="<%=context %>/member/exit.do">회원 탈퇴</a>
		 <%} %>
		 
		 <%if(admin) { %>
		 	 <a href = "<%=context%>/admin/list.jsp"> 회원찾기</a> 
		 <%} %>
		 <a href = "#"> 게시판               </a> 