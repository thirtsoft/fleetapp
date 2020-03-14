package com.it.fleetapp.controller;

import com.it.fleetapp.models.VehiculeModel;
import com.it.fleetapp.services.VehiculeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiculeModelController {

    @Autowired
    private VehiculeModelService vehiculeModelService;

    @GetMapping("/vehiculeModels")
    public String getVehiculeModels(Model model) {

        List<VehiculeModel> vehiculeModelList = vehiculeModelService.getVehiculeModels();
        model.addAttribute("vehiculeModels", vehiculeModelList);

        return "vehiculeModel";
    }

    @PostMapping("/vehiculeModels/addNew")
    public String addNewVehiculeModel(VehiculeModel vehiculeModel) {
        vehiculeModelService.saveVehiculeModel(vehiculeModel);
        return "redirect:/vehiculeModels";
    }

    @RequestMapping("vehiculeModels/findById")
    @ResponseBody
    public Optional<VehiculeModel> findById(Integer id) {
        return vehiculeModelService.findVehiculeModelById(id);
    }

    @RequestMapping(value="vehiculeModels/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehiculeModel vehiculeModel) {
        vehiculeModelService.saveVehiculeModel(vehiculeModel);
        return "redirect:/vehiculeModels";
    }

    @RequestMapping(value="vehiculeModels/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehiculeModelService.deleteVehiculeModel(id);
        return "redirect:/vehiculeModels";
    }

}
