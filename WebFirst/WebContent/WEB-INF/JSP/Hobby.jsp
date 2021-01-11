<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.soku.web.HobbyEntity"%>
<%	
	List<HobbyEntity> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hobby</title>
</head>
<body>
	<h1>Hobby</h1>
	<div>
	<form id="frm" action="/Hobby" method="post" onsubmit="return hobbyChk();">	
		<label>ID : <input type="text" name="id"></label>
		<label>취미 : <input type="text" name="hobby_nm"></label>
		<input type="submit" value="등록">
	</form>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>취미명</th>
			<th></th>
		</tr>
	<% for(HobbyEntity vo : list){ %>
		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getName() %></td>
			<td>
				<button onclick="chkDel(<%=vo.getId()%>)">삭제</button>
				<a href="/modHobby?id=<%=vo.getId()%>"><button>수정</button></a>
			</td>
		</tr>
	<% } %>
	</table>
	<script src="./JS/common.js"></script>
</body>
</html>