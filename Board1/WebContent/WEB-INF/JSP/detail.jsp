<%@page import="java.util.List"%>
<%@page import="com.soku.board.model.BoardEntity"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	BoardEntity bo = (BoardEntity) request.getAttribute("bo");
	List<BoardEntity> backPage = (List)request.getAttribute("page");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
	<div>
		<a href="/list?page=1">리스트로 돌아가기</a> 
		<a href="/del?i_board=${bo.i_board}"><button>삭제</button></a>
		<a href="/update?i_board=${bo.i_board}"><button>수정</button></a>
	</div>
	<table>
		<tr>
			<th>번호 : ${bo.i_board}</th>
			<th>제목 : ${bo.title}</th>
			<th>내용 : ${bo.ctnt}</th>
			<th>등록일시 : ${bo.r_dt}</th>
		</tr>
		<tr>
			<th>${bo.ctnt}</th>
			<th>${bo.title}</th>
			<th>${bo.ctnt}</th>
			<th>${bo.r_dt}</th>
		</tr>
	</table>

</body>
</html>