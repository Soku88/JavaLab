/**
 * 
 */
var boardPkEle = document.querySelector("#pk")
var btnDelEle = document.querySelector("#delBtn")

function ajax() {
  var {pk, category} = data.dataset
  fetch(`/board/del/${pk}`, {
    method: 'delete'
  })
}

if (btnDelEle) {
  btnDelEle.addEventListener("click", function () {
    if (confirm('삭제하시겠습니까?')) { 
      ajax();
    }
  })
}