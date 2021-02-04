<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<body>
	<div>
		<a href="/board/list?category=${requestScope.data.category}">리스트로 돌아가기</a> 
	</div>
	<c:if test="${requestScope.data.userPk == sessionScope.loginUser.userPk}">
	<div>
		<button>수정</button>
		<button id="delBtn">삭제</button>
	</div>
	</c:if>
	<div id="data" data-pk="${requestScope.data.boardPk}" data-category="${requestScope.data.category}">
		<div>번호 : ${requestScope.data.seq}</div>
		<div>제목 : ${requestScope.data.title}</div>		
		<div>조회수 : ${requestScope.data.hits}</div>
		<div>작성일 : ${requestScope.data.regDt}</div>
		<div>작성자 : ${requestScope.data.writerNm}</div>
		<div>내용 : ${requestScope.data.ctnt}</div>
	</div>
</body>
<script src="/res/js/board/detail.js"></script>
