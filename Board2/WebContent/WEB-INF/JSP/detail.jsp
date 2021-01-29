<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<h2>detail</h2>
	<a href="/list">리스트로 돌아가기</a>
	<a href="/del?i_board=${param.i_board}"><button>삭제</button></a>
	<a href="/upd?i_board=${param.i_board}"><button>수정</button></a>
	
	<div>번호 : ${param.i_board}</div>
	<div>제목 : ${data.title}</div>
	<div>작성일자 : ${data.r_dt}</div>
	<hr>
	<div>내용 : ${data.ctnt}</div>
	
</body>
</html>