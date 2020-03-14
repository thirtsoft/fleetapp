package com.it.fleetapp.services;

import com.it.fleetapp.models.Contact;
import com.it.fleetapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    public Optional<Contact> findContactById(int id) {
        return contactRepository.findById(id);
    }

    public void deleteContact(Integer id) {
        contactRepository.deleteById(id);
    }
}
