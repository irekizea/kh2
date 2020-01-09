<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>






<jsp:include page = "/template/header.jsp"></jsp:include>
    
 <div align = "center">
 
 
 	<h2>${dto.id} 정보</h2>
 	<table border = "1" width ="450" style="border-collapse:collapse;">
 		<tr>
 			<th width = "25%"> 아이디 </th>
 			<td> ${dto.id } </td>
 		</tr>
 		
 		<tr>
 			<td> 이름</td>
  			<td> ${dto.pw} </td>
 		</tr>
 		 		<tr>
 			<td> 등급 </td>
  			<td> ${dto.grade} </td>
 		</tr>
 		
 		 		<tr>
 			<td> 전화번호 </td>
  			<td> ${dto.phone}</td>
 		</tr>
 		
 		 		<tr>
 			<td> 주소 </td>
  			<td>
  			${dto.address}
  		
  			
  			 </td>
 		</tr>
 		
 		 		<tr>
 			<td> 가입일 </td>
  			<td> ${dto.joindateWithFromat}</td>

 		
 		<!-- <dto.getJoindateWithFromat()  -->
 		
 	
 
 	
 	</table>
 	<h4><a href = "check.jsp?go=/member/change_pw.jsp">비밀번호 변경</a></h4>
 	<h4><a href = "check.jsp?go=/member/change_info.jsp">회원정보 수정</a></h4>
 	<h4><a href = "check.jsp?go=/member/exit.jsp">회원 탈퇴</a></h4>
 
 
 
 </div>   
    
    
    
 <jsp:include page = "/template/footer.jsp"></jsp:include>