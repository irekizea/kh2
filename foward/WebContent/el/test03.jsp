<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	EL의 scope
	-page : pageScope
	-request : requestScope
	-session : sessionScope
	-application : applicationScope
 -->
 
 <%
 	int a = 10;
 
 pageContext.setAttribute("b", 20);
 request.setAttribute("c", 30);
 session.setAttribute("d", 40);
 application.setAttribute("e", 50);

 %>
 
 <h3> a = <%=a%>, ${a}</h3>
 <h3><%=pageContext.getAttribute("b") %>, ${b }, ${pageScope.b}</h3>
 <h3><%=request.getAttribute("c") %>. ${c}, ${requestScope.c}</h3>
 <h3><%=session.getAttribute("d") %>, ${d}, ${sessionScope.d}</h3>
 <h3>asd<%=application.getAttribute("e") %>, ${e}, ${applicationScope.e}</h3>