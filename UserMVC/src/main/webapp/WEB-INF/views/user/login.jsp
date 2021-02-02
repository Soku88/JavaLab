<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<form id="frm" action="/login" method="post">
		<input type="text" name="uid" placeholder="ID">
		<input type="password" name="upw" placeholder="Password">
		<input type="button" id="loginBtn" value="login">
	</form>
	<script src="/res/js/user.js"></script>
</body>
</html>