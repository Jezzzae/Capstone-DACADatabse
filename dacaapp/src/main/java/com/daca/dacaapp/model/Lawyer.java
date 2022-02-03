package com.daca.dacaapp.model;

import javax.persistence.*;

@Entity
@Table(name = "lawyers")
public class Lawyer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String author;

    @Column
    private String date;

    @Column
    private String url;

    public Lawyer(Long id, String author, String date, String url) {
        this.id = id;
        this.author = author;
        this.date = date;
        this.url = url;
    }

    public Lawyer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
