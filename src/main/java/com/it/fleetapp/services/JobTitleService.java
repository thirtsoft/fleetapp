package com.it.fleetapp.services;

import com.it.fleetapp.models.JobTitle;
import com.it.fleetapp.repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> getJobTitles() {
        return jobTitleRepository.findAll();
    }

    public void saveJobTitle(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

    public Optional<JobTitle> findJobTitleById(int id) {
        return jobTitleRepository.findById(id);
    }

    public void deleteJobTitle(Integer id) {
        jobTitleRepository.deleteById(id);
    }
}
