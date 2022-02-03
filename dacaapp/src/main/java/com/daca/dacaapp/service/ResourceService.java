package com.daca.dacaapp.service;

import com.daca.dacaapp.model.Resource;
import com.daca.dacaapp.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ResourceService {
    private ResourceRepository resourceRepository;
    private static final Logger LOGGER = Logger.getLogger(ResourceService.class.getName());

    @Autowired
    public void setResourceRepository(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> getResources(){
        LOGGER.info("calling getResources method from service");
        return  resourceRepository.findAll();
    }

    public List<Resource> getGrants() {
        LOGGER.info("calling getGrants from resource service");
        return  resourceRepository.findAll();
    }

    public Optional<Resource> getGrants(Long grantArticleId){
        LOGGER.info("Finding Grants ID through resource Service");
        Optional<Resource> grants = resourceRepository.findById(grantArticleId);
        return  grants;
    }

    public List<Resource> getLawyers() {
        LOGGER.info("calling getLawyers from resource service");
        return  resourceRepository.findAll();
    }

    public Optional<Resource> getLawyers(Long lawyerArticleId){
        LOGGER.info("Finding lawyer ID through resource service");
        Optional<Resource>lawyers = resourceRepository.findById(lawyerArticleId);
        return lawyers;
    }

    public List<Resource> getClinics(){
        LOGGER.info("Calling getClinics from resource Service");
        return  resourceRepository.findAll();
    }

    public Optional<Resource> getClinics(Long clinicArticleId){
        LOGGER.info("Finding Clinic ID through resource Service");
        Optional<Resource> clinics = resourceRepository.findById(clinicArticleId);
        return clinics;
    }

    public List<Resource> getNews(){
        LOGGER.info("Calling getNews from ResourceService");
        return  resourceRepository.findAll();
    }

    public Optional<Resource> getNews(Long newsArticleId){
        LOGGER.info("Calling getNews from ResourceService");
        Optional<Resource> news = resourceRepository.findById(newsArticleId);
        return news;
    }



}