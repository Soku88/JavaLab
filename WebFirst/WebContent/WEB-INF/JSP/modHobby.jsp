<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form id="frm" action="/modHobby" method="post" onsubmit="return hobbyChk();">	
			<label>ID : <input type="text" name="id" value="${param.id}" readonly></label>
			<label>취미 : <input type="text" name="hobby_nm"></label>
			<input type="submit" value="등록">
		</form>
	</div>
	<script src="/JS/common.js"></script>
</body>
</html>