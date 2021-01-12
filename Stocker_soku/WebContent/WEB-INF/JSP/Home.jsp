<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<section id="content">
	<c:forEach var="article" items="${list}">
		${article.getTitle()}
		
			<div class="item">
				<img 
					alt="Opne modal - ${article.getTitle()}" 
					src="/images/img/${article.getFile_nm()}">
			</div>
			<div>
				<strong>${article.getTitle()} </strong>
				<small>${article.getAuthor_nm()} </small>
			</div>
		<br>
	</c:forEach>
</section>