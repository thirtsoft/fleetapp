

$('document').ready(function() {
	$('table #editButton').on('click',function(event){
	    event.preventDefault();

	    var href= $(this).attr('href');
        $.get(href, function(country, status){
        	$('#idEdit').val(country.id);
        	$('#descriptionEdit').val(country.description);
        	$('#capitalEdit').val(country.capital);
        	$('#codeEdit').val(country.code);
        	$('#continentEdit').val(country.continent);
        	$('#nationalityEdit').val(country.nationality);
        });

		$('#editModal').modal();
	});


	$('.table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(country, status){
        	$('#idDetails').val(country.id);
        	$('#continentDetails').val(country.continent);
        	$('#codeDetails').val(country.code);
        	$('#capitalDetails').val(country.capital);
        	$('#descriptionDetails').val(country.description);
        	$('#nationalityDetails').val(country.nationality);

        	});
       	$('#detailsModal').modal();
    });

	$('.table #deleteButton').on('click',function(event) {
    		event.preventDefault();

            var href = $(this).attr('href');
            $('#confirmDeleteButton').attr('href', href);

    		$('#deleteModal').modal();
    	});


});