/**
 * 
 */

function init() {
	//const modal = document.getElementById('modal');
	//modal.addEventListener('click', function(e) {
	//	if(e.target == this) toggleModal();
	//})	

	const item_list = document.querySelectorAll('.item');
	item_list.forEach(item => {
	    item.addEventListener('click', function() {
	        const id = this.dataset.id;

			console.log(id);

	        fetch('/article?id=' + id)
	        	.then(res => res.json())
	        	.then(data => {
	        	    setModal(data);
	        	    toggleModal();
	        	})
    })
})

}

init(); 