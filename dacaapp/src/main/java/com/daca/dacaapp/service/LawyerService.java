package com.daca.dacaapp.service;

import com.daca.dacaapp.model.Lawyer;
import com.daca.dacaapp.repository.LawyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class LawyerService {
    private LawyerRepository lawyerRepository;
    private static final Logger LOGGER = Logger.getLogger(LawyerRepository.class.getName());

    @Autowired
    public void setLawyerRepository(LawyerRepository lawyerRepository) {
        this.lawyerRepository = lawyerRepository;
    }

    public List<Lawyer> getLawyers(){
        LOGGER.info("Calling getLawyers from LawyerService");
        return lawyerRepository.findAll();
    }

    public Optional<Lawyer> getLawyers(Long lawyerArticleId){
        LOGGER.info("Finding lawyerArticleId from LawyerService");
        Optional<Lawyer> Id = lawyerRepository.findById(lawyerArticleId);
        return Id;
    }

    public Optional<Lawyer> getLawyers(String lawyerArticleAuthor){
        LOGGER.info("Calling getLawyerArticleAuthor from LawyerService");
        Optional<Lawyer> author = lawyerRepository.findById(Long.valueOf(lawyerArticleAuthor));
        return author;
    }

    public Optional<Lawyer> getLawyerArticleDate( String lawyerArticleDate){
        LOGGER.info("Calling getLawyerArticleDate from LawyerService");
        Optional<Lawyer> date = lawyerRepository.findById(Long.valueOf(lawyerArticleDate));
        return date;
    }

}
