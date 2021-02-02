/**
 * 
 */


function chkItem(ele, nm) {
    if (!ele.value) {
        alert(`${nm}를 작성해 주세요.`);
        ele.focus();
        return true;
    }
}

function chkFrm() {
    var frm = document.querySelector("#frm");
    
    if (chkItem(frm.userId, 'ID')
    || chkItem(frm.userPw, 'PW')
    || chkItem(frm.nm, '이름')){
        return false;
    } else if(frm.userPw.value !== frm.userPwRe.value) {
        alert('비밀번호를 확인해 주세요.')
        frm.userPw.focus();
        return false;
    }
}
var loginBtnEle = document.querySelector("#loginBtn")
if (loginBtnEle) {
  var frmEle = document.querySelector("#frm")
  var userIdEle = frmEle.userId
  var userPwEle = frmEle.userPw
  var errMsgEle = document.querySelector(".errMsg")

  function ajax() {
    if (userIdEle.value === '') {
      alert('아이디를 입력해 주세요')
      return;
    } else if(userPwEle.value === '') {
      alert('비밀번호를 입력해주세요')
      return;
    }
    var param = {
      userId: userIdEle.value,
      userPw: userPwEle.value
    }
    fetch('/user/login', {
      method: 'post',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(param)
    }).then(function(res) {
      return res.json()  
    }).then(function(myJson) {
      proc(myJson)
    })
  }

  function proc (myJson) {
    switch (myJson.result) {
      case 1:
        location.href='/board/home'
        return
      case 2:
        alert('아이디를 확인해주세요')
        return
      case 3:
        alert('비밀번호를 확인해주세요')
        return
    }
  }
  loginBtnEle.addEventListener("click", ajax)
}



//Join
var joinBtnEle = document.querySelector('#joinBtn')
if (joinBtnEle) {
  var frmEle = document.querySelector('#frm')
  var userIdEle = frmEle.userId
  var userPwEle = frmEle.userPw
  var userPwReEle = frmEle.userPwRe
  var nmEle = frmEle.nm
  var genderEle = frm.gender

  function ajax2() {
    if (userIdEle.value === '') {
      alert('아이디를 입력해 주세요')
      return;
    } else if (userPwEle.value === '') {
      alert('비밀번호를 입력해 주세요')
      return;
    } else if (userPwReEle.value === '') {
      alert('비밀번호를 확인해 주세요')
      return;
    } else if(nmEle.value === '') {
      alert('이름을 입력해 주세요')
      return;
    }
    var paramObj = {
      userId: userIdEle.value,
      userPw: userPwEle.value,
      nm: nmEle.value,
      gender: genderEle.value
    }
    fetch('/user/join', {
      method: 'post',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(paramObj)
    }).then(function(res) {
      return res.json()  
    }).then(function(myJson) {
      proc(myJson)
    })
  }
  function proc (myJson) {
    if (myJson.result === 1) {
      location.href = "/user/login"
    } else {
      alert('회원가입 실패')
    }
  }
  
  joinBtnEle.addEventListener("click",ajax2)
}



//ID Check
const chkIdBtnEle = document.querySelector("#chkIdBtn")
if (chkIdBtnEle) {
    function ajax() {
      var frmEle = document.querySelector("#frm")
      var userIdEle = frmEle.userId
      var userIdVal = userIdEle.value
      var idChkMsgEle = frmEle.querySelector("#idChkMsg")
      
      fetch(`/user/chkId/${userIdVal}`)
        .then(function (res) {
          return res.json()
        })
        .then(function (myJson) {
          if (myJson.result === 1) {
            idChkMsgEle.innerText = `중복된 아이디가 있습니다.`;
          } else {
            idChkMsgEle.innerText = `사용할 수 있는 아이디 입니다.`;
          }
        })
    }
    chkIdBtn.addEventListener("click", ajax)
}




