<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<h2>Update</h2>
	<body>
	<form action="/upd?i_board=${param.i_board}" method="post">
	<input type="hidden" name="i_board" value="${data.i_board}">
		<div><input type="text" name="title" placeHolder="제목" value="${data.title}"></div>
		<div>
			<label>
				<textarea name="ctnt" placeholder="내용">${data.ctnt}</textarea>
			</label>
		</div>
		<div>
			<input type="submit" value="수정">
			<input type="reset" value="다시작성">
		</div>
	</form>
</body>
</body>
</html>