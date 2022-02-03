package com.daca.dacaapp.controller;

import com.daca.dacaapp.model.Grant;
import com.daca.dacaapp.repository.GrantRepository;
import com.daca.dacaapp.repository.ResourceRepository;
import com.daca.dacaapp.service.GrantService;
import com.daca.dacaapp.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(path="/api/resource")
public class GrantController {

    private GrantRepository grantRepository;
    private GrantService grantService;
    private static final Logger LOGGER = Logger.getLogger(ResourceController.class.getName());

    @Autowired
    public void  setGrantRepository(GrantRepository grantRepository){
        this.grantRepository = grantRepository;
    }

    @Autowired
    public void setGrantService(GrantService grantService){

        this.grantService = grantService;
    }


    //https://localhost:9092/api/grants
    @GetMapping("/resource/grants")
    public List<Grant> getGrants()
    {
        LOGGER.info("Calling getGrants in GrantController");
        return  grantService.getGrants();
    }

    @GetMapping(path = "/resource/grants/{grantArticleId}")
    public Optional<Grant> getGrantArticleId(@PathVariable Long grantArticleId){
        LOGGER.info("Calling getGrantArticleId from GrantController");
        Optional<Grant>id = grantRepository.findById(grantArticleId);
        return grantService.getGrants(grantArticleId);
    }

    @GetMapping(path = "/resource/grants/{grantArticleAuthor}")
    public Optional<Grant> getGrantArticleAuthor(@PathVariable String grantArticleAuthor){
        LOGGER.info("Calling getGrantAuthor from GrantController");
        return  grantService.getGrantsArticleAuthor(Long.valueOf(grantArticleAuthor));
    }

    @GetMapping(path = "/resource/grants/{grantArticleDate}")
        public  Optional <Grant> getGrantArticleDate(@PathVariable String grantArticleDate){
        LOGGER.info("Calling getGrantArticleDate from Controller");
        return grantService.getGrantsArticleDate(Long.valueOf(grantArticleDate));
    }

    @GetMapping(path = "/resource/grants/{grantArticleURL}")
    public  Optional<Grant> getGrantArticleURL(@PathVariable String grantArticleURL){
    LOGGER.info("Calling getGrantArticleURL from GrantController");
    return grantService.getGrantsArticleURL(Long.valueOf(grantArticleURL));
    }
}
