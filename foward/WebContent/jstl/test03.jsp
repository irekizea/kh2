<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var='money' value="${param.money }"></c:set>

<h1>money =${money }</h1>


<!-- 단순조건 -->
<c:if test="${money >=10000000}">
<h1>돈 내놔</h1>
</c:if>

<c:if test="${money<100000}">
<h1>getout</h1>
</c:if>

<!-- 복합 조건 -->

<c:choose> 
	<c:when test="${money==1250 }">성인</c:when>
	<c:when test="${money==720 }">청소년</c:when>
	<c:when test="${ money==720}">어린이</c:when>
	<c:otherwise>get</c:otherwise>
</c:choose>