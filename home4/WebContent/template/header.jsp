<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  상단 조각을 보관하는 페이지 -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>GGu</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
   <style>
         .title>*{
            margin: auto;
            text-align: center;
            font-family: typo;
            color: darkgray;
            font-size: 60px;
        }
        .regtitle>*{
		font-style:dx;
		font-size:2rem;
		color:#512e5e;
		text-align : center;
		}

    </style>

</head>

<body>
    <main>
        <header>
              <div class="title">
        <h1>KH information</h1>

  		  </div>
            
        </header>
         <jsp:include page = "/template/menu.jsp"></jsp:include>
          <section>

            <div class="row-empty"></div>
            <div class="row-empty"></div>
            <div class="row-empty"></div>


