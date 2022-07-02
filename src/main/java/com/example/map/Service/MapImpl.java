package com.example.map.Service;

import com.example.map.Models.MapDB;
import com.example.map.Repositories.MapRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapImpl implements MapService  {

    @Autowired
    public MapRepo mapRepo;

    @Override
    public MapDB savePosition(MapDB mapDB) {
        return mapRepo.save(mapDB);
    }

    @Override
    public List<MapDB> getAllPositions() {
        return mapRepo.findAll();
    }
}
