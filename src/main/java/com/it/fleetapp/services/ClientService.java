package com.it.fleetapp.services;

import com.it.fleetapp.models.Client;
import com.it.fleetapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;;

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Optional<Client> findClientById(int id) {
        return clientRepository.findById(id);
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

}
