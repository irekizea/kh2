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
		  
		  
			
        <nav>
            <div class="menu">
                <label for="hamburg">&equiv;</label>
                <input type="checkbox" id="hamburg">
                <a href="<%=context %>/index.jsp" class="menu-item left-menu">홈으로</a>
                <a href="<%=context %>/board/list.jsp" class="menu-item left-menu">게시판</a>
                <%if(admin) {%>
                <a href="<%=context %>/member/find.jsp" class="menu-item left-menu">회원찾기</a>
                <%} %>
                
                <%if(id!=null){ %>
                <a href="<%=context %>/member/logout.do" class="menu-item right-menu">로그아웃</a>
                <a href="<%=context %>/member/info.jsp" class="menu-item right-menu">회원정보</a>
                  <a href="<%=context %>/member/exit.do" class="menu-item right-menu">회원탈퇴</a>
                <%}else{ %>
                  <a href="<%=context %>/member/login.jsp" class="menu-item right-menu">로그인</a>
                <a href="<%=context %>/member/regist.jsp" class="menu-item right-menu">회원가입</a>
                
                <%} %>
            </div>
        </nav>