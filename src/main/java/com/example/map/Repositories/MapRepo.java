package com.example.map.Repositories;

import com.example.map.Models.MapDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepo extends JpaRepository <MapDB, Integer> {

}
