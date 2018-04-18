package com.tmod.jobapprest.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by gulteking on 18.04.2018 with love.
 */
@Entity(name = "personal_details")
public class PersonalDetails {


    @Column(name = "personal_details_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date birthDate;

    @Size(max = 255)
    private String address;

    private Gender gender;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_app_form_id", nullable = false)
    private JobApplicationForm form;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public JobApplicationForm getForm() {
        return form;
    }

    public void setForm(JobApplicationForm form) {
        this.form = form;
    }
}
