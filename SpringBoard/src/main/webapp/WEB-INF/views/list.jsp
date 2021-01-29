<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List page</title>
<link rel="stylesheet" href="res/css/common.css">
<script defer type="text/javascript" src="/res/js/common.js"></script>
</head>
<body>
	<h1>List</h1>
	<div>
		<a href="/write">글등록</a>
	</div>
	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>내용</td>
				<td>작성일시</td>
			</tr>
		</thead>
		<c:forEach items="${list}" var="item">
		<tbody>
			<tr onclick="moveToDetail(${item.i_board});">
				<td>${item.i_board}</td>
				<td>${item.title}</td>
				<td>${item.ctnt}</td>
				<td>${item.r_dt}</td>
			</tr>	
		</tbody>
		</c:forEach>
	</table>
</body>
</html>