package com.example.map.Service;

import com.example.map.Models.MapDB;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapService {
    public MapDB savePosition (MapDB mapDB);
    public List<MapDB> getAllPositions();
}
