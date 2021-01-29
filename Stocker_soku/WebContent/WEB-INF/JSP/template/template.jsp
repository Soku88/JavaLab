<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stocker - ${page}</title>
<link rel="stylesheet" href="/css/common.css">
<link rel="stylesheet" href="/css/${page}.css">
</head>
<body>
    <div id="wrap">
		<header>
			<h1><a href="/">Stocker - ${page}</a></h1>
			<jsp:include page="./nav_${sessionScope.c_user != null ? 'after' : 'before'}.jsp"/>
		</header>
        <main>
            <jsp:include page="../${page}.jsp"/>
        </main>
    </div>
    <script src="/JS/modal.js"></script>
</body>
</html>