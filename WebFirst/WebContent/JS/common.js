/**
 * 
 */
/**
 * 
 */

function hobbyChk() {
	var frm = document.querySelector('#frm');
	var eleNm = frm.hobby_nm;
	
	if (eleNm.value.length == 0) {
		alert('취미명을 입력해주세요');
		eleNm.focus();
		return false;
	}

}

function chkDel(id) {

	if (confirm(`${id}번 취미를 삭제 하시겠습니까?`)) {
		location.href = `/DelHobby?id=${id}`;
	}

}