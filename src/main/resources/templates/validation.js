/*jQuery('#formNewPersonValidation').validate({
	rules:{
		name:"required"	
	},
	messages: {
		name:"Please enter your name"
	}
});*/

$(document).ready(function() {
  $("#formNewPersonValidation").validate({
	    rules: {
	      fullName : {
	        required: true,
	        minlength: 3,
	        maxlength: 25
	      },
	    },
	    messages : {
	      fullName: {
	        required: "Full Name is required",
			minlength: "Full Name at least 2 characters",
			maxlength: "Max. 25 characters for the Full Name"
	      }
	    } 
	});
});         