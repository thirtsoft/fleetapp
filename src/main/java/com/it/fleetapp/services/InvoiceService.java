package com.it.fleetapp.services;

import com.it.fleetapp.models.Invoice;
import com.it.fleetapp.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;;

    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    public void saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public Optional<Invoice> findInvoiceById(int id) {
        return invoiceRepository.findById(id);
    }

    public void deleteInvoice(Integer id) {
        invoiceRepository.deleteById(id);
    }

}
