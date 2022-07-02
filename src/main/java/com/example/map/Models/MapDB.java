package com.example.map.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MapDB {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer Id;
    public Double lng;
    public Double lat;
    public String description;
}
