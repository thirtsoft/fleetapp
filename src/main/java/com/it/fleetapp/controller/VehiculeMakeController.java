package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeMake;
import com.it.fleetapp.services.VehiculeMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeMakeController {

    @Autowired
    private VehiculeMakeService vehiculeMakeService;

    @GetMapping("/vehiculeMakes")
    public String getVehiculeMakes(Model model) {

        List<VehiculeMake> vehiculeMakeList = vehiculeMakeService.getVehiculeMakes();
        model.addAttribute("vehiculeMakes", vehiculeMakeList);

        return "vehiculeMake";
    }

    @PostMapping("/vehiculeMakes/addNew")
    public String addNewVehiculeMake(VehiculeMake vehiculeMake) {
        vehiculeMakeService.saveVehiculeMake(vehiculeMake);
        return "redirect:/vehiculeMakes";
    }

    @RequestMapping("vehiculeMakes/findById")
    @ResponseBody
    public Optional<VehiculeMake> findById(Integer id) {
        return vehiculeMakeService.findVehiculeMakeById(id);
    }

    @RequestMapping(value="vehiculeMakes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeMake vehiculeMake) {
        vehiculeMakeService.saveVehiculeMake(vehiculeMake);
        return "redirect:/vehiculeMakes";
    }

    @RequestMapping(value="vehiculeMakes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeMakeService.deleteVehiculeMake(id);
        return "redirect:/vehiculeMakes";
    }

}
