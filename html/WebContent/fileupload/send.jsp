<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!--  전송 폼 생성 -->
    
    <form action = "receive1.jsp" method = "Get">
    	<input type = "text" name = "uploader"><br><br>
    	<input type = "file" name = "test"><br><br>
    	<input type = "submit" value = "업로드"><br><br>
    
    
    </form>		
    
    
 	 <form action = "receive1.jsp" method = "post">
    	<input type = "text" name = "uploader"><br><br>
    	<input type = "file" name = "test"><br><br>
    	<input type = "submit" value = "업로드"><br><br>
    
    
    </form>													<!-- mult -->
    
    
    
    
    
    
     <form action = "receive1.jsp" method = "post" enctype="multipart/form-data">
    	<input type = "text" name = "uploader"><br><br>
    	<input type = "file" name = "test"><br><br>
    	<input type = "submit" value = "업로드"><br><br>
    
    
    </form>
    
      <form action = "receive2.jsp" method = "post" enctype="multipart/form-data">
    	<input type = "text" name = "uploader"><br><br>
    	<input type = "file" name = "test"><br><br>
    	<input type = "submit" value = "업로드"><br><br>
    
    
    </form>
    
    