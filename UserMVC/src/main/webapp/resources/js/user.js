var loginBtnEle = document.querySelector("#loginBtn")

if (loginBtnEle) {
	var frmEle = document.querySelector("#frm")
	var uidEle = frmEle.uid
	var upwEle = frmEle.upw

	function ajax() {
		if (uidEle.value === '') {
			alert('아이디를 입력해주세요.')
			return
		} else if (upwEle.value === '') {
			alert('비밀번호를 입력해주세요.')
			return
		}
		var loginObj = {
			uid: uidEle.value,
			upw: upwEle.value
		}
		fetch('/user/login', {
			method: 'post',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify(loginObj)
		}).then(function (res) {
			return res.json()
		}).then(function (myJson) {
			proc(myJson)
		})
		function proc(myJson) {
			switch (myJson.result) {
				case 1:
					location.href = '/user/home'
					return
				case 2:
					alert('아이디를 확인해주세요')
					return
				case 3:
					alert('비밀번호를 확인해주세요')
					return
			}
		}
	}
	loginBtnEle.addEventListener("click", ajax)
}



var joinBtnEle = document.querySelector("#joinBtn")
if (joinBtnEle) {
	var frmEle = document.querySelector("#frm")
	var uidEle = frmEle.uid
	var upwEle = frmEle.upw
	var nmEle = frmEle.nm

	function ajax() {
		if (uidEle.value === '') {
			alert('ID를 입력해 주세요.')
			return
		} else if (upwEle.value === '') {
			alert('PW를 입력해 주세요.')
			return
		} else if (nmEle.value === '') {
			alert('이름을 입력해 주세요.')
			return
		}
		var joinObj = {
			uid: uidEle.value,
			upw: upwEle.value,
			nm: nmEle.value
		}

		fetch('/user/join', {
			method: 'post',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify(joinObj)
		}).then(function(res) {
			return res.json()
		}).then(function(myJson) {
			proc(myJson)
		})
		function proc(myJson) {
			if (myJson.result === 1) {
				location.href = "/user/login"
			} else {
				alert('회원가입 실패')
			}
		}
	}
	joinBtnEle.addEventListener("click", ajax)
}
