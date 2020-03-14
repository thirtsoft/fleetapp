package com.it.fleetapp.controller;

import com.it.fleetapp.models.Contact;
import com.it.fleetapp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactservice;

    @GetMapping("/contacts")
    public String getContacts(Model model) {

        model.addAttribute("contacts", contactservice.getContacts());

        return "contact";
    }

    @PostMapping("/contacts/addNew")
    public String addNewContact(Contact contact) {
        contactservice.saveContact(contact);
        return "redirect:/contacts";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(Integer id) {
        return contactservice.findContactById(id);
    }

    @RequestMapping(value="contacts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactservice.saveContact(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactservice.deleteContact(id);
        return "redirect:/contacts";
    }


}
