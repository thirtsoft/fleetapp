/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeMake, status){
			$('#idEdit').val(vehiculeMake.id);
			$('#descriptionEdit').val(vehiculeMake.description);
			$('#detailsEdit').val(vehiculeMake.details);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeMake, status){
    		$('#idDetails').val(vehiculeMake.id);
    		$('#descriptionDetails').val(vehiculeMake.description);
    		$('#detailsDetails').val(vehiculeMake.details);

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