function init() {
	$.get("header.html", function( data ) {
		$("body div.container:first").prepend(data);
	});	
	$.get("footer.html", function( data ) {
		$("body div.container:first").append(data);
	});	
}

$(document).ready(init);

$(function () {
  $('[data-toggle="popover"]').popover()
})

$(document).ready(function(){
			$('[data-toggle="popover"]').popover();   
		});

$('.popover-dismiss').popover({
  trigger: 'focus'
})