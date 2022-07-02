package com.example.map.Controllers;

import com.example.map.Models.MapDB;
import com.example.map.Service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapModel")
@CrossOrigin
public class MapController {

    @Autowired
    private MapService mapService;

    @PostMapping("/add")
    public void add(@RequestBody MapDB mapDB){
    mapService.savePosition(mapDB);
    }

    @GetMapping("/showPositions")
    public List<MapDB> getAllPositions(){
        return mapService.getAllPositions();
    }

}
