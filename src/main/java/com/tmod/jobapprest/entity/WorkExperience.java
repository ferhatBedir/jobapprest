package com.tmod.jobapprest.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
@Entity(name = "work_experince")
public class WorkExperience {


    @Column(name = "work_experience_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = false)
    @Size(max = 255)
    private String companyName;


    @Column(nullable = false)
    @Size(max = 255)
    private String title;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_app_form_id", nullable = false)
    private JobApplicationForm form;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobApplicationForm getForm() {
        return form;
    }

    public void setForm(JobApplicationForm form) {
        this.form = form;
    }
}
