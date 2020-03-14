/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeType, status){
			$('#idEdit').val(vehiculeType.id);
			$('#descriptionEdit').val(vehiculeType.description);
			$('#detailsEdit').val(vehiculeType.details);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeType, status){
    		$('#idDetails').val(vehiculeType.id);
    		$('#descriptionDetails').val(vehiculeType.description);
    		$('#detailsDetails').val(vehiculeType.details);

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