<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write page</title>
<link rel="stylesheet" href="res/css/common.css">
<script defer type="text/javascript" src="/res/js/common.js"></script>
</head>
<body>
	<h1>Write</h1>
	<div>
		<a href="/list">리스트로 돌아가기</a>
	</div>
	<form action="/mod" method="post">
		<input type="hidden" name="i_board" value="${data.i_board}">
		<div>
			<input type="text" name="title" placeholder="제목" value="${data.title}">	
		</div>
		<div>
			<textarea name="ctnt">${data.ctnt}</textarea>
		</div>
		<input type="submit" value="수정">
	</form>
</body>
</html>