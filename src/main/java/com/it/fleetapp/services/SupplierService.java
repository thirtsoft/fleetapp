package com.it.fleetapp.services;

import com.it.fleetapp.models.Supplier;
import com.it.fleetapp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;;

    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

    public void saveSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public Optional<Supplier> findSupplierById(int id) {
        return supplierRepository.findById(id);
    }

    public void deleteSupplier(Integer id) {
        supplierRepository.deleteById(id);
    }

}
