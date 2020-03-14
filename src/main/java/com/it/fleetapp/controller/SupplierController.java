package com.it.fleetapp.controller;

import com.it.fleetapp.models.Supplier;
import com.it.fleetapp.services.SupplierService;
import com.it.fleetapp.services.CountryService;
import com.it.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/suppliers")
    public String getSuppliers(Model model) {

        model.addAttribute("countries", countryService.getCountries());
        model.addAttribute("states", stateService.getStates());
        model.addAttribute("suppliers", supplierService.getSuppliers());

        return "supplier";
    }

    @PostMapping("/suppliers/addNew")
    public String addNewSupplier(Supplier supplier) {
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping("suppliers/findById")
    @ResponseBody
    public Optional<Supplier> findById(Integer id) {
        return supplierService.findSupplierById(id);
    }

    @RequestMapping(value="suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Supplier supplier) {
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value="suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        supplierService.deleteSupplier(id);
        return "redirect:/suppliers";
    }

}
