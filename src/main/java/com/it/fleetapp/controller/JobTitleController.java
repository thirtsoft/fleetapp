package com.it.fleetapp.controller;

import com.it.fleetapp.models.JobTitle;
import com.it.fleetapp.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/jobTitles")
    public String getlocations(Model model) {

        List<JobTitle> jobTitlesList = jobTitleService.getJobTitles();
        model.addAttribute("jobTitles", jobTitlesList);

        return "jobTitle";
    }

    @PostMapping("/jobTitles/addNew")
    public String addNewJobTitle(JobTitle jobTitle) {
        jobTitleService.saveJobTitle(jobTitle);
        return "redirect:/jobTitles";
    }

    @RequestMapping("jobTitles/findById")
    @ResponseBody
    public Optional<JobTitle> findById(Integer id) {
        return jobTitleService.findJobTitleById(id);
    }

    @RequestMapping(value="jobTitles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(JobTitle jobTitle) {
        jobTitleService.saveJobTitle(jobTitle);
        return "redirect:/jobTitles";
    }

    @RequestMapping(value="jobTitles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        jobTitleService.deleteJobTitle(id);
        return "redirect:/jobTitles";
    }

}
