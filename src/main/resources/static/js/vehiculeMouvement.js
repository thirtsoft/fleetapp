/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeMouvement, status){
		$('#idEdit').val(vehiculeMouvement.id);
        $('#ddlVehicleEdit').val(vehiculeMouvement.vehiculeid);
        $('#ddlLocation1Edit').val(vehiculeMouvement.location1);
        $('#date1Edit').val(vehiculeMouvement.date1);
        $('#ddlLocation2Edit').val(vehiculeMouvement.location2);
        $('#date2Edit').val(vehiculeMouvement.date2);
        $('#remarksEdit').val(vehiculeMouvement.remarks);


		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeMaintenance, status){
    		$('#idDetails').val(vehiculeMouvement.id);
            $('#ddlVehicleDetails').val(vehiculeMouvement.vehiculeid);
            $('#ddlLocation1Details').val(vehiculeMouvement.location1);
            $('#date1Details').val(vehiculeMouvement.date1);
            $('#ddlLocation2Details').val(vehiculeMouvement.location2);
            $('#date2Details').val(vehiculeMouvement.date2);
            $('#remarksDetails').val(vehiculeMouvement.remarks);

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