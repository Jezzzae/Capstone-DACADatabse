package com.daca.dacaapp.controller;

import com.daca.dacaapp.model.Resource;
import com.daca.dacaapp.repository.ResourceRepository;
import com.daca.dacaapp.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class ResourceController {

    private ResourceRepository resourceRepository;
    private ResourceService resourceService;
    private static final Logger LOGGER = Logger.getLogger(ResourceController.class.getName());

    @Autowired
    public void  setResourceRepository(ResourceRepository resourceRepository){
    this.resourceRepository = resourceRepository;
    }

    @Autowired
    public void setResourceService(ResourceService resourceService){

        this.resourceService = resourceService;
    }

    @GetMapping("/resources")
    public List<Resource> getResources(){
        LOGGER.info("calling getResources method from controller");
        return  resourceService.getResources();
    }

    //http:localhost:9092/api/resources/grants
    @GetMapping(path="/resources/grants")
    public List<Resource> getGrants() {
        LOGGER.info("calling getGrants from resource controller");
        return  resourceService.getGrants();
    }

    //http:localhost:9092/api/resources/grants/1
    @GetMapping(path="/resources/grants/{grantArticleId}")
    public Optional<Resource> getGrantArticleId(@PathVariable Long grantArticleId){
        LOGGER.info("calling getGrantArticleId from resource controller");
        return  resourceService.getGrants(grantArticleId);
    }

    //https:localhost:9092/api/resources/lawyers
    @GetMapping("/resources/lawyers")
    public List<Resource> getLawyers() {
        LOGGER.info("calling getLawyers from resource controller");
        return  resourceService.getLawyers();
    }

    //http:localhost:9092/api/resources/lawyers/1
    @GetMapping(path="/resources/lawyers/{lawyerArticleId}")
    public  Optional<Resource> getLawyerArticleId(@PathVariable Long lawyerArticleId){
        LOGGER.info("Calling getLawyerArticleId from resource controller");
        return resourceService.getLawyers(lawyerArticleId);
    }

    //https:localhost:9092/api/clinics
    @GetMapping("/resources/clinics")
    public List<Resource> getClinics(){
        LOGGER.info("Calling getClinics from resource Controller");
        return  resourceService.getClinics();
    }

    //http:localhost:9092/api/clinics/1
    @GetMapping(path="/resources/clinics/{clinicArticleId}")
    public Optional<Resource> getClinicArticleId(@PathVariable Long clinicArticleId){
        return resourceService.getClinics(clinicArticleId);
    }

    //https:localhost:9092/api/resources/news
    @GetMapping("/resources/news")
    public List<Resource> getNews(){
        LOGGER.info("Calling getNews from ResourceController");
        return  resourceService.getNews();
    }

    //http:localhost:9092/api/resources/news/1
    @GetMapping(path="/resources/news/{newsArticleId}")
    public Optional<Resource> getNewsArticleId(@PathVariable Long newsArticleId){
       LOGGER.info("Finding Clinic ID through ResourceController");
        return resourceService.getNews(newsArticleId);
    }
    // END OF RESOURCES ARTICLE ID'S

    //BEGINNING OF ARTICLE AUTHOR'S






}
