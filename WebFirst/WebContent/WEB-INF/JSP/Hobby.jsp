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
	<table>
		<tr>
			<th>ID</th>
			<th>취미명</th>
		</tr>
	<% for(HobbyEntity vo : list){ %>
		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getName() %></td>
		</tr>
	<% } %>
	</table>
</body>
</html>