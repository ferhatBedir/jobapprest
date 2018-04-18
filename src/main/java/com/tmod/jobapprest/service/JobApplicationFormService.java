package com.tmod.jobapprest.service;

import com.tmod.jobapprest.entity.ApprovalStatus;
import com.tmod.jobapprest.entity.JobApplicationForm;
import com.tmod.jobapprest.repository.JobApplicationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<JobApplicationForm> getAllForms() {
        return repository.findAll();
    }

    public JobApplicationForm getFormByVatNum(String vatNum) {
        return repository.findFirstByVatNumEqualsIgnoreCase(vatNum);
    }

    public void addForm(JobApplicationForm form) {
        form.setApprovalStatus(ApprovalStatus.PENDING);

        if (form.getVatNum() == null || getFormByVatNum(form.getVatNum()) != null) {
            throw new NullPointerException("vatnum null");
        }

        repository.save(form);
    }

    public List<JobApplicationForm> search(String searchKey) {
        return repository.findByNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrEmailContainsIgnoreCase(
                searchKey,
                searchKey,
                searchKey
        );
    }
}
