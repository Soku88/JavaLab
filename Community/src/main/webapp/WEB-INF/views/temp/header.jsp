<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:importAttribute name="menuList" />
<header>
	<nav class="nav-wrap">
		<c:if test="${sessionScope.loginUser != null}">
				Welcome, ${sessionScope.loginUser.nm}!!
			</c:if>
		<h1>Header</h1>
		<div class="menu-list">
			<ul>
				<li><c:choose>
						<c:when test="${sessionScope.loginUser == null}">
							<a href="/user/login">로그인</a>
						</c:when>
						<c:otherwise>
							<a href="/user/logout">로그아웃</a>
						</c:otherwise>
					</c:choose></li>
			</ul>
		</div>
	</nav>
	<ul>
		<c:forEach items="${menuList}" var="menu">
			<li><a href="/board/list?category=<c:out value="${menu.category}"/>">
					<c:out value="${menu.nm}" />
			</a></li>
		</c:forEach>
	</ul>
</header>