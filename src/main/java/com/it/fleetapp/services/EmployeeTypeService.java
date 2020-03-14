package com.it.fleetapp.services;

import com.it.fleetapp.models.EmployeeType;
import com.it.fleetapp.repository.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getEmployeeTypes() {
        return employeeTypeRepository.findAll();
    }

    public void saveEmployeeType(EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

    public Optional<EmployeeType> findEmployeeTypeById(int id) {
        return employeeTypeRepository.findById(id);
    }

    public void deleteEmployeeType(Integer id) {
        employeeTypeRepository.deleteById(id);
    }
}
