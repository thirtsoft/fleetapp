/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeModel, status){
			$('#idEdit').val(vehiculeModel.id);
			$('#descriptionEdit').val(vehiculeModel.description);
			$('#detailsEdit').val(vehiculeModel.details);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeModel, status){
    		$('#idDetails').val(vehiculeModel.id);
    		$('#descriptionDetails').val(vehiculeModel.description);
    		$('#detailsDetails').val(vehiculeModel.details);

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