/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeMaintenance, status){
			$('#idEdit').val(vehiculeHire.id);
			$('#ddlVehicleEdit').val(vehiculeHire.vehiculeid);
			$('#ddlClientEdit').val(vehiculeHire.clientid);
			$('#dateOutEdit').val(vehiculeHire.dateOut);
			$('#timeOutEdit').val(vehiculeHire.timeOut);
			$('#ddlLocationEdit').val(vehiculeHire.locationid);
			$('#dateInEdit').val(vehiculeHire.dateIn);
			$('#timeInEdit').val(vehiculeHire.timeIn);
			$('#priceEdit').val(vehiculeHire.price);
			$('#remarksEdit').val(vehiculeHire.remarks);


		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeMaintenance, status){
//    		$('#idDetails').val(vehiculeMaintenance.id);
//            $('#ddlVehicleDetails').val(vehiculeMaintenance.vehicleid);
//            $('#startDateDetails').val(vehiculeMaintenance.startDate);
//            $('#remarksDetails').val(vehiculeMaintenance.remarks);
//            $('#endDateDetails').val(vehiculeMaintenance.endDate);
//            $('#ddlSupplierDetails').val(vehiculeMaintenance.supplierid);
//            $('#priceDetails').val(vehiculeMaintenance.price);

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