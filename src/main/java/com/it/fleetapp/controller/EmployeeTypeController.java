package com.it.fleetapp.controller;

import com.it.fleetapp.models.Country;
import com.it.fleetapp.models.EmployeeType;
import com.it.fleetapp.models.Location;
import com.it.fleetapp.models.State;
import com.it.fleetapp.services.CountryService;
import com.it.fleetapp.services.EmployeeTypeService;
import com.it.fleetapp.services.LocationService;
import com.it.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/employeeTypes")
    public String getEmployeeType(Model model) {

        List<EmployeeType> employeeTypesList = employeeTypeService.getEmployeeTypes();
        model.addAttribute("employeeTypes", employeeTypesList);

        return "employeeType";
    }

    @PostMapping("/employeeTypes/addNew")
    public String addNewEmployeeType(EmployeeType employeeType) {
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping("employeeTypes/findById")
    @ResponseBody
    public Optional<EmployeeType> findById(Integer id) {
        return employeeTypeService.findEmployeeTypeById(id);
    }

    @RequestMapping(value="employeeTypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(EmployeeType employeeType) {
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping(value="employeeTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        employeeTypeService.deleteEmployeeType(id);
        return "redirect:/employeeTypes";
    }

}
