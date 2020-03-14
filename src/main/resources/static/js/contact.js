/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(contact, status){
			$('#txtIdEdit').val(contact.id);
            $('#firstNameEdit').val(contact.firstname);
            $('#lastnameEdit').val(contact.lastname);
            $('#phoneEdit').val(contact.phone);
            $('#emailEdit').val(contact.email);
            $('#mobileEdit').val(contact.mobile);
            $('#remarksEdit').val(contact.remarks);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(contact, status){
    		$('#idDetails').val(contact.id);
    		$('#firstNameDetail').val(contact.firstname);
    		$('#lastNameDetail').val(contact.lastname);
    		$('#phoneDetail').val(contact.phone);
            $('#emailDetail').val(contact.email);
            $('#mobileDetail').val(contact.mobile);
            $('#remarksDetail').val(contact.remarks);

    	});
    	$('#detailsModal').modal();
    });

    $('table #deleteButton').on('click',function(event) {
    	event.preventDefault();
    	var href = $(this).attr('href');
    	$('#deleteModal #delRef').attr('href', href);
    	$('#deleteModal').modal();
    });

  });