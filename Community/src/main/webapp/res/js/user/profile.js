/**
 *
 */

var profileImgEle = document.querySelector("#profileImg");
function profileUpload() {
	if (profileImgEle.value === "") {
		alert("이미지를 선택해 주세요.");
		return;
	}

	var formData = new FormData();
	formData.append("profileImg", profileImgEle.files[0]);

	fetch("/user/profile", {
		method: "post",
		body: formData,
	});
}
