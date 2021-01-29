<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<a href="/user/join">Join</a>
	<form id="frm">
		<div>
			<input type="text" name="userId" placeholder="ID">
		</div>
		<div>
			<input type="password" name="userPw" placeholder="password">
		</div>
		<div>
			<input type="button" value="login" id="loginBtn">
		</div>
	</form>
	<div class="errMsg"></div>
</div>