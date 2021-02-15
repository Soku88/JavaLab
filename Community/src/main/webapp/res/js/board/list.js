const listContentEle = document.querySelector("#listContent");

function goToDetail(boardPk) {
	location.href = `/board/detail?boardPk=${boardPk}`;
}

function getBoardList() {
	var category = listContentEle.dataset.category;
	console.log(`category : ${category}`);
	fetch(`/board/listData?category=${category}`)
		.then((res) => res.json())
		.then((myJson) => {
			console.log(myJson);
		});
}

function proc(myJson) {
	if (myJson.length === 0) {
		listContentEle.innerHTML = `
    <div>글이 없습니다.</div>
    `;
		return;
	}
	listContentEle.innerHTML = `
  <div>글이 있습니다.</div>
  `;
}
getBoardList();
