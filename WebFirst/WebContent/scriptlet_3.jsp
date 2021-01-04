<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
//http://localhost:9080/scriptlet_3.jsp?n1=10&n2=20
String strN1 = request.getParameter("n1");
String strN2 = request.getParameter("n2");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet_3</title>
</head>
<body>

	<div><%=strN1%>
		+
		<%=strN2%>
		=
	    <%=Integer.parseInt(strN1) + Integer.parseInt(strN2)%>
	</div>

</body>
</html>