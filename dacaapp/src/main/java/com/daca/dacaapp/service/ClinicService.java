package com.daca.dacaapp.service;

import com.daca.dacaapp.model.Clinic;
import com.daca.dacaapp.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ClinicService {
    private ClinicRepository clinicRepository;
    private static final Logger LOGGER = Logger.getLogger(ClinicService.class.getName());

    @Autowired
    public void setClinicRepository(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    public List<Clinic> getClinics(){
        LOGGER.info("Calling getClinics from ClinicService");
        return clinicRepository.findAll();
    }

    public Optional<Clinic> getClinics (Long clinicArticleId){
        LOGGER.info("Finding ClinicID through ClinicService");
        Optional<Clinic> id = clinicRepository.findById(clinicArticleId);
        return  id;
    }

    public Optional<Clinic> getClinicArticleAuthor (Long clinicArticleAuthor){
        LOGGER.info("Finding ClinicAuthor through ClinicService");
        Optional<Clinic> author = clinicRepository.findById(clinicArticleAuthor);
        return  author;
    }

    public Optional<Clinic> getClinicArticleDate (Long clinicArticleDate){
        LOGGER.info("Finding ClinicDate through ClinicService");
        Optional<Clinic> date = clinicRepository.findById(clinicArticleDate);
        return  date;
    }

    public Optional<Clinic> getClinicArticleURL (Long clinicArticleURL){
        LOGGER.info("Finding ClinicURL through ClinicService");
        Optional<Clinic> url = clinicRepository.findById(clinicArticleURL);
        return  url;
    }


}
