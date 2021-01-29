<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
</head>
<body>
	<form action="/write" method="post">
		<div>
			<input type="text" name="title" placeHolder="제목">
		</div>
		<div>
			<label>
				<textarea name="ctnt"></textarea>
			</label>
		</div>
		<div>
			<input type="submit" value="글쓰기">
			<input type="reset" value="다시작성">
		</div>
	</form>
</body>
</html>