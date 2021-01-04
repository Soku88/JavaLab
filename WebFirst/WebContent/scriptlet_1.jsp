<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//자바문법을 사용할 수 있는 부분 (scriptlet)  

int n1 = 10;
int n2 = 20;
int result = n1 + n2;
String str = "hahaha";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet_1</title>
</head>
<body>
	<div>
		<%out.print(result);%>
	</div>
	<div><%=result%></div>
	<div><%=str%></div>
</body>
</html>