<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
	<div class="container">
		<div>
			<a href="/user/login">Go to login</a>
		</div>
		<form id="frm" action="/user/join" method="post"
			onsubmit="return chkFrm();">
			<div>
				<input type="button" value="중복체크" id="chkIdBtn">
			</div>
			<div>
				<input type="text" name="userId" placeholder="ID">
			</div>
			<div id="idChkMsg" class="errMsg"></div>
			<div>
				<input type="password" name="userPw" placeholder="password">
			</div>
			<div>
				<input type="password" name="userPwRe"
					placeholder="Confirm Password">
			</div>
			<div>
				<input type="text" name="nm" placeholder="Name">
			</div>
			<div>
				Gender : <label>female<input type="radio" name="gender"
					value="0" checked></label> <label>male<input type="radio"
					name="gender" value="1"></label>
			</div>
			<div>
				<input id="joinBtn" type="button" value="Join us">
			</div>
		</form>
	</div>
</div>