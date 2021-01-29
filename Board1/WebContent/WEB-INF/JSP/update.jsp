<%@page import="com.soku.board.model.BoardEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
</head>
<body>
	<form action="/update" method="post">
	<input type="hidden" name="i_board" value="${update.i_board}">
		<div><input type="text" name="title" placeHolder="제목" value="${update.title}"></div>
		<div>
			<label>
				<textarea name="ctnt" placeholder="내용">${update.ctnt}</textarea>
			</label>
		</div>
		<div>
			<input type="submit" value="수정">
			<input type="reset" value="다시작성">
		</div>
	</form>
</body>
</html>