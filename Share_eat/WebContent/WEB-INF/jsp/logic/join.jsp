<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join us</title>
<link rel="stylesheet" type="text/css" href="./css/join.css">
</head>
<body>
    <div class="container">
        <form action="/join.do" method="post">
            <div class="title">
                <h1>Join us</h1>
                <input type="submit" value="Join" id="join-btn">
            </div>
            <div class="input-wrap">
                <div><input type="email" placeholder="email" name="email"></div>
                <div><input type="password" placeholder="Password" name="pw"></div>
                <div><input type="password" placeholder="confirm Password" name="confirm_pw"></div>
                <div><input type="text" placeholder="name" name="user_nm"></div>
                <div><input type="text" placeholder="gender" name="gender"></div>
                <div><input type="text" placeholder="birth" name="birth"></div>
                <div><input type="text" placeholder="addr" name="addr"></div>
                <div><input type="text" placeholder="phone" name="p_number"></div>
            </div>
        </form>
    </div>
</body>
</html>