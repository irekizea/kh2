<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <%
   // multipart/form-data 방식의 파일ㅇ르 받기 위한 자바 코드
   //기존의 request 에서는 더이상 전송데이터를 받을 수 없음
   //cos.jar 파일에 있는 multipartrequest 도구를 이용하여 데이터를 수신
   //multipartrequest 를 만들려면 뭐가 필요한가
   //-추출 대상, 저장경로, 저장용량제한, 인코딩 방식
   
   String path = "D:/upload/html";// 저장위치(폴더)
   
   int max = 10485760;
   
   String encoding = "UTF-8";
 //  업로드 가능하지만 이름 중복 시 덮어쓰기를 수행
 //  MultipartRequest mRequest = new MultipartRequest(request, path, max, encoding);
 //  덮어쓰지 하지 않기 위한 규칙 설정
 
 	DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();
 	MultipartRequest mRequest= new MultipartRequest(request, path, max, encoding, policy);
 	
// 전송된 정보를 추출(파일은 이미 저장이 끝난 상태)
// 파라미터는 기존과 동일하게 처리
// 파일은 다른 명령을 사용함
	String uploader = mRequest.getParameter("uploader");

	File test = mRequest.getFile("test");// 파일 꺼내기 없으면 null
	String filename = mRequest.getFilesystemName("test");// 업로드 된 파일 이름(실제)
	String origin = mRequest.getOriginalFileName("test"); // 업로드한 파일 이름(사용자)
	String type = mRequest.getContentType("test"); // 업로드한 파일 유형 (mine type)
	
	long filesize;
	
	if(test!=null){
		filesize = test.length();
	}else{
		filesize = 0;
	
	}
%>

<h2><%=uploader%></h2>

<h2><%=filename%></h2>
<h2><%=origin%></h2>
<h2><%=type %></h2>
<h3><%=filesize %></h3>