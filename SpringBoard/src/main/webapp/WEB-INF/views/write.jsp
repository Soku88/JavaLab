<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write page</title>
</head>
<body>
	<h1>Write</h1>
	<div>
		<a href="/list">리스트로 돌아가기</a>
	</div>
	<form action="/write" method="post">
		<div>
			<input type="text" name="title" placeholder="제목">	
		</div>
		<div>
			<textarea name="ctnt"></textarea>
		</div>
		<input type="submit" value="글쓰기">
		<input type="reset" value="다시작성">
	</form>
</body>
</html>