package com.daca.dacaapp.model;

import javax.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Resource (){

    }

    public Resource(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
