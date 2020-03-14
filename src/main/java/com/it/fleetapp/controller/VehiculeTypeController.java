package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeType;
import com.it.fleetapp.services.VehiculeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeTypeController {

    @Autowired
    private VehiculeTypeService vehiculeTypeService;

    @GetMapping("/vehiculeTypes")
    public String getVehiculeTypes(Model model) {

        List<VehiculeType> vehiculeTypeList = vehiculeTypeService.getVehiculeTypes();
        model.addAttribute("vehiculeTypes", vehiculeTypeList);

        return "vehiculeType";
    }

    @PostMapping("/vehiculeTypes/addNew")
    public String addNewVehiculeType(VehiculeType vehiculeType) {
        vehiculeTypeService.saveVehiculeType(vehiculeType);
        return "redirect:/vehiculeTypes";
    }

    @RequestMapping("vehiculeTypes/findById")
    @ResponseBody
    public Optional<VehiculeType> findById(Integer id) {
        return vehiculeTypeService.findVehiculeTypeById(id);
    }

    @RequestMapping(value="vehiculeTypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeType vehiculeType) {
        vehiculeTypeService.saveVehiculeType(vehiculeType);
        return "redirect:/vehiculeTypes";
    }

    @RequestMapping(value="vehiculeTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeTypeService.deleteVehiculeType(id);
        return "redirect:/vehiculeTypes";
    }

}
