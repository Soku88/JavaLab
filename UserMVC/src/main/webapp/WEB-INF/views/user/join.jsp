<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join page</title>
</head>
<body>
		<form id="frm" action="/join" method="post">
			<div><input type="text" name="uid" placeholder="아이디"></div>
			<div><input type="password" name="upw" placeholder="비밀번호"></div>
			<div><input type="text" name="nm" placeholder="이름"></div>
			<div><input id="joinBtn" type="button" value="Join us"></div>
		</form>
		<script src="/res/js/user.js"></script>
</body>
</html>