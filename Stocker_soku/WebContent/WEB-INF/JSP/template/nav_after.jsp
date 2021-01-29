<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<ul>
			<li><a href="/Home">Home</a></li>
			<li><a href="/Artist">Artist</a></li>
			<li><a href="/Explore">Explore</a></li>
			<li><a href="/Mypage">${sessionScope.c_user.email}</a></li>
			<li><a href="/Logout">Logout</a></li>
		</ul>
	</nav>
</body>
</html>