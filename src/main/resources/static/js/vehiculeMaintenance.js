/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(vehiculeMaintenance, status){
			$('#idEdit').val(vehiculeMaintenance.id);
			$('#ddlVehicleEdit').val(vehiculeMaintenance.vehicleid);
			$('#startDateEdit').val(vehiculeMaintenance.startDate);
			$('#remarksEdit').val(vehiculeMaintenance.remarks);
			$('#endDateEdit').val(vehiculeMaintenance.endDate);
			$('#ddlSupplierEdit').val(vehiculeMaintenance.supplierid);
			$('#priceEdit').val(vehiculeMaintenance.price);


		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(vehiculeMaintenance, status){
    		$('#idDetails').val(vehiculeMaintenance.id);
            $('#ddlVehicleDetails').val(vehiculeMaintenance.vehicleid);
            $('#startDateDetails').val(vehiculeMaintenance.startDate);
            $('#remarksDetails').val(vehiculeMaintenance.remarks);
            $('#endDateDetails').val(vehiculeMaintenance.endDate);
            $('#ddlSupplierDetails').val(vehiculeMaintenance.supplierid);
            $('#priceDetails').val(vehiculeMaintenance.price);

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