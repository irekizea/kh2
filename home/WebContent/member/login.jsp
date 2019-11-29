<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>


<div align="center">

<h2>로그인</h2>

<!-- <form action="/home/member/login.do" method="post"> -->
<form action="login.do" method="post">
	<table>
		<!-- 아이디 입력창, 비밀번호 입력창, 아이디 저장하기, 로그인 버튼, 찾기 링크 -->
		<tr>
			<td>
				<input type="text" name="id" placeholder="ID" required>
			</td>
		</tr>
		<tr>
			<td>
				<input type="password" name="pw" placeholder="Password" required>
			</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox">
				아이디 저장하기
			</td>
		</tr>
		<tr>
			<td align="right">
				<input type="submit" value="Login">
			</td>
		</tr>
		<tr>
			<td>
				<a href="#">아이디 찾기</a><br>
				<a href="#">비밀번호 찾기</a><br>
				<a href="#">회원가입</a>
			</td>
		</tr>
	</table>
</form>



<%if(request.getParameter("error") != null){ %>
<h5> <font color = "red"> 입력한 정보가 일치하지 않음</font></h5>

<%} %>
</div>




<jsp:include page = "/template/footer.jsp"></jsp:include>