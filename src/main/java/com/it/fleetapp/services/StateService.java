package com.it.fleetapp.services;

import com.it.fleetapp.models.State;
import com.it.fleetapp.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates() {
        return stateRepository.findAll();
    }

    public void saveState(State state) {
        stateRepository.save(state);
    }

    public Optional<State> findStateById(int id) {
        return stateRepository.findById(id);
    }

    public void deleteState(Integer id) {
        stateRepository.deleteById(id);
    }


}
