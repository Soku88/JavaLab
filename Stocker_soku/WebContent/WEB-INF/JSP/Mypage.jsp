<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Stocker ${page}</title>
</head>
<body>
	<h2>My page</h2>
<%-- 	<p class="err-msg">${err-msg}</p> --%>
	
	<div>ID : ${sessionScope.c_user.nm}</div>
	<div>Email : ${sessionScope.c_user.email}</div>
	<form action="/Mypage" method="post">
		<div><input type="email" value="${c_user.email}" readonly></div>
		<div><input type="text" name="nm" id="nm" value="${c_user.nm}"></div>
		<input type="submit" value="update" name="upd_account">
	</form>
	<a href="/delete">Delte account</a>
</body>
</html>