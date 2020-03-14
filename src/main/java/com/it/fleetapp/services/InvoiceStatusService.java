package com.it.fleetapp.services;

import com.it.fleetapp.models.InvoiceStatus;
import com.it.fleetapp.repository.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    public List<InvoiceStatus> getInvoiceStatus() {
        return invoiceStatusRepository.findAll();
    }

    public void saveInvoiceStatus(InvoiceStatus invoiceStatus) {
        invoiceStatusRepository.save(invoiceStatus);
    }

    public Optional<InvoiceStatus> findInvoiceStatusById(int id) {
        return invoiceStatusRepository.findById(id);
    }

    public void deleteInvoiceStatus(Integer id) {
        invoiceStatusRepository.deleteById(id);
    }
}
