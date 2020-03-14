package com.it.fleetapp.controller;

import com.it.fleetapp.models.Country;
import com.it.fleetapp.models.Location;
import com.it.fleetapp.models.State;
import com.it.fleetapp.models.VehiculeStatus;
import com.it.fleetapp.services.CountryService;
import com.it.fleetapp.services.LocationService;
import com.it.fleetapp.services.StateService;
import com.it.fleetapp.services.VehiculeStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeStatusController {


    @Autowired
    private VehiculeStatusService vehiculeStatusService;


    @GetMapping("/vehiculeStatus")
    public String getVehiculeStatus(Model model) {

        List<VehiculeStatus> vehiculeStatusList = vehiculeStatusService.getVehiculeStatus();
        model.addAttribute("vehiculeStatus", vehiculeStatusList);

        return "vehiculeStatus";
    }

    @PostMapping("/vehiculeStatus/addNew")
    public String addNewVehiculeStatus(VehiculeStatus vehiculeStatus) {
        vehiculeStatusService.saveVehiculeStatus(vehiculeStatus);
        return "redirect:/vehiculeStatus";
    }

    @RequestMapping("vehiculeStatus/findById")
    @ResponseBody
    public Optional<VehiculeStatus> findById(Integer id) {
        return vehiculeStatusService.findVehiculeStatusById(id);
    }

    @RequestMapping(value="vehiculeStatus/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeStatus vehiculeStatus) {
        vehiculeStatusService.saveVehiculeStatus(vehiculeStatus);
        return "redirect:/vehiculeStatus";
    }

    @RequestMapping(value="vehiculeStatus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeStatusService.deleteVehiculeStatus(id);
        return "redirect:/vehiculeStatus";
    }


}
