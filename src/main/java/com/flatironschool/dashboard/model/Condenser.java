package com.flatironschool.dashboard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="condenser")
public class Condenser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "condenserId")
    private String condenserId;
    @Column(name = "image")
    private String image;
    @Column(name = "dateAdded")
    private LocalDateTime dateAdded;

    public String getName() {
        return name;
    }

    public String getCondenserId() {
        return condenserId;
    }

    public String getImage() {
        return image;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public Condenser() {}

    public Condenser(String name, String condenserId, String image, LocalDateTime dateAdded) {
        this.name = name;
        this.condenserId = condenserId;
        this.image = image;
        this.dateAdded = dateAdded;
    }
}
