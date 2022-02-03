package com.daca.dacaapp.service;

import com.daca.dacaapp.model.News;
import com.daca.dacaapp.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class NewsService {
    private NewsRepository newsRepository;
    private  static final Logger LOGGER = Logger.getLogger(NewsService.class.getName());

    @Autowired
    public void setNewsRepository(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    public List<News> getNews(){
        LOGGER.info("Calling getNews method from NewsService");
        return newsRepository.findAll();
    }


    public Optional<News> getNews(Long newsArticleId){
        LOGGER.info("Finding NewsArticleId from NewsController");
        Optional<News> news = newsRepository.findById(newsArticleId);
        return news;
    }

    public Optional<News> getNews(String newsArticleAuthor){ //why can't I call on getNewsArticleAuthor method
        LOGGER.info("Calling getNewsArticleAuthor from NewsService");
        Optional<News>author = Optional.ofNullable(newsRepository.findById(newsArticleAuthor));
        return author;
    }

    public Optional<News> getNewsArticleDate(String newsArticleDate){//cant use getNews anymore starting from here
        LOGGER.info("Calling getNewsArticleDate from NewsService");
        Optional<News>date = Optional.ofNullable(newsRepository.findById(newsArticleDate));
        return date;
    }

    public Optional<News>getNewsArticleURL(String newsArticleURL){
        LOGGER.info("Calling getNewsArticleUrl from NewsService");
        Optional<News>url= Optional.ofNullable(newsRepository.findById(newsArticleURL));
        return url;
    }

}
