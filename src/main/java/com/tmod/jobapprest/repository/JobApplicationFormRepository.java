package com.tmod.jobapprest.repository;

import com.tmod.jobapprest.entity.JobApplicationForm;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
public interface JobApplicationFormRepository extends CrudRepository<JobApplicationForm, Long> {

    List<JobApplicationForm> findAll();

    JobApplicationForm findFirstByVatNumEqualsIgnoreCase(String vatNum);


    List<JobApplicationForm> findByNameContainsIgnoreCaseOrSurnameContainsIgnoreCaseOrEmailContainsIgnoreCase(String searchKey, String searchKey1, String searchKey2);
}
