/**
 *
 */

$('document').ready(function() {

	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(invoice, status){
		$('#txtIdEdit').val(invoice.id);
        $('#dateEdit').val(invoice.invoiceDate);
        $('#remarksEdit').val(invoice.remarks);
        $('#ddlClientEdit').val(invoice.clientid);
        $('#ddlInvoiceStatusEdit').val(invoice.invoicestatusid);

		});

		$('#editModal').modal();
	});

	$('table #detailsButton').on('click',function(event) {
    	event.preventDefault();
    	var href= $(this).attr('href');
    	$.get(href, function(invoice, status){
    		$('#idDetails').val(invoice.id);
    		$('#DateDetails').val(invoice.invoiceDate);
    		$('#remarksDetails').val(invoice.remarks);
    		$('#ddlClientDetails').val(invoice.clientid);
    		$('#ddlInvoiceStatusDetails').val(invoice.invoicestatusid);
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