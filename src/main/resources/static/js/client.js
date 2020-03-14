/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(client, status){
			$('#txtIdEdit').val(client.id);
			$('#txtNameEdit').val(client.name);
			$('#txtDetailsEdit').val(client.details);
			$('#txtWebsiteEdit').val(client.website);
            $('#txtAddressEdit').val(client.address);
			$('#ddlStateEdit').val(client.stateid);
			$('#ddlCountryEdit').val(client.countryid);
			$('#txtCityEdit').val(client.city);
            $('#txtPhoneEdit').val(client.phone);
            $('#txtMobileEdit').val(client.mobile);
            $('#txtEmailEdit').val(client.email);
		});
		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(client, status){
    		$('#idDetails').val(client.id);
    		$('#nameDetails').val(client.name);
    		$('#detailsDetails').val(client.details);
    		$('#websiteDetails').val(client.website);
    		$('#addressDetails').val(client.address);
    		$('#ddlStateDetails').val(client.stateid);
    		$('#ddlCountryDetails').val(client.countryid);
    		$('#cityDetails').val(client.city);
            $('#phoneDetails').val(client.phone);
            $('#mobileDetails').val(client.mobile);
            $('#emailDetails').val(client.email);

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