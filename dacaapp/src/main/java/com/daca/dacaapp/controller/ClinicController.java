package com.daca.dacaapp.controller;

import com.daca.dacaapp.model.Clinic;
import com.daca.dacaapp.repository.ClinicRepository;
import com.daca.dacaapp.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api/resource")
public class ClinicController {

    private ClinicRepository clinicRepository;
    private ClinicService clinicService;
    private static final Logger LOGGER = Logger.getLogger(ResourceController.class.getName());

    @Autowired
    public void  setClinicRepository(ClinicRepository clinicRepository){
        this.clinicRepository = clinicRepository;
    }

    @Autowired
    public void setClinicService(ClinicService clinicService){

        this.clinicService = clinicService;
    }

    //https://localhost:9092/api/resource/clinics
    @GetMapping(path = "/clinics")
    public List<Clinic> getClinics(){
        LOGGER.info("Calling getClinics from ClinicController");
        return clinicService.getClinics();
    }

    //https://localhost:9092/api/resource/1
    @GetMapping(path="/clinics/{clinicArticleId}")
    public Optional<Clinic> getClinicArticleId(@PathVariable Long clinicArticleId){
        LOGGER.info("Calling getClinicArticleId from ClinicController");
        return clinicService.getClinics(clinicArticleId);
    }
    //https://localhost:9092/api/resource/clinicArticleAuthor
    @GetMapping(path = "/clinics/{clinicArticleAuthor}")
    public Optional<Clinic> getClinicArticleAuthor(@PathVariable String clinicArticleAuthor){
        LOGGER.info("Calling getClinicArticleAuthor from ClinicController");
        return clinicService.getClinicArticleAuthor(Long.valueOf(clinicArticleAuthor));
    }
    //https://localhost:9092/api/resource/clinicArticleDate
    @GetMapping(path = "/clinics/{clinicArticleDate}")
    public Optional<Clinic> getClinicArticleDate(@PathVariable String clinicArticleDate){
        LOGGER.info("Calling getClinicArticleDate");
        return clinicService.getClinicArticleDate(Long.valueOf(clinicArticleDate));
    }
    //https://localhost:9092/api/resource/clinicArticleURL
    @GetMapping(path = "/clinics/{clinicArticleURL}")
    public Optional<Clinic> getClinicArticleURL(@PathVariable String clinicArticleURL){
        LOGGER.info("Calling getClinicArticleURL");
        return clinicService.getClinicArticleURL(Long.valueOf(clinicArticleURL));
    }



}
