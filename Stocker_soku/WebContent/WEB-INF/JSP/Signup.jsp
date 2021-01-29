<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section id="content">
	<h2>Signup page</h2>
	<p class="err_msg">${err_msg}</p>

	<form action="/Signup" method="post">
		<input type="email" name="email" id="email"
			placeholder="Enter your email address" autocomplete="off" required>
		
		<input type="text" name="nm" id="nm"
			placeholder="Enter your full name" autocomplete="off" required>
		
		<input type="password" name="pw" id="pw"
			placeholder="Enter your password" required>
		
		<input type="password" id="pw_repeat"
			placeholder="Repeat your password" required>
			
		<input type="submit" value="Sign up">
	</form>
</section>
