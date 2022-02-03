package com.daca.dacaapp.controller;

import com.daca.dacaapp.model.Lawyer;
import com.daca.dacaapp.repository.LawyerRepository;
import com.daca.dacaapp.service.LawyerService;
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
public class LawyerController {

    private LawyerRepository lawyerRepository;
    private LawyerService lawyerService;
    private static final Logger LOGGER = Logger.getLogger(ResourceController.class.getName());

    @Autowired
    public void  setLawyerRepository(LawyerRepository lawyerRepository){
        this.lawyerRepository = lawyerRepository;
    }

    @Autowired
    public void setLawyerService(LawyerService lawyerService){
        this.lawyerService = lawyerService;
    }

    //https://localhost:9092/api/resource/lawyers
    @GetMapping(path = "/lawyers")
    public List<Lawyer> getLawyers(){
        LOGGER.info("Calling getLawyers from LawyerController");
        return lawyerService.getLawyers();
    }

    //https://localhost:9092/api/resource/lawyers/1
    @GetMapping(path = "/lawyers/{lawyerArticleId}")
    public Optional<Lawyer> getLawyerArticleId(@PathVariable Long lawyerArticleId){
        LOGGER.info("Calling getLawyerArticleId from LawyerController");
        return lawyerService.getLawyers(lawyerArticleId);
    }
    //https://localhost:9092/api/resource/lawyers/lawyerArticleAuthor
    @GetMapping(path = "/lawyers/{lawyerArticleAuthor}")
    public Optional<Lawyer> getLawyerArticleAuthor(@PathVariable String lawyerArticleAuthor){
        LOGGER.info("Calling getLawyerArticleAuthor from LawyerController");
        return lawyerService.getLawyers(lawyerArticleAuthor);
    }
    //https://localhost:9092/api/resource/lawyers/lawyerArticleDate
    @GetMapping(path = "/lawyers/{lawyerArticleDate}")
    public Optional<Lawyer> getLawyerArticleDate(@PathVariable String lawyerArticleDate){
        LOGGER.info("Calling getLawyerArticleDate from LawyerController");
        return lawyerService.getLawyers(lawyerArticleDate);
    }

    //https://localhost:9092/api/resource/lawyers/lawyerArticleURL
    @GetMapping(path = "/lawyers/{lawyerArticleURL}")
    public Optional<Lawyer> getLawyerArticleURL(@PathVariable String lawyerArticleURL){
        LOGGER.info("Calling getLawyerArticleURL");
        return lawyerService.getLawyers(lawyerArticleURL);
    }
}
