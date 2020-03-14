package com.it.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculeMouvementController {
    @GetMapping("/vehiculeMouvements")
    public String getvehiculeMouvements() {
        return  "vehiculeMouvement";
    }
}
