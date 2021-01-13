<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <%@ page import="com.soku.board.model.*" %>
 <%
 	List<BoardEntity> list = (List)request.getAttribute("list");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<div>
		<a href="/write"><button>글쓰기</button></a>
	</div>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>등록일시</th>
			</tr>
			<% for(BoardEntity vo : list) { %>
				<tr>
					<td><a href="/detail?i_board=<%=vo.getI_board()%>"><%=vo.getI_board()%></a></td>
					<td><%=vo.getTitle() %></td>
					<td><%=vo.getCtnt() %></td>
					<td><%=vo.getR_dt() %></td>
				</tr>
			<% } %>
		</table>
	</div>
</body>
</html>