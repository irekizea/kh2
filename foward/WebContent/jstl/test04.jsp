<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  
	c:forEach(일반 반복문)
	c:forTokens ( 자바 String의 split 반복, 구분 by 구분자)

 -->
 
 <c:forEach var ="i" begin="1" end="10" step="1">
 	<h3>hello ${i}</h3>
 </c:forEach>
 
 <c:set var = "list" value="10,20,30,40,asdfasdf"></c:set>
 
 <c:forEach var="k" items="${list}" varStatus="loop">
 	<h3>${loop.count} 번째 값${k}, ${loop.first}, ${loop.last}</h3>
 </c:forEach>
 
 <c:set var = "color" value="red/green/yello/blue/brown/purple"></c:set>
 
 <c:forTokens var = "c" items="${color}" delims="/">
  <h3>c=${c}</h3>
 </c:forTokens>