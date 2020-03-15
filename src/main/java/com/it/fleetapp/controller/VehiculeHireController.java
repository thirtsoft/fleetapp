package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeHire;
import com.it.fleetapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehiculeHireController {

    @Autowired
    private VehiculeHireService vehiculeHireService;

    @Autowired
    private VehiculeService vehiculeService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/vehiculeHires")
    public String getVehiculeHires(Model model) {

        model.addAttribute("vehiculeHires", vehiculeHireService.getVehiculeVehiculeHires());

        model.addAttribute("vehicules", vehiculeService.getVehicules());

        model.addAttribute("clients", clientService.getClients());

        model.addAttribute("locations", locationService.getLocations());


        return "vehiculeHire";
    }

    @PostMapping("/vehiculeHires/addNew")
    public String addNewVehiculeHiree(VehiculeHire vehiculeHire) {
        vehiculeHireService.saveVehiculeHire(vehiculeHire);
        return "redirect:/vehiculeHires";
    }

    @RequestMapping("vehiculeHires/findById")
    @ResponseBody
    public Optional<VehiculeHire> findById(Integer id) {
        return vehiculeHireService.findVehiculeHireById(id);
    }

    @RequestMapping(value="vehiculeHires/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeHire vehiculeHire) {
        vehiculeHireService.saveVehiculeHire(vehiculeHire);
        return "redirect:/vehiculeHires";
    }

    @RequestMapping(value="vehiculeHires/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeHireService.deleteVehiculeHire(id);
        return "redirect:/vehiculeHires";
    }

}
