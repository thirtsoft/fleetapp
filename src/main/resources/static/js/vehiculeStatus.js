/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeStatus, status){
			$('#idEdit').val(vehiculeStatus.id);
			$('#descriptionEdit').val(vehiculeStatus.description);
			$('#detailsEdit').val(vehiculeStatus.details);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeStatus, status){
    		$('#idDetails').val(vehiculeStatus.id);
    		$('#descriptionDetails').val(vehiculeStatus.description);
    		$('#detailsDetails').val(vehiculeStatus.details);

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