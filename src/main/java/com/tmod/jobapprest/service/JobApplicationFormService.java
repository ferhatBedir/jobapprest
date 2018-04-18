package com.tmod.jobapprest.service;

import com.tmod.jobapprest.repository.JobApplicationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
@Service
public class JobApplicationFormService {


    private JobApplicationFormRepository repository;


    @Autowired
    public JobApplicationFormService(JobApplicationFormRepository repository) {
        this.repository = repository;
    }
}
