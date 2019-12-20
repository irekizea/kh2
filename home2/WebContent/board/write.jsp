<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page = "/template/header.jsp"></jsp:include>



<link href="https://cdn.jsdelivr.net/npm/suneditor@latest/dist/css/suneditor.min.css" rel="stylesheet">
<!-- <link href="https://cdn.jsdelivr.net/npm/suneditor@latest/assets/css/suneditor.css" rel="stylesheet"> -->
<!-- <link href="https://cdn.jsdelivr.net/npm/suneditor@latest/assets/css/suneditor-contents.css" rel="stylesheet"> -->
<style>
    textarea[name=content]{
        width:100%;
        height:150px;
    }
</style>
<script src="https://cdn.jsdelivr.net/npm/suneditor@latest/dist/suneditor.min.js"></script>
<!-- languages (Basic Language: English/en) -->
<script src="https://cdn.jsdelivr.net/npm/suneditor@latest/src/lang/ko.js"></script>
<script>
    function loadEditor(){
        window.editor = SUNEDITOR.create((document.querySelector('textarea[name=content]')),{
        var editor = SUNEDITOR.create((document.querySelector('textarea[name=content]')),{
            //언어 설정
            lang: SUNEDITOR_LANG['ko'],
            
            //버튼 목록
            buttonList:[
                ['font', 'fontSize', 'fontColor'], 
                ['underline', 'italic', 'paragraphStyle', 'formatBlock'],
                ['align', 'table', 'image']
            ],
            //글꼴 설정
            font:[
                '굴림', '궁서', 'Verdana', 'Arial'
            ],
            //크기 설정
            fontSize:[
                10, 16, 32
            ],
            
        });
    
	  	//중요 : 키입력시마다 값을 원래위치(textarea)에 복사
	    editor.onKeyUp = function(e){
	    	var content = document.querySelector("textarea[name=content]");
	    	content.value = editor.getContents();
	    }
    }
    
    }
    //윈도우 로딩 시 loadEditor를 실행하도록 설정(body에 onload 한 효과)
    window.onload = loadEditor;
</script>







<div align = "center">

	<h2 ><font color= "red">글 이쁘게 써</font></h2>

	<form action = "write.do" method = "post" enctype="multipart/form-data">
	<%if(request.getParameter("superno")!=null){ %>
	<input type="hidden" name = "superno" value ="<%=request.getParameter("superno") %>">
	<%} %>
	<table class="table" width = "80%">
		<tr>
			<td colspan = "2">게시판</td>
			<td><select name = "head">
				<option value = "">선택</option>
				<option>공지</option>
				<option>정보</option>
				<option>일반</option>
			</select></td>
		</tr>
		<tr>
			<td colspan = "2">제목</td>
			<td><textarea name = "title" rows = "1" cols = "95"></textarea></td>
		</tr>
		<tr>
		
			<td>첨부 파일</td>
			<td colspan="3"><input type ="text" name = "uploader"><input type = "file" name = "file" accept="jpg, png, gif"><input type = "submit" value = "업로드"></td>
		</tr>
		
		
		
		<tr>
			<td colspan = "3">
			<textarea name = "content" ></textarea>
			</td>
		
		</tr>
		<tr align = "right">
			
			
			
			<td colspan = "3"><a href = "#" >상세정보</a><input type = "submit" name = "작성"></td>
		</tr>
    

	
	</table>

</form>


</div>




 <jsp:include page = "/template/footer.jsp"></jsp:include>