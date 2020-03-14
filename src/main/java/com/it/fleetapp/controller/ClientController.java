package com.it.fleetapp.controller;

import com.it.fleetapp.models.Client;
import com.it.fleetapp.models.Country;
import com.it.fleetapp.models.State;
import com.it.fleetapp.services.ClientService;
import com.it.fleetapp.services.CountryService;
import com.it.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/clients")
    public String getClients(Model model) {

        model.addAttribute("countries", countryService.getCountries());
        model.addAttribute("states", stateService.getStates());
        model.addAttribute("clients", clientService.getClients());

        return "client";
    }

    @PostMapping("/clients/addNew")
    public String addNewClient(Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id) {
        return clientService.findClientById(id);
    }

    @RequestMapping(value="clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.deleteClient(id);
        return "redirect:/clients";
    }

}
