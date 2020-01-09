<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
    <c:set var = "type" value="${param.type }"></c:set>
    <c:set var = "keyword" value="${param.keyword }"></c:set>
    <c:set var = "isSearch" value="${not empty type and not empty keyword }"></c:set>
    <c:set var = "pno" value="${param.pno }"></c:set>
    <c:set var = "count" value="${param.count }"></c:set>
    <c:set var = "navsize" value="${param.navsize }"></c:set>
      
     <c:set var = "startBlock" value="${param.startBlock }"></c:set>
     <c:set var = "pagesize" value="${pagesize }"></c:set>
     <c:set var = "finishblock" value="${finishblock }"></c:set>
     <c:set var = "pageblock" value="${pageblock }"></c:set>
  
             
    <!--  네비게이터 -->
    
<!-- 
	반드시 받아야 하는 데이터 : tlype, keyword, pno, count, navisize
 -->

 
 
 


  <ul class="pagination">
  
  
 
 	</ul>
 	 	 	
 

 	 	

  	
  	
 	