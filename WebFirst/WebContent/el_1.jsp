<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String name = "soku";
//내장객체 값 전달 set, get Attribute
//pageContext, request, session, application

pageContext.setAttribute("name", "soonil"); //JSP파일이 열릴때 생성되고, 사라진다.
request.setAttribute("name", "soku"); //일회성, 요청에 응답이 끝난 후 바로 죽는다.
session.setAttribute("name", "dohum"); //browser가 살아있는 한 계속 살아있다.
application.setAttribute("name", "yujung"); //공용 server가 살아있는 한 계속 살아있다.

request.getAttribute(name);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>${param.n1}+${param.n2}= ${param.n1} ${param.n2}</div>
	<div>${name}</div>
</body>
</html>