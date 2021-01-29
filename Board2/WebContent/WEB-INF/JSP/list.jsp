<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<div>
		<a href="/write"><button>글쓰기</button></a>
	</div>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>등록일시</th>
		</tr>
		<c:forEach items="${requestScope.list}" var="list">
			<tr>
				<td>${list.i_board}</td>
				<td>${list.title}</td>
				<td><a href="/detail?i_board=${list.i_board}">${list.ctnt}</a></td>
				<td>${list.r_dt}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>