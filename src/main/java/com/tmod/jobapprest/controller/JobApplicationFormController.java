package com.tmod.jobapprest.controller;

import com.tmod.jobapprest.entity.JobApplicationForm;
import com.tmod.jobapprest.service.JobApplicationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
@RestController
public class JobApplicationFormController {

    private JobApplicationFormService formService;


    @Autowired
    public JobApplicationFormController(JobApplicationFormService formService) {
        this.formService = formService;
    }


    @PostMapping("/save")
    public void addForm(@RequestBody JobApplicationForm form) {
        formService.addForm(form);
    }


    @GetMapping("/findall")
    public List<JobApplicationForm> getAllForms() {
        return formService.getAllForms();
    }

    @GetMapping("/search")
    public JobApplicationForm search(@RequestParam(name = "vatnum") String vatNum) {
        return formService.getFormByVatNum(vatNum);
    }


    @GetMapping("/detailedsearch")
    public List<JobApplicationForm> detailedSearch(@RequestParam("searchkey") String searchKey) {
        return formService.search(searchKey);
    }
}
