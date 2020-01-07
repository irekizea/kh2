<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!-- 
	Jstl은 javascript 처럼 자료형 크게 구분 x
	JSTL에서 데이터 만들면 page Context에 저장

 -->

<c:set var="a" value="10"></c:set>

<h1>a=<%=pageContext.getAttribute("a") %></h1>
<h1>a=${a}</h1>

<c:set var='a' value='${a+5}'></c:set>

<h1>a=${a}</h1>

<c:remove var ='a'></c:remove>

<h1>a=${a}</h1>