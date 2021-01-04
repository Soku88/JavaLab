<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!//method 안에서 method를 만들 수 없다. <%!를 붙이면 전역변수로 선언
	int a = 0;

	private int sum(int n1, int n2) {
		return n1 + n2;

	}%>

<%
	int a = 20;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet_2</title>
</head>
<body>
	<div><%=sum(10, 40)%></div>
	<div><%=this.a%></div>
</body>
</html>