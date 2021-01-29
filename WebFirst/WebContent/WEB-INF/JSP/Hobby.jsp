<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hobby</title>
</head>
<body>
	<h1>Hobby</h1>
	<c:if test="${sessionScope.loginUser != null }">
		<div>
		<form id="frm" action="/Hobby" method="post" onsubmit="return hobbyChk();">	
			<label>취미 : <input type="text" name="nm" value="${data.name}"></label>
			<input type="submit" value="등록">
		</form>
		</div>
	</c:if>
	<table>
		<tr>
			<th>ID</th>
			<th>취미명</th>
			<th></th>
		</tr>
	<c:forEach begin="1" end="${requestScope.endIdx}" var="idx">
		${idx}
	</c:forEach>
		
 	<c:forEach items="${requestScope.list}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.nm}</td>
			<td>
				<button onclick="chkDel(${item.id})">삭제</button>
				<a href="/modHobby?id=${item.id}"><button>수정</button></a>
			</td>
		</tr>
	</c:forEach>
	</table>
	<script src="./JS/common.js"></script>
</body>
</html>