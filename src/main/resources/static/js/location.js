/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(location, status){
			$('#idEdit').val(location.id);
			$('#descriptionEdit').val(location.description);
			$('#detailsEdit').val(location.details);
			$('#ddlStateEdit').val(location.stateid);
            $('#ddlCountryEdit').val(location.countryid);
			$('#cityEdit').val(location.city);
			$('#addressEdit').val(location.address);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(location, status){
    		$('#idDetails').val(location.id);
    		$('#descriptionDetails').val(location.description);
    		$('#detailsDetails').val(location.details);
    		$('#ddlStateDetails').val(location.stateid);
    		$('#ddlCountryDetails').val(location.countryid);
    		$('#cityDetails').val(location.city);
    		$('#addressDetails').val(location.address);

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