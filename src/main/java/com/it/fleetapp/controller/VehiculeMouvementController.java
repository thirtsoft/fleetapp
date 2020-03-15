package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeMouvement;
import com.it.fleetapp.services.LocationService;
import com.it.fleetapp.services.VehiculeMouvementService;
import com.it.fleetapp.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehiculeMouvementController {

    @Autowired
    private VehiculeMouvementService vehiculeMouvementService;

    @Autowired
    private VehiculeService vehiculeService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/vehiculeMouvements")
    public String getVehiculeMouvements(Model model) {

        model.addAttribute("vehiculeMouvements", vehiculeMouvementService.getVehiculeMouvements());

        model.addAttribute("vehicules", vehiculeService.getVehicules());

        model.addAttribute("locations", locationService.getLocations());


        return "vehiculeMouvement";
    }

    @PostMapping("/vehiculeMouvements/addNew")
    public String addNewVehiculeMouvement(VehiculeMouvement vehiculeMouvement) {
        vehiculeMouvementService.saveCVehiculeMouvement(vehiculeMouvement);
        return "redirect:/vehiculeMouvements";
    }

    @RequestMapping("vehiculeMouvements/findById")
    @ResponseBody
    public Optional<VehiculeMouvement> findById(Integer id) {
        return vehiculeMouvementService.findVehiculeMouvementById(id);
    }

    @RequestMapping(value="vehiculeMouvements/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeMouvement vehiculeMouvement) {
        vehiculeMouvementService.saveCVehiculeMouvement(vehiculeMouvement);
        return "redirect:/vehiculeMouvements";
    }

    @RequestMapping(value="vehiculeMouvements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeMouvementService.deleteVehiculeMouvement(id);
        return "redirect:/vehiculeMouvements";
    }

}
