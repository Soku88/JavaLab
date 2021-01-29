<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${data.title} page</title>
<link rel="stylesheet" href="res/css/common.css">
<script defer type="text/javascript" src="/res/js/common.js"></script>
</head>
<body>
	<div>
		<a href="/list">리스트로 돌아가기</a> 
		<button data-id="${data.i_board}" id="delBtn">삭제</button>
		<button data-id="${data.i_board}" id="modBtn">수정</button>
	</div>
	<div>
		<div>번호 : ${data.i_board}</div>
		<div>제목 : ${data.title}</div>		
		<div>내용 : ${data.ctnt}</div>
		<div>작성일시 : ${data.r_dt}</div>
	</div>
</body>
</html>