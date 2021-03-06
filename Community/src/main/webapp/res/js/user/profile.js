var profileImgEle = document.querySelector("#profileImg");
function profileUpload() {
	if (profileImgEle.files.length === 0) {
		alert("이미지를 선택해 주세요.");
		return;
	}

	var formData = new FormData();
	formData.append("profileImg", profileImgEle.files[0]);

	fetch("/user/profile", {
		method: "post",
		body: formData,
	})
		.then((res) => res.json())
		.then((myJson) => {
			if (myJson === 1) {
				location.reload();
			} else {
				alert("이미지 업로드에 실패하였습니다.");
			}
		});
}
