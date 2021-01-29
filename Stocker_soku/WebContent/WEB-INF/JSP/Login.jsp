<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section id="content">
	<h2>Login page</h2>
	<p class="err_msg">${err_msg}</p>

	<form action="/Login" method="post">
		<input type="email" name="email" id="email"
			placeholder="email" autocomplete="off" required>
		
		<input type="password" name="pw" id="pw"
			placeholder="Password" autocomplete="off" required>
			
		<input type="submit" value="login">
	</form>
</section>