<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 하단 조각을 보관하는 페이지 -->
 	
	 	</th>
	 </tr>
	 <tr>
	 	<th>
	 	<!--  
	 		하단 홈페이지 정보 작성
	 		-회사 정보
	 		-정책 안내
	 		-기타 사이트맵
	 		-연락쳐
	 	
	 	
	 	 -->
	 	
	 	<h3>KH 정보교육원 과정평가형 정보처리 산업기사 과정 &copy;</h3>
	 	<!--  홈페이지 세션 상태값 출력 -->
	 	<h5>session id = <%=session.getId() %></h5>
		<%
			String id = (String)session.getAttribute("id");
			String grade = (String)session.getAttribute("grade");
		
		%>	
		<h5> id = <%=id%>, grade = <%=grade %>,    로그인 상태 = <%=id !=null %></h5>
	 	</th>
	 </tr>
	 
	 </tbody>
	 
	 </table>
	 </div>
	 
	 
</body>
</html>