"use strict";

$("#draggable").draggable();

$("#drop").droppable({
	drop: function(event, ui){
		$.ajax({
			url: '/dropped',
			type: 'POST',
			data: {dropped: true}
		})
		.done(function() {
			alert("success");
		})
		.fail(function() {
			console.log("error");
		})
		.always(function() {
			console.log("complete");
		});
		
	}
});