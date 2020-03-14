package com.it.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeHireController {
    @GetMapping("/vehiculeHires")
    public String getVehiculeHires() {
        return  "vehiculeHire";
    }
}
