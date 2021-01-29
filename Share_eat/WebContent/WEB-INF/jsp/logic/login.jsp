<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="./css/login.css">
</head>
	<body>
    <div class="container">
        <form method="post" action="/login.do" id="login-form">
            <div class="form-title">
                <h2>LOGO</h2>
            </div>
            <div class="form-input">
                <input class="login-input"type="text" placeholder="ID">
                <input class="login-input"type="password" placeholder="password">
            </div>
            <div class="form-btn">
            </div>
	        <a href="/main.do"><input class="login-btn" type="submit" value="Login"></a>
	        <a href="/join.do"><input class="login-btn" type="button" value="Join"></a>
	        <a href="#">ID / Password 찾기</a>
	  	 </form>
    </div>
</body>
</html>