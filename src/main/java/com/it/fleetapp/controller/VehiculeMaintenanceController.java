package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeMaintenance;
import com.it.fleetapp.services.SupplierService;
import com.it.fleetapp.services.VehiculeMaintenanceService;
import com.it.fleetapp.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehiculeMaintenanceController {

    @Autowired
    private VehiculeMaintenanceService vehiculeMaintenanceService;

    @Autowired
    private VehiculeService vehiculeService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/vehiculeMaintenances")
    public String getVehiculeMaintenances(Model model) {

        model.addAttribute("vehiculeMaintenances", vehiculeMaintenanceService.getVehiculeMaintenances());

        model.addAttribute("vehicules", vehiculeService.getVehicules());

        model.addAttribute("suppliers", supplierService.getSuppliers());


        return "vehiculeMaintenance";
    }

    @PostMapping("/vehiculeMaintenances/addNew")
    public String addNewVehiculeMaintenance(VehiculeMaintenance vehiculeMaintenance) {
        vehiculeMaintenanceService.saveVehiculeMaintenance(vehiculeMaintenance);
        return "redirect:/vehiculeMaintenances";
    }

    @RequestMapping("vehiculeMaintenances/findById")
    @ResponseBody
    public Optional<VehiculeMaintenance> findById(Integer id) {
        return vehiculeMaintenanceService.findVehiculeMaintenanceById(id);
    }

    @RequestMapping(value="vehiculeMaintenances/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeMaintenance vehiculeMaintenance) {
        vehiculeMaintenanceService.saveVehiculeMaintenance(vehiculeMaintenance);
        return "redirect:/vehiculeMaintenances";
    }

    @RequestMapping(value="vehiculeMaintenances/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeMaintenanceService.deleteVehiculeMaintenance(id);
        return "redirect:/vehiculeMaintenances";
    }


}
