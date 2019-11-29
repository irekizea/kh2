<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>test1.jsp</h1>
<%

// session 에 데이터를 저장
// -session 은 map<String, Object> 형태의 저장소
// - 설정할 때 setAttribute() 명령 사용
// -추출할때 getAttribute() 명령 사용
// -지울 떄 removeAttribute() 명령 사용

	session.setAttribute("how", 777);

%>
    <!--  세션 아이디 확인 -->
    
    <h3> id = <%=session.getId() %></h3>
    
<!--  세션에 저장된 데이터확인  -->   

    <h3>how = <%= session.getAttribute("how") %></h3> 
    
